package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	
	
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  
	 
	  DesiredCapabilities dcp=new DesiredCapabilities();
	  dcp.setPlatform(Platform.WINDOWS);
	  dcp.setBrowserName("chrome");
	  WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"),dcp);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("http://www.google.com");
	  String Title=driver.getTitle();
	  System.out.println("Google title is : "+Title);
	  
	  
  }
}
