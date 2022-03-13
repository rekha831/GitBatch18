package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public PageBase() throws IOException {
		 prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\adars\\Batch18\\OrangeHRMQa\\src\\main\\java\\com\\hrm\\qa\\configuration\\config.properties");
		prop.load(file);
	}
	
	public static void setUp(String browser,String url) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Batch18\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Batch18\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("sorry we are currently not supporting this browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get(url);

		
	}
	
	public static void tearDown() {
		driver.quit();
	}
}
