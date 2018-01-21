package com.testngcmd;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 
{
	@Test(dataProvider="data")
	public void loginToGD(String un, int pw) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://drive.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("UserName : "+un);
		System.out.println("Password : "+pw);
		driver.close();
	}
	
	@Test(dataProvider="data")
	public void loginToFacebook(String un, int pw) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println("UserName : "+un);
		System.out.println("Password : "+pw);
		driver.close();
	}
	
	
	@DataProvider(name="data")
	public Object[][] data(Method m1)
	{
		Object[][] o1 = null;
		
		if(m1.getName().equals("loginToGD"))
		{
			o1 = new Object[3][2];
			o1[0][0] = "ABC";
			o1[0][1] = 123;
			
			o1[1][0] = "BCD";
			o1[1][1] = 1234;
			
			o1[2][0] = "EFG";
			o1[2][1] = 12345;
		}
		
		if(m1.getName().equals("loginToFacebook"))
		{
			o1 = new Object[3][2];
			o1[0][0] = "GABC";
			o1[0][1] = 1234;
			
			o1[1][0] = "GBCD";
			o1[1][1] = 12345;
			
			o1[2][0] = "GEFG";
			o1[2][1] = 123456;
		}
	
		return o1;
	}
}
