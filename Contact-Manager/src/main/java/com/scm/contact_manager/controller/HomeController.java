package com.scm.contact_manager.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scm.contact_manager.entities.Contact;
import com.scm.contact_manager.entities.User;
import com.scm.contact_manager.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User("Aman Singh","aman.nrip1@gmail.com", "12445","admin",true,"asdasd","boring");
		ArrayList<Contact> contactList = new ArrayList<>();
		contactList.add(new Contact("Vivek", "Singh", "BE Engineer", "itsvivek96@gmail.com", "8127952706", "some random description"));
		contactList.add(new Contact("Golu", "Singh", "BE Engineer", "itsgolu96@gmail.com", "8127952706", "some random description"));
		user.setContacts(contactList);
		userRepository.save(user);
		return "Working";
	}

}
