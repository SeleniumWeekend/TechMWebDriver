package com.sample;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 
{	
	@Test(dataProvider="data")
	public void m1(String un, int pw, String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(un+" , "+pw);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
	@Test(dataProvider="data")
	public void m2(String un, int pw, String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(un+" , "+pw);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
	
	@DataProvider(name="data")
	public Object[][] getData(Method m)
	{
		Object[][] o1=null;
		if(m.getName().equals("m1"))
		{
			o1 = new Object[1][3];
			o1[0][0] = "BCD";
			o1[0][1] = 1234;
			o1[0][2] = "http://drive.google.com/";
		}
		if(m.getName().equals("m2"))
		{
			o1 = new Object[1][3];
			o1[0][0] = "ABC";
			o1[0][1] = 123;
			o1[0][2] = "http://www.facebook.com/";
		}
		return o1;
	}
}
