package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPageUsingPageFactory;
import pages.ManageOrdersUsingPageFactory;

public class ManageOrdersTestingUsingPagefactory {
	
@Test
	public void ManageOrders() {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPageUsingPageFactory loginpage=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		loginpage.Setredentials("admin", "admin");
		ManageOrdersUsingPageFactory manage=PageFactory.initElements(driver, ManageOrdersUsingPageFactory.class);
		manage.ManageOrders("tinu", "COD", "paid");
	}

}
