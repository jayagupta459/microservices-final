package com.microservices.limit.limitservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.microservices.limit.limitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
    private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
