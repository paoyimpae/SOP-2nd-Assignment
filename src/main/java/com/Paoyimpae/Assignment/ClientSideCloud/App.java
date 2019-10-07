package com.Paoyimpae.Assignment.ClientSideCloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
	@Autowired
	ServiceConfig serviceConfig = new ServiceConfig();
	
	public static void main( String[] args ) {
		System.out.println("Hello World !");
    	SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("")
	String home() {
		return serviceConfig.getExampleProperty();
	}
}
