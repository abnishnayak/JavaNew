package com.abnishn.sbjdbc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
@RestController

public class SbJdbcController {
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/db")
	public String index() {
		jdbc.execute("insert into user(name,email)values('raman','raman@email.com')");
		return "data inserted.";
	}
}