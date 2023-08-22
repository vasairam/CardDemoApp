package com.cg.CardDemoApplication.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.CustomPasswordEncoder;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.repository.UserRepository;


@Service
public class UserService implements UserDetailsService {

	private UserRepository userRepository;
	private CustomPasswordEncoder customPasswordEncoder;

	@Autowired
	public UserService(UserRepository userRepository,
			@Lazy CustomPasswordEncoder customPasswordEncoder){
		this.userRepository = userRepository;
		this.customPasswordEncoder = customPasswordEncoder;

	}

	public void registerUser(User user) {
		User newUser = new User();
		boolean isNewUser = checkUserAlreadyExists(user.getUsername());
		if(!isNewUser) {
			newUser.setUserId(user.getUserId());
			newUser.setFirstName(user.getFirstName());
			newUser.setLastName(user.getLastName());
			newUser.setEmail(user.getEmail());
			newUser.setUsername(user.getUsername());
			newUser.setPassword(customPasswordEncoder.encode(user.getPassword()));
			newUser.setIsActive(user.getIsActive());
			newUser.setCreatedBy(user.getCreatedBy());
			newUser.setRole(user.getRole());
			userRepository.save(newUser);
		}
		else {
			throw new NullPointerException("User Already Exits");
		}       
	}

	private boolean checkUserAlreadyExists(String username) {
		Iterable<User> allUsers = userRepository.findAll();
		for (User user2 : allUsers) {
			if(user2.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}

	public User findUserById(int id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new NullPointerException("user not found"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User userEntity = findByEmail(username);
		if(userEntity == null) throw new UsernameNotFoundException(username);
		return new org.springframework.security.core.userdetails.User(username,
				null,Collections.emptyList());
	}

	public User findByEmail(String username) {  
		
		Iterable<User> allUsers = userRepository.findAll();
		boolean foundUserName = false;
		for (User user2 : allUsers) {
			if(user2.getUsername().equals(username)) {
				foundUserName = true;
				return user2;
			}			
		}
		if(!foundUserName) {
			throw new UsernameNotFoundException(username);
		}
		return null;
	}

	public Boolean loginUser(String username, String password) {
		User user = findByEmail(username);
		System.out.println(user);
		if(customPasswordEncoder.matches(password, user.getPassword())) {
			return true;
		}
		else{ 
			return false;
		}
		 
	}

	public List<User> viewAllUsers(){
		List<User> users = userRepository.findAll();
		return users;		
	}

	public User updateUser(User user) {
		
		User updatedUser=findByEmail(user.getUsername());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());		
		updatedUser.setRole(user.getRole());
		updatedUser.setPassword(customPasswordEncoder.encode(user.getPassword()));
		userRepository.save(updatedUser);
		
		return updatedUser;
	}
	
	public String deleteUser(User user) {
		
		User userOne=findByEmail(user.getUsername());
		userRepository.deleteById(userOne.getUserId());
		
		return "Deleted successfully";
	}
}
