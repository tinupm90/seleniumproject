package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing {

	WebDriver driver;

  @Parameters("browser")
  @Test

  public void Login(String browser) {

  if(browser.equalsIgnoreCase("edge")) {
	
	  WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver(); 
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");

  }else if (browser.equalsIgnoreCase("chrome")) { 

	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");

  } 
   

  }
   }
