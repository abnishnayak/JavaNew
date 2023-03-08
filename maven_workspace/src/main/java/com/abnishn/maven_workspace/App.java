package com.abnishn.maven_workspace;

import java.sql.Date;

import com.abnishn.maven_workspace.dao.RegisterDao;
import com.abnishn.maven_workspace.dto.Register;

public class App 
{
    public static void main( String[] args )
    {
         Register register= new Register();
         register.setName("Abnish");
         register.setPassword("564521587");
         register.setCountry("India");
         register.setDateOfBirth(new Date(21));
         register.setEmail("an2254@gmail.com");
         register.setMobileNumber("9874562103");
         register.setId(475L);
         
         RegisterDao dao=new RegisterDao();
         dao.save(register);
    }
}
