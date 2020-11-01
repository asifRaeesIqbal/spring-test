package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Greeting, Integer> {


}
