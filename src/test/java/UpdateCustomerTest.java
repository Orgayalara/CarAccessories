import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCustomerTest {
	Users u=new Users();
	int updateemail;
	int updatecontactNumber;
	int updateshippingAddress;
	
	
	@Given("a logged-in customer on the car accessories")
	public void aLoggedInCustomerOnTheCarAccessories() {
	    
	}

	@When("the customer enter <{int}> to update your email address")
	public void theCustomerEnterToUpdateYourEmailAddress(Integer int1) {
		updateemail=int1;
	}

	@Then("customer email address should be updated to <{string}>")
	public void customerEmailAddressShouldBeUpdatedTo(String string) {
	    u.UpdateEmail(string);
	    assertTrue(updateemail==1 && u.getEmail().equals(string));
	}

	@When("the customer enter <{int}> to update your contactNumber")
	public void theCustomerEnterToUpdateYourContactNumber(Integer int1) {
		updatecontactNumber=int1;
	}

	@Then("customer contactNumber should be updated to <{string}>")
	public void customerContactNumberShouldBeUpdatedTo(String string) {
		
		u.UpdatecontactNumber(string);
		assertTrue(updatecontactNumber==2 && u.getnumber().equals(string));
	}

	@When("the customer enter <{int}> to update your shippingAddress")
	public void theCustomerEnterToUpdateYourShippingAddress(Integer int1) {
		updateshippingAddress=int1;
	}

	@Then("customer shippingAddress should be updated to <{string}>")
	public void customerShippingAddressShouldBeUpdatedTo(String string) {
	    
		
		u.UpdateshippingAddress(string);
		assertTrue(updateshippingAddress==3 && u.getshippingaddress().equals(string));
	}


}
