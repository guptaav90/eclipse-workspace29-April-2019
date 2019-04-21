package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
	  
	  driver.findElement(By.name("q")).sendKeys("java jdk");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@name='btnK1']|//input[@type='submit1']|//input[@value='Google Search']")).click();
	  //  this | works such as or xpath function
	 
	  
	/* List<WebElement> SearchboxList= driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']"));
	 int SearchboxListSize=SearchboxList.size();
	 System.out.println(SearchboxListSize);
	 
	 for (WebElement element : SearchboxList) {
		
		 String seleniumtext=element.getText();
		 System.out.println(seleniumtext);
		 
		 if (seleniumtext.contentEquals("java jdk 11"))
		{
		
			 element.click();
			 break;
			 
		}
		 
	}
		 
		*/
		
	}
	  
	  
	
	  
}