package com.abnishn.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long>{
	List<User>findByRole(String role);
}
