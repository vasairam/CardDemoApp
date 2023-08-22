package com.cg.CardDemoApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.LoginService;
import com.cg.CardDemoApplication.service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@Autowired UserService userService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model,HttpSession session){
		session.setAttribute("userRole", null);
		session.setAttribute("loggedInUser", null);
		return "login";
	}
	
	
	@RequestMapping(value="/dashboard", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password,HttpSession session){
		
		boolean isValidUser = userService.loginUser(name, password);
		
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		
		User user = userService.findByEmail(name);
		session.setAttribute("userRole", user.getRole());
		session.setAttribute("loggedInUser", user);

		if(user.getRole().equalsIgnoreCase("admin")) {
			return "redirect:/addUser";
		}else {
			return "user-dashboard";	
		}
	}
	
	
	/*
	 * User Role : dashboard page
	 */
    @RequestMapping(value="/user-dashboard", method = RequestMethod.GET)
	public String showUserDashboardPage(HttpSession session, ModelMap model){
    	String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "user-dashboard";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}		
	}
    
	/*
	 * Admin Role : Add User page
	 */
    
    @RequestMapping(value="/addUser", method = RequestMethod.GET)
	public String showAddUserPage(ModelMap model,HttpSession session){
    	String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	System.out.println("Session User Role : "+sessionUserRole);
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("admin")) {
    			return "addUser";
    		} else {
    			return "user-dashboard";
    		}
    	}else {
    		return "redirect:/login";
    	}
		
	}

	/*
	 * Admin Role : Delete User page
	 */
        
    @RequestMapping(value="/deleteUser", method = RequestMethod.GET)
	public String showDeleteUserPage(ModelMap model, HttpSession session){
    	String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	System.out.println("Session User Role : "+sessionUserRole);
    	
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("admin")) {
    			return "deleteUser";
    		} else {
    			return "redirect:/user-dashboard";
    		}
    	}else {
    		return "redirect:/login";
    	}    	   
	}
    
    	
	/*
	 * @RequestMapping(value="/updateUser", method = RequestMethod.POST) public
	 * String showUpdateUserPage(@ModelAttribute("user") User user){
	 * 
	 * userService.updateUser(user); return "updateUser"; }
	 */
       
    @RequestMapping(value="/viewUsers-data", method = RequestMethod.GET)
	public String showViewUsersDataPage(ModelMap model){    	
		return "viewUsers-data";
	}
    
    @RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutUser(ModelMap model, HttpSession session){
    	session.setAttribute("userRole", null);
		session.setAttribute("loggedInUser", null);
		return "redirect:/login";
	}
}
