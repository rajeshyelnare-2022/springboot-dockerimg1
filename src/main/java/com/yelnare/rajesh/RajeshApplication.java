package com.yelnare.rajesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RajeshApplication {

	public static void main(String[] args) {
		SpringApplication.run(RajeshApplication.class, args);
	}
	  @RequestMapping("/")
	  public String home() {
	    return "Hello from Docker Image of Rajesh \n ";
	  }

}
