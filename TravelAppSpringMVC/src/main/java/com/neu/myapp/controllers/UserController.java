package com.neu.myapp.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Login", locale);
		return "login";
	}*/
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String register(Locale locale, Model model) {
		logger.info("Register", locale);
		return "register";
	}
	@RequestMapping(value = {"/profile"}, method = RequestMethod.GET)
	public String profile(Locale locale, Model model) {
		logger.info("Profile", locale);
		return "profile";
	}
	@RequestMapping(value = {"/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Home", locale);
		return "home";
	}
}
