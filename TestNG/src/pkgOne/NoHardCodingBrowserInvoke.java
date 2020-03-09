package pkgOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoHardCodingBrowserInvoke 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/bhargavkanmalla/Documents/workspace/TestNG/src/pkgOne/info.properties");
	
	    //read from the file dynamically
		prop.load(fis);
		if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.quit();
	
	
	
	
	
	
	
	
	}
}
