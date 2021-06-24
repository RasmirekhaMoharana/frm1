package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC001 {
	@Test
	public void tc001() throws Exception{
	//public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.logout();
		obj.closeApplication();
		
	}

} 
