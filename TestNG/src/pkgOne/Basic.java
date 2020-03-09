package pkgOne;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

//import org.testng.annotations.Test;

public class Basic 
{
	@Test
	public void method1()
	{
		System.out.println("BASIC METHOD1");
	} 
	
	@Test
	public void method2()
	{
		System.out.println("BASIC METHOD2");
	}
	
	@BeforeTest
	public void methodx()
	{
	System.out.println("Before test");
	}
	
	@AfterTest
	public void methody()
	{
		System.out.println("After test");
	}
}
	
