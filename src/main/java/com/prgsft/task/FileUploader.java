package com.prgsft.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FileUploader {
	
	
	public static void main(String[] args) {
		System.setProperty("log-id", "progress-soft");
        SpringApplication.run(FileUploader.class, args);
    }

}
