package Screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Screenshot {
	
	WebDriver driver;
	
  @Test
  public void f() throws Throwable  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.facebook.com");
	  
	  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File(".//Screenshot//"+"TakeScrShot"+".png"));
	  
	 ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
	
  }
}
