import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShowProductTest {

	@Given("Product.")
	public void product() {

	}

	@When("when admins request to see the Product.")
	public void when_admins_request_to_see_the_product() {
	   
	}

	@Then("View the Product.")
	public void view_the_product() {
//		ArrayList <Product> ProductList = new ArrayList<Product>();
		CarsAccessories.ProductInformation();
		int n=1;
	    assertTrue(CarsAccessories.catalog(1));
	
	}

}
