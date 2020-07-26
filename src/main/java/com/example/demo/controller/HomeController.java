package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
<<<<<<< HEAD:src/main/java/com/example/demo/controller/HomeController.java
	
	@RequestMapping("/")
	
=======
	@RequestMapping("/")
>>>>>>> 78e0d49550e4239b24d1601dfadad69a28bf063b:src/main/java/com/example/demo/HomeController.java
	public String home() {
		System.out.println("hi");
		return "home.jsp";
	}

}
