import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductTest {

	@Given("Name item for Removing.")
	public void name_item_for_removing() {
		assertTrue(true);

	}

	@When("admins remove the Product.")
	public void admins_remove_the_product() {
		assertTrue(true);

	}

	@Then("Remove the Product")
	public void remove_the_product() {
		CarsAccessories.productInformation();
		assertTrue(CarsAccessories.removeProduct("Hood"));
	}

}
