package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.LoginService;

@Controller
@SessionAttributes("name")
public class HomeController {
	
	@Autowired
    LoginService service;

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "home";
    }

    @RequestMapping(value="/home", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "home";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
 
	}

}
