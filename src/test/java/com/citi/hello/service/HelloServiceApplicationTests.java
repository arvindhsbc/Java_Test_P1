package com.citi.hello.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@AutoConfigureMockMvc
class HelloServiceApplicationTests {



	private String url;


	private TestRestTemplate restTemplate = new TestRestTemplate();

	@BeforeEach
	public void setUp() {
		url = "http://localhost:8444/api/message";
	}

	@Test
	void showMessage () {
		assertThat(this.restTemplate.getForObject(url, String.class)).contains("Hello World!");
	}

}
