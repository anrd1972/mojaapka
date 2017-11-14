package anra.mojaapka.controllers;

import javax.ws.rs.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
	
	@GET
	@RequestMapping("/")
	public String showMainPage() {
		return "index";
	}

}
