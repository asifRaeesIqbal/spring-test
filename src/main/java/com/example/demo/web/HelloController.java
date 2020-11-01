package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "Hello API")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@ApiOperation(value = "HelloService", response = String.class)
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 401, message = "You are not authorized")
	})
	
	@GetMapping("/controller/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return helloService.getGreeting() + " " +  name;
	}
	
	@GetMapping("/controller/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " +  name;
	}	
	
	// post use @RequestBody

}
