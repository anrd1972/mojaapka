package anra.mojaapka.controllers;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import anra.mojaapka.models.User;
import anra.mojaapka.service.UserService;

/**
 * 
 * @author Andrzej Radziejewski
 *
 */

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
		userList = userService.findAll();
				
		for (User users : userList) {
			int numerRoli = users.getRoles().iterator().next().getId();
			
			if (numerRoli == 1) {
				users.setRolaInt(numerRoli);
			} else if (numerRoli == 2) {
				users.setRolaInt(numerRoli);
			}
		}
		
		model.addAttribute("userList", userList);
		
		return "admin/users";
	}
	
}
