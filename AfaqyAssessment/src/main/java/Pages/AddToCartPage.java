package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase {

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id="input-quantity")
	WebElement QTY;
	
	@FindBy (id="button-cart")
	WebElement addToCartButton;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement confirmMessage;
	
	public void AddtoCart() 
	{
		clearText(QTY);
		sendText(QTY, "2");
		clickButton(addToCartButton);
	}
}
