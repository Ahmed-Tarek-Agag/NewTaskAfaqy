package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.ProductPage;

public class HomeTest extends TestBase {

	HomePage HomeObject;
	ProductPage ProductObject;
	AddToCartPage AddObject;

	@Test (priority =0)
	public void NinjaStore ()
	{
		HomeObject = new HomePage(driver);
		HomeObject.openAllDesktopPage();
		
		ProductObject = new ProductPage(driver);
		ProductObject.OpenandScroll();
		ProductObject.choosProduct();
		
		AddObject = new AddToCartPage(driver);
		AddObject.AddtoCart();
		Assert.assertTrue(AddObject.confirmMessage.getText().contains("Success: You have added Sony VAIO to your shopping cart!"));	
	}


}
