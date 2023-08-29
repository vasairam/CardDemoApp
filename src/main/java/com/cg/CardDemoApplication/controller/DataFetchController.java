package com.cg.CardDemoApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.model.Customer;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.model.Transactions;
import com.cg.CardDemoApplication.repository.CustomerRepository;
import com.cg.CardDemoApplication.service.AccountService;
import com.cg.CardDemoApplication.service.TransactionService;
import com.cg.CardDemoApplication.service.CreditCardService;
import com.cg.CardDemoApplication.service.CustomerService;
import com.cg.CardDemoApplication.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
public class DataFetchController {
	
    private UserService userService;    
	private AccountService accountService;
	private CustomerService customerService;
	private CreditCardService creditCardService;
	private TransactionService transactionService;
	
	@Autowired
    public DataFetchController(UserService userService,
    						AccountService accountService, 
    						CustomerService customerService,
    						CreditCardService creditCardService,
    						TransactionService transactionService){
        this.userService = userService;
        this.accountService = accountService;
        this.customerService = customerService;
        this.creditCardService = creditCardService;
        this.transactionService = transactionService;
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

	@RequestMapping(value = "/viewBillPayment/{accountNumber}", method = RequestMethod.GET)
	public Account viewBillPayment(@PathVariable("accountNumber") String accountNumber){
		return accountService.getAccountInfo(accountNumber);
	}
  
//	@RequestMapping(value = "/card/{accountNumber}", method = RequestMethod.GET)
//	public CreditCard viewCreditCardUsingAccountNumber(@PathVariable("accountNumber") String accountNumber){
//		return creditCardService.getCreditCardUsingAccountNumber(accountNumber);
//	}
//
//	@RequestMapping(value = "/card/{creditCardNumber}", method = RequestMethod.GET)
//	public CreditCard viewCreditCardUsingCardNumber(@PathVariable("creditCardNumber") String creditCardNumber){
//		return creditCardService.getCreditCardUsingCardNumber(creditCardNumber);
//	}
	
	  @RequestMapping(value = "/accountnumber/find/{accountNumber}", method = RequestMethod.GET)
	  public CreditCard viewAccountNumber(@PathVariable("accountNumber") String accountNumber){
		  return creditCardService.getCreditCardUsingAccountNumber(accountNumber);
	  }

	  @RequestMapping(value = "/creditcardnumber/find/{creditCardNumber}", method = RequestMethod.GET)
	  public CreditCard viewCardNumber(@PathVariable("creditCardNumber") String creditCardNumber){
		  return creditCardService.getCreditCardUsingCardNumber(creditCardNumber);
	  }
	  @RequestMapping(value = "/transactionid/find/{transactionid}", method = RequestMethod.GET)
	  public Transactions viewTransaction(@PathVariable("transactionid")String transactionid) {
		  return transactionService.gettransactionusingID(transactionid);
	  }
	
	
}
