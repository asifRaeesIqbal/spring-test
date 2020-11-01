package com.example.demo.web;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.service.HelloService;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

	@MockBean
	private HelloService helloService;
	
	@Autowired
	private MockMvc mockMvc;	
	
	@Test
	public void test_hello_success() throws Exception {
	    this.mockMvc.perform(get("/controller/hello/asif"))
        .andDo(print())
        .andExpect(status()
          .isOk())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello asif")));
	}
	
	@Test
	public void test_greeting_success() throws Exception {
		when(helloService.getGreeting()).thenReturn("Hello Mr");
		
	    this.mockMvc.perform(get("/controller/greeting/asif"))
        .andDo(print())
        .andExpect(status()
          .isOk())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello Mr asif")));
	}
	
}
