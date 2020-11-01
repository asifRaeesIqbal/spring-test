package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.repository.Greeting;
import com.example.demo.repository.HelloRepository;

@ExtendWith(MockitoExtension.class) // for speed if we want to initliase springBootTest with a configuration
public class HelloServiceTest {
	
	@Mock
	private HelloRepository helloRepository;
	
	@InjectMocks
	private HelloServiceImpl helloService;
	
	@Test
	public void test_hello_Service_success() {
		Greeting greeting = new Greeting(1, "Hello");
		when(helloRepository.findById(1)).thenReturn(Optional.of(greeting));	
	
		String result = helloService.getGreeting();
	
		assertEquals("Hello", result);
	}	

}
