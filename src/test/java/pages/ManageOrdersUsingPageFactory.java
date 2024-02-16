package pages;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageOrdersUsingPageFactory {

	@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[2]/a/p")
	WebElement orders;
	@FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/a[1]")
	WebElement searchbutton;
	@FindBy(id = "um")
	WebElement userid;
	@FindBy(id = "pt")
	WebElement paymentmode;
	@FindBy(id = "st")
	WebElement  status;
	@FindBy(xpath = "//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[7]/button[1]")
	WebElement  search;
	
	WebDriver driver;
	
	public ManageOrdersUsingPageFactory(WebDriver driver1) {
		this.driver=driver1;
		
	}
	
	
	public void ManageOrders(String userid1,String paymentmode1,String status1) {
		
		orders.click();
		searchbutton.click();
		userid.sendKeys(userid1);
		paymentmode.sendKeys(paymentmode1);
		status.sendKeys(status1);
		search.click();
		
	}
	
	
	

}
