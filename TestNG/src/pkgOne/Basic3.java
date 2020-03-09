package pkgOne;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic3 
{
 
	@Test
    public void test2method1() 
	{
		System.out.println("Basic3-test2-method1");
	}
	
	@Test
	public void test2method2()
	{
		System.out.println("Basic3-test2-method2");
	}
	
	@BeforeSuite
	public void beforeSte()
	{
		System.out.println("Before Suite");
	}
	
}
