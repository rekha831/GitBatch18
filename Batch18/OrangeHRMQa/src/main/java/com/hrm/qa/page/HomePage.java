package com.hrm.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.PageBase;

public class HomePage extends PageBase {

	public HomePage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);	
	
	}
	
	@FindBy(xpath = "//div[text()='Pooja Kumari']")
	WebElement textChekPoint;
	
	public String homePageValidation() {
	String actuahometext=	textChekPoint.getText();
		return actuahometext;
	}

	
}
