package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basefileautomation.BaseFile;
import io.cucumber.java.en.And;

public class SearchProduct extends BaseFile {

	@And("^Search some product$")
	public void search_some_product() {
		WebElement type = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		type.sendKeys("jeans");
		WebElement enter = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		enter.click();

	}

}
