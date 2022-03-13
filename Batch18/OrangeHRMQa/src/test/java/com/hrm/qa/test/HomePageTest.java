package com.hrm.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrm.qa.page.HomePage;

public class HomePageTest extends LoginTest {

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void hommeTest() {
	HomePage hmepge=	PageFactory.initElements(driver, HomePage.class);
String txt=	hmepge.homePageValidation();

Assert.assertEquals(txt, "Pooja Kumari");
	}

}
