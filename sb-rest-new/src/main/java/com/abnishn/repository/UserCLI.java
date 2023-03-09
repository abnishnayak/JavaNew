package com.abnishn.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCLI implements CommandLineRunner{
	private static final Logger LOGGER=LoggerFactory.getLogger(UserCLI.class);
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void run(String... args) {
		userRepo.save(new User("Ranga", "Admin"));
		userRepo.save(new User("Ravi", "User"));
		userRepo.save(new User("Satish", "Admin"));
		userRepo.save(new User("Raghu", "User"));
		
		userRepo.findAll().forEach(user->LOGGER.info(user.toString()));
		
		LOGGER.info("Admins are...");
		LOGGER.info("_______________");
		userRepo.findByRole("Admin").forEach(user->LOGGER.info(user.toString()));
	}
}
