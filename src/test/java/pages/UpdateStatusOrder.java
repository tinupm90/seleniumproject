package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UpdateStatusOrder {
	
	WebDriver driver;
	By changestatus=By.xpath("/html/body/div[1]/div[1]/section/div[4]/div[3]/table/tbody/tr[1]/td[6]/a[1]");
	By status=By.id("status");
	By updatebutton=By.name("Update_st");
	public UpdateStatusOrder(WebDriver driver) {
		
		this.driver=driver;
		
	}

	public void ChangeStatusButtonclick() {
		
		driver.findElement(changestatus).click();
	}
	
	public void UpdateStatus() {
		WebElement dropdown=driver.findElement(status);
		dropdown.click();
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		driver.findElement(updatebutton).click();
	}
}
