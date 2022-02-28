package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String helloWelcome(){
		return "Welcome, this is a profile app!";
	}

	@GetMapping("/tobi/")
	public String profile1(){
		return "I am a Devops Engineer";
	}

	@GetMapping("/wale/")
        public String profile2(){
                return "I am a Software Architect";
        }
}
