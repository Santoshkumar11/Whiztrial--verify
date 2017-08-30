package com.project.whiztrail1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	  public void hello() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D://firefree//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
      String baseUrl = "http://localhost/whiztrial/";
      driver.get(baseUrl);
     Thread.sleep(5000);
      
      driver.close();
}
}
