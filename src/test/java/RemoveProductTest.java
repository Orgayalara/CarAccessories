import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductTest {

	@Given("Name item for Removing.")
	public void name_item_for_removing() {
	 
	}

	@When("admins remove the Product.")
	public void admins_remove_the_product() {

	}

	@Then("Remove the Product")
	public void remove_the_product() {
		CarsAccessories.ProductInformation();
		assertTrue(CarsAccessories.removeProduct("Hood"));
	}

}
