package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteItem {
	WebDriver driver;
	By deletebutton=By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[3]/table/tbody/tr[1]/td[7]/a[2]");
	By rowdetails=By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[3]/table/tbody/tr[1]/td[1]");
	public DeleteItem(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String Delete() {
		
		driver.findElement(deletebutton).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();

		String detail=driver.findElement(rowdetails).getText();
		return detail;
		
	}
	

}
