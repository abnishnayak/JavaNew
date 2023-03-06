package com.abnishn.bookrepo;

import com.abnishn.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface BookRepo extends JpaRepository<Books, Integer>{
	
}
