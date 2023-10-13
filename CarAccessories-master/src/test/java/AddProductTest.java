import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductTest {

	@Given("informatiom about  Product .")
	public void informatiom_about_product() {
	   
	}

	@When("Admin Add Product .")
	public void admin_add_product() {
	 
	}

	@Then("Add the Product .")
	public void add_the_product() {

		Product p = new Product("Mud Flap5","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",5500,"the color is red","KIA sorento");
		assertTrue(CarsAccessories.addProduct(p));
	}
}
