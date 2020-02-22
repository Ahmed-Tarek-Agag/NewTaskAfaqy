package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{

	public ProductPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor)driver;
	}

	@FindBy (xpath = "//a[contains(text(),'Sony VAIO')]")
	WebElement ChooseProduct;
	
	public void OpenandScroll() 
	{
		scrollButton();
	}
	public void choosProduct() 
	{
		clickButton(ChooseProduct);
	}
	
}
