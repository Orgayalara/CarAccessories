import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Search {

	@Given("The customer gives the first syllable of the product name.")
	public void the_customer_gives_the_first_syllable_of_the_product_name() {
		assertTrue(true);

	}

	@Then("Finds all products that start with the entered clip.")
	public void finds_all_products_that_start_with_the_entered_clip() {
		CarsAccessories.productInformation();
		String s = "Ho";
		assertTrue(CarsAccessories.search(s));
	}
}
