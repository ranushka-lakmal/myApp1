package com.ranushka.myapp1.service;

import com.ranushka.myapp1.dto.UserDTO;
import com.ranushka.myapp1.entity.User;
import com.ranushka.myapp1.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ModelMapper modelMapper;

	public UserDTO saveUser(UserDTO userDTO){
		userRepo.save(modelMapper.map(userDTO, User.class));
		return userDTO;
	}
}
