package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver driver;
	By userid=By.id("um");
	By paymentmode=By.id("pt");
	By status=By.id("st");
	By search=By.xpath("//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[7]/button[1]");
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
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
