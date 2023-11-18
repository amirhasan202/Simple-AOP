package com.in28minutes.learningAOP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learningAOP.business.BusinessService;



@SpringBootApplication
public class LearningAopApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private BusinessService bs; 
	
	public LearningAopApplication (BusinessService bs)
	{
		this.bs=bs;
	}

	public static void main(String[] args) {
		SpringApplication.run(LearningAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returnet is {}" , bs.calculateMax());
	}

}
