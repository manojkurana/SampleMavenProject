package com.softwaretestingo.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmaticOperation2Test 
{
	@Test
	public void sum()
	{
		System.out.println("Sum Method Executed");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("Substraction Method Executed");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void mul()
	{
		System.out.println("Multiplication Method Executed");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	@Test
	public void div()
	{
		System.out.println("Division Method Executed");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}


}
