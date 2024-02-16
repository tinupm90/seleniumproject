package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Browsers;
import pages.LoginPage;
import pages.ManageExpensePage;

public class ManageExpensePageTesting {
	
	@Test
	public void ManageExpenseTest() {
		
		WebDriver driver=Browsers.SetBrowsers("https://groceryapp.uniqassosiates.com/admin/login", "chrome");
		LoginPage login=new LoginPage(driver);
		login.Setcredentials("admin", "admin");
		login.LoginButton();
		ManageExpensePage manage=new ManageExpensePage(driver);
		manage.ManageExpenseclick();
		manage.ExpenseCategoryclick();
		manage.AddNewExpense("test4");
		System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/section/div[2]/div/div[4]/div[2]/table/tbody/tr[2]/td[1]")).getText());
		
		WebElement text=driver.findElement(By.xpath("//td[contains(text(),test4)]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(text));
		if(text!=null) {
			System.out.println("text added");
		}else {
			System.out.println("not added");
		}
		
		
		
	}

}
