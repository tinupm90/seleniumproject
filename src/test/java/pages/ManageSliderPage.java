package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageSliderPage {
	WebDriver driver;
	By slider=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[9]/a/p");
	public ManageSliderPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void ManageSliderClick() {
		
		driver.findElement(slider).click();
	}
	

}
