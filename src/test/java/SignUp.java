import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp {
	@Given("infomation about user.")
	public void infomation_about_user() {
		assertTrue(true);

	}

	@When("user request to sign up.")
	public void user_request_to_sign_up() {
		assertTrue(true);
	   
	}

	@Then("the user added to customer list and will apper log in screen")
	public void the_user_added_to_customer_list_and_will_apper_log_in_screen() {
		Users u=new Users("Ayaramm","ayaahmed@example.com","582","852","Nablus",852,"seaat","");
		assertTrue(CarsAccessories.signup(u));
	     
	}


}
