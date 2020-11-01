package com.example.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlConfig.TransactionMode;

@DataJpaTest
@Sql(scripts = {"/test.sql"}, config = @SqlConfig(encoding = "utf-8", transactionMode = TransactionMode.ISOLATED))
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class HelloRepositoryTest {

    @Autowired
    private HelloRepository helloRepository;
    
    @Test
    public void find_all_unpicked_tickets_success() {
        // when
        Greeting greeting = helloRepository.findById(1).get();
     
        // then
        assertThat(greeting.getGreeting()).isEqualTo("hello");
    }	
	
}
