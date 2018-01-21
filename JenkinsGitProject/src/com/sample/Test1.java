package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void sampleTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\workspace\\JenkinsGitProject\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://drive.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
}
