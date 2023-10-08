package com.softwaretestingo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class LaunchFreFoxTest 
{
	@Test
	public void launchFirefox()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.softwaretestingo.com/");
		driver.close();
	}
}