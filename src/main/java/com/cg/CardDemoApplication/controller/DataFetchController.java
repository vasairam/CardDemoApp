package com.cg.CardDemoApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.Customer;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.repository.CustomerRepository;
import com.cg.CardDemoApplication.service.AccountService;
import com.cg.CardDemoApplication.service.CustomerService;
import com.cg.CardDemoApplication.service.UserService;

@RestController
public class DataFetchController {
	
    private UserService userService;    
	private AccountService accountService;
	private CustomerService customerService;
	
	@Autowired
    public DataFetchController(UserService userService,
    						AccountService accountService, 
    						CustomerService customerService){
        this.userService = userService;
        this.accountService = accountService;
        this.customerService = customerService;
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
  
  @RequestMapping(value = "/account/find/{accountNumber}", method = RequestMethod.GET)
  public Account getAccountInfo(@PathVariable("accountNumber") String accountNumber){
	  return accountService.getAccountInfo(accountNumber);
  }

  @RequestMapping(value = "/customer/find/{customerNumber}", method = RequestMethod.GET)
  public Customer getCustomerInfo(@PathVariable("customerNumber") String customerNumber){
	  return customerService.getCustomerInfo(customerNumber);
  }

  
}
