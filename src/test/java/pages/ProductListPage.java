package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

public class ProductListPage {
	
	WebDriver driver;
	
	By manageproduct=By.xpath("/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[3]/a/p");
	By row=By.xpath("/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr");
	By colum=By.xpath("/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td");
	
	public ProductListPage(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public void ManageProduct() {
		
		
		driver.findElement(manageproduct).click();
		
	}
	
	public void ProductList() {
		
		List<WebElement> rows=driver.findElements(row);
		List<WebElement> columns=driver.findElements(colum);
		
		int numrow=rows.size();
		int numcolum=columns.size();
		//System.out.println(numcolum);
		//System.out.println(numrow);
		int i,j;
		for(i=1;i<=numrow;i++) {
			for(j=1;j<=numcolum;j++) {
				
				System.out.print(driver.findElement(By.xpath("/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
				
		System.out.println();
		
		
	}
	}
}
