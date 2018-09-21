package com.fedex.demobackened;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBackenedApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackenedApplication.class, args);
	}
	@GetMapping("")
    public String helloWorld() throws UnknownHostException {

	    return "Hello from " + InetAddress.getLocalHost().getHostName();
    }
}
