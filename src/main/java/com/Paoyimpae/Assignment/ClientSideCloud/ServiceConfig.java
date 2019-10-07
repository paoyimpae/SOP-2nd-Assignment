package com.Paoyimpae.Assignment.ClientSideCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootConfiguration
@Component
public class ServiceConfig {
	
	@Value("${example.property}")
	private String exampleProperty;
	
	public String getExampleProperty() {
		return exampleProperty;
	}
}
