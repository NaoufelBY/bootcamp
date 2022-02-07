package com.smart2dotech.workshop1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/information") // ce que je tape dans l'url
	public String info()
	{
		return "home/info";  // le nom de la vue sous template /home
	}
	
	@RequestMapping("/affichage")
	public String affiche()
	{
		System.out.println("hooo");
		return "home/affichage";
	}

}