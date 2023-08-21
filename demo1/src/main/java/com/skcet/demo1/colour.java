package com.skcet.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class colour {
	@RequestMapping("/color")
	@ResponseBody
	public String getMyFav()
	{
		String yourFavColour="Peach";
		return "My favourite colour is "+yourFavColour;
	}

}
