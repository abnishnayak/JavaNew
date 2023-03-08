package com.abnishn.sbjdbc;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	DataSource dataSource;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}
	public void run(String... args) throws Exception {
		System.out.println("DataSource= "+dataSource);
	}

}
