package com.ranushka.myapp1.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

	@GetMapping("/getUser")
	public String getUser(){
			return "Ranushka";
	}

}
