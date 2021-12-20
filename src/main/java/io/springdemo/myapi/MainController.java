package io.springdemo.myapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController{

	private static final String PATH="/error";
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String hello(){
		return "Hello World this is version 1.0 by Rashi ESSPL Dec 20";
	}

	@RequestMapping(value=PATH,method=RequestMethod.GET)
	public String defaultErrorMessage(){
		return "Requested Resource is not found!!!";
	}
	
}
