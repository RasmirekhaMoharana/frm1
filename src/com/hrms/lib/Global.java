package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	//Test Data
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String fname="Rasmi";
	public String lname="rekha";
	
	//Objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String login_btn="Submit";
	public String link_logout="Logout";
	public String add_btn="//input[@value='Add']";
	public String first_name="txtEmpFirstName";
	public String last_name="txtEmpLastName";
	public String save_btn="btnEdit";
	
	

}
