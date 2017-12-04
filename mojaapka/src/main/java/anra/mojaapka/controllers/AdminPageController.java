package anra.mojaapka.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import anra.mojaapka.models.User;
import anra.mojaapka.service.UserService;

@Controller
public class AdminPageController {

	@Autowired
	private UserService userService;

	@GET
	@RequestMapping(value = "/admin/main")
	@Secured(value = { "ROLE_ADMIN" })
	public String showAdminPanel() {
		return "admin/admin";
	}

	@GET
	@RequestMapping(value = "/admin/users")
	@Secured(value = { "ROLE_ADMIN" })
	public String getAllUsers(Model model) {

		List<User> userList = null;
		userList = getAllUsers();
		model.addAttribute("userList", userList);

		return "admin/users";
	}

	@GET
	@RequestMapping(value = "/admin/edit/{id}")
	@Secured(value = { "ROLE_ADMIN" })
	public String getUserToEdit(@PathVariable("id") String id, Model model) {

		User user = new User();
		int userId = Integer.parseInt(id);
		user = userService.findUserById(userId);

		Map<Integer, String> roleMap = new HashMap<Integer, String>();
		roleMap = prepareRoleMap();
		model.addAttribute("roleMap", roleMap);

		int rola = user.getRoles().iterator().next().getId();
		user.setRolaInt(rola);

		model.addAttribute("roleMap", roleMap);
		model.addAttribute("user", user);

		return "admin/useredit";
	}

	@POST
	@RequestMapping(value = "/admin/update")
	@Secured(value = "ROLE_ADMIN")
	public String updateUser(Model model, @Valid User user, BindingResult result) {

		String returnPage = null;
		String rola = null;

		if (user.getRolaInt() == 1) {
			rola = "ROLE_ADMIN";
		} else {
			rola = "ROLE_USER";
		}

		if (result.hasErrors()) {
			Map<Integer, String> roleMap = new HashMap<Integer, String>();
			roleMap = prepareRoleMap();
			model.addAttribute("roleMap", roleMap);

			returnPage = "admin/useredit";
		} else {
			userService.updateUser(rola, user);

			List<User> userList = null;
			userList = getAllUsers();

			model.addAttribute("userList", userList);
			returnPage = "admin/users";
		}
		return returnPage;
	}

	// pobranie wszystkich użytkowników
	public List<User> getAllUsers() {
		List<User> userList = null;
		userList = userService.findAll();
		for (User users : userList) {
			int numerRoli = users.getRoles().iterator().next().getId();

			if (numerRoli == 1) {
				users.setRolaInt(numerRoli);
			} else if (numerRoli == 2) {
				users.setRolaInt(numerRoli);
			}
		}

		return userList;
	}

	// przygotowanie mapy ról
	public Map<Integer, String> prepareRoleMap() {
		Map<Integer, String> roleMap = new HashMap<Integer, String>();
		roleMap.put(1, "Administrator");
		roleMap.put(2, "Użytkownik");
		return roleMap;
	}

}
