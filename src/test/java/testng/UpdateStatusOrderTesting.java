package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPage;
import pages.ManageOrders;
import pages.UpdateStatusOrder;

public class UpdateStatusOrderTesting {

	@Test
	public void UpdateStatusTest() {
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Setcredentials("admin", "admin");
		loginpage.LoginButton();
		ManageOrders manage=new ManageOrders(driver);
		manage.ManageordersClick();
		UpdateStatusOrder update=new UpdateStatusOrder(driver);
		update.ChangeStatusButtonclick();
		update.UpdateStatus();
	}
}
