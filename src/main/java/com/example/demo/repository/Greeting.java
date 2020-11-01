package com.example.demo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "greeting")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

	@Id
	private int id;
	
	private String greeting;
	
}
