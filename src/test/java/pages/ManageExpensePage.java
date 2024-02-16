package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageExpensePage {
	WebDriver driver;
	By manageexpense=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[4]/a/p");
	By expensecategory=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[4]/ul[1]/li/a/p");
	By newbutton=By.xpath("/html/body/div/div[1]/section/div[1]/a[1]");
	By item=By.id("name");
	By submit=By.name("Create");
	
	public ManageExpensePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ManageExpenseclick() {
		
		driver.findElement(manageexpense).click();
	}
	public void ExpenseCategoryclick() {
		driver.findElement(expensecategory).click();
	}

	public void AddNewExpense(String expense) {
		driver.findElement(newbutton).click();
		driver.findElement(item).sendKeys(expense);
		driver.findElement(submit).click();
		
		
	}
}
