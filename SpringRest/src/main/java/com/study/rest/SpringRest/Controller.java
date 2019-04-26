package com.study.rest.SpringRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String helloWorld(@RequestParam(value = "name", defaultValue = "world" )String name) {
		return "Hello "+ name;
	}
	
	@RequestMapping(value ="/", method = RequestMethod.POST)
	public String helloWorld2(@RequestBody String name ) {
		return "hello  " + name;
		
	} 

}
