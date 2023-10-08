package com.softwaretestingo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdgeTest 
{
	@Test
	public void launchEdge()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.softwaretestingo.com/");
		driver.quit();
	}
}