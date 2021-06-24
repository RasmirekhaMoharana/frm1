package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

public class General extends Global {
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		Log.info("Application opened");
		System.out.println("Application Opened");
	}
	
	public void closeApplication() {
		Log.info("Application Closed");
		driver.close();
	}
	
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		Thread.sleep(2000);
		System.out.println("Login Completed");
		Log.info("Login Completed");
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	
	public void addEmp() {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(add_btn)).click();
		driver.findElement(By.name(first_name)).sendKeys(fname);
		driver.findElement(By.name(last_name)).sendKeys(lname);
		driver.findElement(By.id(save_btn)).click();
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();		
		
	}

}
