package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductListPageUsingPageFactory {
	@FindBy()
	WebDriver driver;
	
	public ProductListPageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
	}

}
