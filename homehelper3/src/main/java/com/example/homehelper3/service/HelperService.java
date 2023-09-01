package com.example.homehelper3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homehelper3.Entity.HelperDetails;
import com.example.homehelper3.Repository.HelperRepo;

@Service
public class HelperService {
	@Autowired
	HelperRepo Repo;

	public HelperDetails saveDetails(HelperDetails hd) {
		return Repo.save(hd);
	}	
	public List<HelperDetails> getDetails()
	{
		return Repo.findAll();

	}
	public HelperDetails getDetailsById(String category) {
		return Repo.findById(category).get();
	}	
	public HelperDetails UpdateDetails(HelperDetails e1) {
		return Repo.save(e1);
	}
	public void deleteDetails(String category) {
		Repo.deleteById(category);
	}

}

