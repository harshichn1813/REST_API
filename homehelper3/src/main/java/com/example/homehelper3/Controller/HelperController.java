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

import com.example.homehelper3.Entity.HelperDetails;
import com.example.homehelper3.service.HelperService;

@RestController
public class HelperController {
	@Autowired
	HelperService helperService;

	@PostMapping("/posth")
	public HelperDetails addInfo(@RequestBody HelperDetails st) {
		return helperService.saveDetails(st);
	}
	
	@GetMapping("/geth")
	public List<HelperDetails> fetchDetails1() {
		return helperService.getDetails();
	}
	
	@GetMapping("/{id}h")
	public HelperDetails getDetailsById(@PathVariable String category) {
		return helperService.getDetailsById(category);
	}
	
	@PutMapping("/Updateh")
	public HelperDetails UpdateInfo(@RequestBody HelperDetails st1) {
		return helperService.UpdateDetails(st1);
	}
	
	@DeleteMapping("/delete/{id}h")
	public String deleteInfo(@PathVariable("id") String id) {
		helperService.deleteDetails(id);
		return "Deleted details";
	}
}