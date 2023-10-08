package com.softwaretestingo.launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LaunchChromeTest 
{
	@Test
	public void launchChrome() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}