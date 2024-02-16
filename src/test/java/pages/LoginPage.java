package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	By username=By.name("username");
	By password=By.name("password");
	By loginbutton=By.xpath("//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Setcredentials(String username1,String password1) {
		
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		
		
	}
	
	public void LoginButton() {
		
		driver.findElement(loginbutton).click();
	}

}
