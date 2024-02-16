package testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPage;
import pages.ManageOrders;

public class ScreenshotTesting {
	@Test
	public void Screenshot() throws IOException {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Setcredentials("admin", "admin");
		loginpage.LoginButton();
		ManageOrders manage=new ManageOrders(driver);
		manage.ManageordersClick();
		Date date=new Date();
		System.out.println(date);
		String newdate=date.toString().replace(" " ,"-" ).replace(":","-");
		System.out.println(newdate);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot/"+newdate+".png"));
	}

}
