package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import base.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.LoginPage;

public class LoginPageTesting {


	
	@Test
	public void Login() {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.Setcredentials("admin", "admin");
		loginpage.LoginButton();
		
		
		
	}
	
	
}
