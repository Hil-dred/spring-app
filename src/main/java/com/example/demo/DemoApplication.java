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
		return "Welcome, this is a profile app! Somewhat called a diary of persons.......Enjoy";
	}

	@GetMapping("/tobi/")
	public String profile1(){
		return "I am a Devops Engineer. P.S: Jenkins is annoying!....On to Kubernetes!!";
	}

	@GetMapping("/wale/")
        public String profile2(){
                return "I am a Software Architect";
        }


        @GetMapping("/brenda/")
        public String profile3(){
                return "I am a Packaging and Development Officer, looking into becoming a Software Tester";
        }

        @GetMapping("/rasheedat/")
        public String profile4(){
                return "I am a Fashion Designer. My major designs are for hijabis. I live in Ilorin";
        }

	@GetMapping("/finally/")
        public String profile5(){
                return "Hallelujah!! My pipeline is finally working!!!";
        }


        @GetMapping("/dream/")
        public String profile6(){
                return "Gradually my dreams are coming to pass.......";
        }


}
