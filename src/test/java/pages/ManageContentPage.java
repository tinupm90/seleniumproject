package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManageContentPage {
	
	WebDriver driver;
	By managecontent=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[7]/a/p");
	By managecontact=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[7]/ul[3]/li/a/p");
	By editbutton=By.xpath("/html/body/div/div[1]/section/div/div/div[2]/div[2]/table/tbody/tr/td[6]/a");
	By limittext=By.id("del_limit");
	By updatebutton=By.name("Update");
	
	public ManageContentPage(WebDriver driver) {
		this.driver=driver;
	}

	public void ManageContentClick() {
		
		driver.findElement(managecontent).click();
		driver.findElement(managecontact).click();
		
	}
	
	
	public void EditButtonClick() {
		
		driver.findElement(editbutton).click();
		
		
	}
	
	public void UpdateDetails() {
		
		
		driver.findElement(updatebutton).click();
		
	}
}
