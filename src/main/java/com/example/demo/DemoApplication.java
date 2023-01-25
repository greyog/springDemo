package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Before starting application");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Started application with {} args", args.length);
		logger.debug("Started application debug with {} args", args.length);
	}

}
