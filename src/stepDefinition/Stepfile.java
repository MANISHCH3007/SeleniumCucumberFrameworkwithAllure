package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basefileautomation.BaseFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import search.SearchProduct;


public class Stepfile extends BaseFile{
	
	@Given("^Navigate to the URL$")
	public void navigate_to_the_url() throws IOException {
		
		launchbrowser();
	    
	}
	@And("^Search some product$")
	public void search_some_product() {
		SearchProduct sp = new SearchProduct();
		sp.search_some_product();

	
	}

}
