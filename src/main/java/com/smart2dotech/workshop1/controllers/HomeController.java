package com.smart2dotech.workshop1.controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@PostMapping("/result")
	@ResponseBody
	
	public String result(@RequestParam("nom") String n, @RequestParam("email") String e)
	{
		return n + "ok" + e;}
	@RequestMapping("/information") // ce que je tape dans l'url
	public String info(Model model)
	{
		ArrayList<String> names= new ArrayList<>();
		names.add("OCA");
		names.add("OCP");
		names.add("spring");
		model.addAttribute("List", names);
		String formation="formation fullstack00";
		System.out.println("hoxddsdsdoo");
		model.addAttribute("test",formation);
		return "home/info";  // le nom de la vue sous template /home
	}
	
	@RequestMapping("/affichage")
	public String affiche()
	{
		System.out.println("hooo");
		return "home/affichage";
	}

}