package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("admin")
public class AdminController {
	

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String login() {

		return "Hello";
	}

}
