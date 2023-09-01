package com.example.homehelper3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.homehelper3.Entity.UserDetails;
import com.example.homehelper3.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/post")
	public UserDetails addInfo(@RequestBody UserDetails st) {
		return userService.saveDetails(st);
	}
	
	@GetMapping("/get")
	public List<UserDetails> fetchDetails() {
		return userService.getDetails();
	}
	
	@GetMapping("/{id}")
	public UserDetails getDetailsById(@PathVariable String category) {
		return userService.getDetailsById(category);
	}
	
	@PutMapping("/Update")
	public UserDetails UpdateInfo(@RequestBody UserDetails st1) {
		return userService.UpdateDetails(st1);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") String id) {
		userService.deleteDetails(id);
		return "Deleted details";
	}
}
