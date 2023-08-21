package com.skcet.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class stname {
	@RequestMapping("/name")
	@ResponseBody
	public String getName()
	{
		String studentName="IamNEO";
		return "Welcome "+studentName+"!";
	}
}
