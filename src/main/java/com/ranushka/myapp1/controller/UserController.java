package com.ranushka.myapp1.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.ranushka.myapp1.dto.UserDTO;
import com.ranushka.myapp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUser")
	public String getUser(){
			return "Ranushka";
	}

	@PostMapping("/saveUser")
	public UserDTO saveUser(@RequestBody UserDTO userDTO){
		return userService.saveUser(userDTO);

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
