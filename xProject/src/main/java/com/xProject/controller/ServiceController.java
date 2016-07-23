package com.xProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xProject.entity.UserEntity;
import com.xProject.service.Service;



@RestController
public class ServiceController {
	@Autowired
	private Service service;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<UserEntity> get() {
		return service.findAll();
	}
}
