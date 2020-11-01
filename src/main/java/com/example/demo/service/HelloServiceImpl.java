package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloRepository helloRepository;
	
	@Override
	public String getGreeting() {
		return helloRepository.findById(1).get().getGreeting();
	}

}
