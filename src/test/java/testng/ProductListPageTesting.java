package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPage;
import pages.ProductListPage;

public class ProductListPageTesting {

	
	
	@Test
	public void ProductLists() {
	WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
	LoginPage login=new LoginPage(driver);
	login.Setcredentials("admin", "admin");
	login.LoginButton();
	ProductListPage product=new ProductListPage(driver);
	
	product.ManageProduct();
	product.ProductList();
	}
	
}
