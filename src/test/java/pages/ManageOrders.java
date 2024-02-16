package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageOrders {
	
	WebDriver driver;
	By orders=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[2]/a/p");
	By searchbutton=By.xpath("/html/body/div[1]/div[1]/section/div[1]/a[1]");
	By userid=By.id("um");
	By paymentmode=By.id("pt");
	By status=By.id("st");
	By search=By.xpath("//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[7]/button[1]");
	
	public ManageOrders(WebDriver driver) {
		
		this.driver=driver;
			}
	
	public void ManageordersClick() {
		driver.findElement(orders).click();
		
	}
	public void SearchClick() {
		
		driver.findElement(searchbutton).click();
	}
	
public void SetSearchItems(String userid1,String paymentmode1,String status1) {
		
		driver.findElement(userid).sendKeys(userid1);
		driver.findElement(paymentmode).sendKeys(paymentmode1);
		driver.findElement(status).sendKeys(status1);	
		
		
	}
	
	public void Searchbutton() {
		driver.findElement(search).click();
	}
	

}
