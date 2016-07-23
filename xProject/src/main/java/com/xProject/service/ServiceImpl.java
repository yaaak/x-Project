package com.xProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xProject.entity.UserEntity;
import com.xProject.repository.UserRepository;

public class ServiceImpl implements Service {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
