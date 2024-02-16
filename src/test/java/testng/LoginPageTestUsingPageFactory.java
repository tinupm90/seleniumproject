package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPageUsingPageFactory;

public class LoginPageTestUsingPageFactory {
	
	@Test
	public void Login() {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPageUsingPageFactory loginpage=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		loginpage.Setredentials("admin", "admin");
		
	}
	

}
