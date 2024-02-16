package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPage;

public class FileUploadingTest {
	@Test
	public void FileUpload() {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage login=new LoginPage(driver);
		login.Setcredentials("admin", "admin");
		login.LoginButton();
		driver.findElement(By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[10]/a/p")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section/div[1]/a[1]")).click();
		driver.findElement(By.id("main_img")).sendKeys("C:\\Users\\DELL\\Desktop\\Image20231219193720.png");
		driver.findElement(By.name("create")).click();
	}

}
