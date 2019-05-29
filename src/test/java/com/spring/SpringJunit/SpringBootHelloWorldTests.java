package com.spring.SpringJunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.SpringJunit.SpringBootHelloWorldApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootHelloWorldApplication.class)
public class SpringBootHelloWorldTests {

	@Test
	public void contextLoads() {
	}

}