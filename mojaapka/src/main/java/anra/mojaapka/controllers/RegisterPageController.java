package anra.mojaapka.controllers;
/**
 * @author Andrzej Radziejewski
 * @since 0.1
 */
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import anra.mojaapka.models.User;
import anra.mojaapka.service.UserService;

@Controller
public class RegisterPageController {

	@Autowired
	private UserService userService;

	@GET
	@RequestMapping(value = "/register")
	public String showRegisterForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}

	@POST
	@RequestMapping(value = "/adduser")
	public String registerUserAction(@Valid User user, BindingResult result, Model model) {
		String returnPage = null;

		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			result.rejectValue("email", "error.user",
					"Podany adres email jest już zarejestrowany w bazie");
		}
		if (result.hasErrors()) {
			returnPage = "register";
		} else {
			userService.saveUser(user);
			model.addAttribute("message", "Rejestracja przebiegła pomyślnie. Możesz się zalogować");
			model.addAttribute("user", new User());
			
			returnPage = "register";
		}
		return returnPage;
	}

}
