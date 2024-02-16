package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import base.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.ManageOrders;
import pages.SearchPage;

public class ManageOrdersPageTesting {
	
	@Test
	public void Search() {
		WebDriver driver =Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Setcredentials("admin","admin");
		loginpage.LoginButton();
		ManageOrders manage=new ManageOrders(driver);
		manage.ManageordersClick();
		manage.SearchClick();
		SearchPage search=new SearchPage(driver);
		search.SetSearchItems("tinu", "COD", "Paid");
		search.Searchbutton();
		
	}

}
