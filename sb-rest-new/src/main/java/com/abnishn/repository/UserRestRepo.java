package com.abnishn.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users", collectionResourceRel="users")
public interface UserRestRepo extends PagingAndSortingRepository<User, Long>{
	List<User> findByRole(@Param("role")String role);
}
