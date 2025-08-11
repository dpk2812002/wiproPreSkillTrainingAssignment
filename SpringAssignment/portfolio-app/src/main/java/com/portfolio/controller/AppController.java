package com.portfolio.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "Deepak Kumar");
        model.addAttribute("about", "I am Deepak Kumar, a passionate Java full stack developer skilled in Core Java, Spring Boot, JSP, Servlets, HTML, CSS, JavaScript, MySQL, and REST APIs...");
        model.addAttribute("email", "mksdpkumar8@gmail.com");
        model.addAttribute("phone", "8976543210");
        model.addAttribute("location", "Bihar");

        model.addAttribute("skills", List.of(
                "Java (Core & Advanced), Spring Boot, Hibernate",
                "HTML5, CSS3, JavaScript, JSP, Servlets",
                "MySQL, JDBC, REST APIs",
                "Git, Maven, Eclipse, STS, PostMan",
                "Agile Methodology, Test-Driven Development, Unit Testing",
                "Microservices, Redis, AWS",
                "Thymeleaf, MVC Architecture"
        ));

        List<Map<String, String>> educationList = new ArrayList<>();
        educationList.add(Map.of("degree", "B.Tech", "institute", "UEM Kolkata", "years", "2020 – 2024", "cgpa", "8.43"));
       

        model.addAttribute("educationList", educationList);
		return "home";
	}
	
	@GetMapping("/about")
	public String getAbout(Model model) {
		
		model.addAttribute("title", "About Me");
        model.addAttribute("name", "Deepak Kumar");
        model.addAttribute("bio", "I have completed my B.Tech in CSE and am "
        		+ "passionate about learning new tools, frameworks, "
        		+ "and creating efficient backend and frontend systems.");
		return "about";
	}
	
	@GetMapping("/skills")
	public String getSkills(Model model) {
		List<String> skills = Arrays.asList(
		        "Java (Core & Advanced), Spring Boot, Hibernate",
		        "HTML5, CSS3, JavaScript, JSP, Servlets",
		        "MySQL, JDBC, REST APIs",
		        "Git, Maven, Eclipse, STS, PostMan",
		        "Agile Methodology, Test-Driven Development, Unit Testing",
		        "Microservices, Redis, AWS",
		        "Thymeleaf, MVC Architecture"
		    );

		    model.addAttribute("skills", skills);
		
		return "skills";
	}
	
	@GetMapping("/education")
	public String geteducation(Model model) {
		model.addAttribute("pageTitle", "My Education");

        List<Map<String, String>> educationList = new ArrayList<>();

        educationList.add(Map.of(
            "degree", "B.Tech",
            "institute", "UEM kolkata",
            "year", "2020 – 2024",
            "cgpa", "8.43"
        ));

       

        model.addAttribute("educationList", educationList);
		return "education";
	}
	
	@GetMapping("/contact")
	public String getContact(Model model) {
		model.addAttribute("pageTitle", "Contact Me");
        model.addAttribute("email", "abc@gmail.com");
        model.addAttribute("phone", "8976543210");
        model.addAttribute("location", "Bihar 841207");

        
		
		return "contact";
	}

}
