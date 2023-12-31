package com.example.homehelper3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homehelper3.Entity.ServiceCategories;

import com.example.homehelper3.Repository.ServiceRepo;


@Service
public class ServiceService {
	@Autowired
	ServiceRepo Repo;

	public ServiceCategories saveDetails(ServiceCategories e) {
		return Repo.save(e);
	}	
	public List<ServiceCategories> getDetails()
	{
		return Repo.findAll();

	}
	public ServiceCategories getDetailsById(String category) {
		return Repo.findById(category).get();
	}	
	public ServiceCategories UpdateDetails(ServiceCategories e1) {
		return Repo.save(e1);
	}
	public void deleteDetails(String category) {
		Repo.deleteById(category);
	}

}