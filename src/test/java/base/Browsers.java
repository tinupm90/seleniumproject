package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {
	
	static WebDriver driver;
	
	public static WebDriver SetBrowsers(String url,String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}

}
