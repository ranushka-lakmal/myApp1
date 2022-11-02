package com.ranushka.myapp1.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

	@GetMapping("/getUser")
	public String getUser(){
			return "Ranushka";
	}

	@PostMapping("/saveUser")
	public String saveUser(){
		return "User Save!";
	}

	@PutMapping("/updateUser")
	public String updateUser(){
		return "update User";
	}

	@DeleteMapping("/deleteUser")
	public String deleteUser(){
		return "user deleted!";
	}

}
