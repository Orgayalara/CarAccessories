import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCustomersAcounts {

	@Given("Customers Acounts.")
	public void customers_acounts() {
		assertTrue(true);

	}

	@When("when admins request to see the Customers Acounts.")
	public void when_admins_request_to_see_the_customers_acounts() {
		assertTrue(true);

	}

	@Then("View the Customers Acounts.")
	public void view_the_customers_acounts() {
		CarsAccessories.login("LARA" , "456");
	    assertTrue(CarsAccessories.viweCustomersAcounts());
	}
}
