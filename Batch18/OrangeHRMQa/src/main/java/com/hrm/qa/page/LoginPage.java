package com.hrm.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.PageBase;

public class LoginPage extends PageBase{

	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
			//Elements:
			@FindBy(id ="usernameField" )
			WebElement useridfld;
			
			@FindBy(id = "passwordField")
			WebElement pwd;
			
			@FindBy(xpath = "//button[text()='Login']")
			WebElement loginbtn;
			
			
			public void login(String userid,String passsword) {
				useridfld.sendKeys(userid);
				pwd.sendKeys(passsword);
				loginbtn.click();
			}
			
			public void logout() {
				
			}
	

}
