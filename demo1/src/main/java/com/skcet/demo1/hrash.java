package com.skcet.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hrash {
	@RequestMapping("/")
	@ResponseBody
	public String display()
	{
		return "";
	}
}
 