package com.abnishn.string;

public class Str {

	public static void main(String[] args) {
		Student s=new Student("Abnish");
		System.out.println(s);
	}

}
class Student{
	String name;
	Student(String n){
		name=n;
	}
	@Override
	public String toString() {
		return "Student [name= "+name+"]";
	}
}