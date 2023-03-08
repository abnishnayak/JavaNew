package com.abnishn;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebAppInit extends
AbstractAnnotationConfigDispatcherServletInitializer{
	 
	    protected Class<?>[] getRootConfigClasses() {  
	        return new Class[] { WebSecConfig.class };  
	    }  
	     
	    protected Class<?>[] getServletConfigClasses() {  
	        return null;  
	    }  
	     
	    protected String[] getServletMappings() {  
	        return new String[] { "/" };  
	    } 

}
