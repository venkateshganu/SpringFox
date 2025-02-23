package com.techprimer.springboot.swaggerexample.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(new User("Sam",2000L),new User("Peter",1000L));
	}

	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName,1000L);
	}
	
	private class User {
	private String userName;
	
	private Long salary;
	
	public User(String userName, Long salary) {
		this.userName=userName;
		this.salary=salary;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public void setuserName(String userName) {
		this.userName=userName;
	}
	}
}