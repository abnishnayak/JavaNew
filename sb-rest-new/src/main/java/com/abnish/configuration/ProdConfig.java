package com.abnish.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("dev")
public class ProdConfig {
	@Bean
	public String dummy() {
		return "dummy";
	}
}
