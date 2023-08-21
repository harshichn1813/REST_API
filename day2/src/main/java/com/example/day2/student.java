package com.example.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class student {
	@Value("${defaultname}")
	private String defaultname;
	@GetMapping("/display")
	public String diplay()
	{
		return "My name is "+ defaultname;
	}

}
