package com.hrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.PageBase;
import com.hrm.qa.page.LoginPage;

public class LoginTest extends PageBase{
	public static PageBase pge;
	
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void intialization() throws IOException {
		
	String browsername=	prop.getProperty("browser");
String url=	prop.getProperty("url");
		
	 pge=	PageFactory.initElements(driver, PageBase.class);
	pge.setUp(browsername, url);
	
	LoginPage lgn=new LoginPage();
	String userid="Jabalpur802@gmail.com";
	String pwd="password";
	lgn.login(userid,pwd );
		
		
		
	}
	
	
	@AfterMethod
	public void teardownMet() {
		pge.tearDown();
	}

}
