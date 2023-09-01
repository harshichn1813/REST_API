package com.example.homehelper3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homehelper3.Entity.UserDetails;
import com.example.homehelper3.Repository.Repo;

@Service
public class UserService {
	@Autowired
	Repo Repo;

	public UserDetails saveDetails(UserDetails e) {
		return Repo.save(e);
	}	
	public List<UserDetails> getDetails()
	{
		return Repo.findAll();

	}
	public UserDetails getDetailsById(String category) {
		return Repo.findById(category).get();
	}	
	public UserDetails UpdateDetails(UserDetails e1) {
		return Repo.save(e1);
	}
	public void deleteDetails(String category) {
		Repo.deleteById(category);
	}

}