package anra.mojaapka.controllers;

import javax.ws.rs.GET;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Andrzej Radziejewski
 *
 */

@Controller
public class AdminPageController {

	@GET
	@RequestMapping(value = "/admin/main")
	@Secured(value = { "ROLE_ADMIN" })
	public String showAdminPanel() {
		return "admin/admin";
	}
	
}
