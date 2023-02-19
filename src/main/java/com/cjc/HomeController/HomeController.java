package com.cjc.HomeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

	
	@RequestMapping("/check")
	public String check()
	{
	
		
		return "App Working Fine..!";
	}
	
	
}
