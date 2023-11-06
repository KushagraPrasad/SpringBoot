package com.spring.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.practice.service.ImageUploadService;

@SpringBootTest
class PracticeApplicationTests {

	@Autowired
	ImageUploadService imageUploadService;
	
	@Test
	void contextLoads() {
	}
	@Test
	void testing_Autowiring() {
		//imageUploadService.upload();
	}

}
