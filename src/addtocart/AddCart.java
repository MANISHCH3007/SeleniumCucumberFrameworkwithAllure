package addtocart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basefileautomation.BaseFile;
import io.cucumber.java.en.Then;

public class AddCart extends BaseFile {
	
	
	@Then("^Add to cart$")
	public void add_to_cart()
	
	{
	 WebElement addcart= driver.findElement(By.xpath("null"));
	addcart.click();
	}
	
	
	

}
