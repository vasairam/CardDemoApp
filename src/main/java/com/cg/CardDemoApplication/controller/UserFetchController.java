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
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.UserService;

@RestController
public class UserFetchController {
	
    private UserService userService;

	@Autowired
    public UserFetchController(UserService userService){
        this.userService = userService;
    }

	
	  @RequestMapping(value = "/user/find/{id}", method = RequestMethod.GET)
      public User findUserById(@PathVariable("id") int id){
      return userService.findUserById(id);
  }
  
  @RequestMapping(value = "/user/find/email/{email}", method = RequestMethod.GET)
  public User findUserByEmail(ModelMap model,@PathVariable("email") String email){
              User user= userService.findByEmail(email);
             
             return user ;
  }
}
