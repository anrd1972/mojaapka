package anra.mojaapka.controllers;
/**
 * @author Andrzej Radziejewski
 * @since 0.1
 */
import javax.ws.rs.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {

	@GET
	@RequestMapping(value = "/login")
	public String showLoginPage() {
		return "login";
	}
	
	
}
