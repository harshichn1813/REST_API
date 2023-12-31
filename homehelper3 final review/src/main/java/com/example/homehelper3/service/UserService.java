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
	public List<UserDetails> getproducts() {
		return  Repo.findAll();
	}

	public List<UserDetails> saveinfo(List<UserDetails> details) {
		return  Repo.saveAll(details);
	}
	public List<UserDetails> UpdateDetails(List<UserDetails> e1) {
		return Repo.saveAll(e1);
	}
	public void deleteDetails(String category)
	{
		Repo.deleteById(category);
	}
	public String authCheck(String email,String password) {
		UserDetails user = Repo.findByEmail(email);
		if(user == null) {
			return "User not found";
		}
		
		if(user.getPassword().equals(password)) {
			return "Logged in";
		}
		return "Invalid Credential";
	}

//	public List<UserDetails> sortinfo(String s)
//	{
//		return  Repo.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
//	}
//	
//	public List<UserDetails> getbypage(int pgno,int pgsize)
//	{
//		Page<UserDetails> page= Repo.findAll(PageRequest.of(pgno, pgsize));
//		return page.getContent();
//	}
//	
//	public List<UserDetails> showinfo(){
//		return Repo.findAll();
//	}

}