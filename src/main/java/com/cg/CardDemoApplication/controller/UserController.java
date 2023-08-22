package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.UserService;

import jakarta.servlet.http.HttpSession;



@Controller
@SessionAttributes("name")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/user/register",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user")  User user){
        userService.registerUser(user);
        
        return "addUser";
        
    }
 
	/*
	 * Admin Role : View Users page
	 */
        
    @RequestMapping(value="/viewUsers", method = RequestMethod.GET)
	public String showViewUsersPage(ModelMap model,HttpSession session){
    	String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	System.out.println("Session User Role : "+sessionUserRole);
    	
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("admin")) {
    			List<User> users = userService.viewAllUsers();
    	    	model.put("userData", users);    	
    			return "viewUsers";
    		} else {
    			return "redirect:/user-dashboard";
    		}
    	}else {
    		return "redirect:/login";
    	}
    	
		
	}
    
	/*
	 * Admin Role : Update User page
	 */
        
    @RequestMapping(value="/updateUser", method = RequestMethod.GET)
   	public String updateUser(@ModelAttribute("user")  User user, HttpSession session){
    	String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	System.out.println("Session User Role : "+sessionUserRole);
    	
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("admin")) {
    			return "updateUser";
    		} else {
    			return "redirect:/user-dashboard";
    		}
    	}else {
    		return "redirect:/login";
    	}    	   		
   	}
    
    @RequestMapping(value="/updateUserPOST", method = RequestMethod.POST)
   	public String updateUserDetails(@ModelAttribute("user")  User user){
    	userService.updateUser(user);
   		return "updateUser";
   	}
    
    @RequestMapping(value="/deleteUserPOST", method = RequestMethod.POST)
   	public String deleteUserPost(ModelMap model,@ModelAttribute("user")  User user){
    	model.put("message",userService.deleteUser(user));
 
   		return "deleteUser";
   	}
    
    
//    @RequestMapping(value="/viewUsers", method = RequestMethod.GET)
//	public ModelAndView showViewUsersPage(){
//    	List<User> users = userService.viewAllUsers();
//    	
//    	ModelAndView model = new ModelAndView("viewUsers");
//    	model.addObject("userData", users);    	
//		return model;
//	}
    
}
