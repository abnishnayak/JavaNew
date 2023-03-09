package com.abnishn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		 Resource res=new ClassPathResource("appConfig.xml");  
		 BeanFactory bf=new XmlBeanFactory(res);  
		      
		 Student student=(Student)bf.getBean("studentbean");  
		 student.display();
	}

}
