package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browsers;
import pages.DeleteItem;
import pages.LoginPage;
import pages.ManageOrders;

public class DeleteItemTesting {
	
	@Test
	public void DeleteItems() {
		
WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.Setcredentials("admin", "admin");
		loginpage.LoginButton();
		ManageOrders manage=new ManageOrders(driver);
		manage.ManageordersClick();
		DeleteItem delete=new DeleteItem(driver);
		String item=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[3]/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(item);
		
		String aftterdeletion=delete.Delete();
		System.out.println(aftterdeletion);
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(item,aftterdeletion);
		softassert.assertAll();
				
	}

}
