package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browsers;
import pages.LoginPage;
import pages.ManageContentPage;

public class ManageContentPageTest {
	
	@Test
	public void ManageContentTest() throws AWTException, InterruptedException {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage login=new LoginPage(driver);
		login.Setcredentials("admin", "admin");
		login.LoginButton();
		
		ManageContentPage manage=new ManageContentPage(driver);
		
		manage.ManageContentClick();
		

		//manage.ManageContactClick();
		manage.EditButtonClick();
		
		Robot robot=new Robot();
		driver.findElement(By.id("del_limit")).clear();
		driver.findElement(By.id("del_limit")).sendKeys("1000");
		String actualtitle=driver.findElement(By.id("del_limit")).getText();
		//robot.keyPress(KeyEvent.VK_BACK_SPACE);
	
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//manage.UpdateDetails();
		
		String afterupdation=driver.findElement(By.xpath("/html/body/div/div[1]/section/div/div/div[3]/div[2]/table/tbody/tr/td[5]")).getText();
		SoftAssert softassert=new SoftAssert();

		System.out.println(actualtitle);
		
		softassert.assertEquals(actualtitle, afterupdation);
		softassert.assertAll();
	}

}
