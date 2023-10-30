import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageCustomersAcounts {

	@Given("informatiom about  Customer Acount  .")
	public void informatiom_about_customer_acount() {
	   
	}

	@When("Admin Add Customer Acount  .")
	public void admin_add_customer_acount() {
	   
	}

	@Then("Add Customer Acount  .")
	public void add_customer_acount() {
		Users u = new Users("bana","nana@example.com","12366","05669874","Nablus",125589,"BMW5","");
		assertTrue(CarsAccessories.addCustomersAcounts(u));
	}

	@When("Admin Remove Customer Acount  .")
	public void admin_remove_customer_acount() {
	 
	}

	@Then("Remove Customer Acount  .")
	public void remove_customer_acount() {
		CarsAccessories.login("LARA" , "456");
		String name = "LARA";
		assertTrue(CarsAccessories.removeCustomersAcount(name));
	}
}
