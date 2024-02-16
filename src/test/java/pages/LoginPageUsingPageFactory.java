package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUsingPageFactory {
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div/div[3]/div[2]/button")
	WebElement loginbutton;
	
	
	
	WebDriver driver;
	public LoginPageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
		
		
		
	}
	
	
	public void Setredentials(String name,String password1) {
		
		username.sendKeys(name);
		password.sendKeys(password1);
		loginbutton.click();
	}

}
