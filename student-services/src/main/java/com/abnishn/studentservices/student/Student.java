package com.abnishn.studentservices.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String num;
	
	public Student() {
		super();
	}
	
	public Student(long id, String name, String num) {
		super();
		this.id=id;
		this.name=name;
		this.num=num;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
