import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegTesting {
Users newuser= new Users();
Users newuser2= new Users();

@Given("a potential customer visits the car accessories sales and installation application")
public void aPotentialCustomerVisitsTheCarAccessoriesSalesAndInstallationApplication() {
newuser2.setEmail("ahmed@example.com");
}

@When("the user wishes to create a new account")
public void theUserWishesToCreateANewAccount() {

}

@When("the user provides the following valid information:")
public void theUserProvidesTheFollowingValidInformation(io.cucumber.datatable.DataTable dataTable) {
newuser.setfullname(dataTable.cell(0, 1)); 
newuser.setEmail(dataTable.cell(1, 1)); 
newuser.setPassword(dataTable.cell(2, 1)); 
newuser.setnumber(dataTable.cell(3, 1)); 
newuser.setshippingaddress(dataTable.cell(4, 1)); 
allusers.addUser(newuser);
assertTrue(allusers.searchUser(dataTable.cell(1, 1)));
}

@When("submits the registration form")
public void submitsTheRegistrationForm() {

}
@Then("the system should Display a success message")
public void theSystemShouldDisplayASuccessMessage() {
	System.out.println("succes !");
}

@When("the user provides the following invalid information:")
public void theUserProvidesTheFollowingInvalidInformation(io.cucumber.datatable.DataTable dataTable) {
	 String actualVal = dataTable.cell(0, 1);
	 String expectedVal = "Aya AWWAD";
	 assertNotEquals(expectedVal, actualVal);
}

@Then("the system should Display an error message")
public void theSystemShouldDisplayAnErrorMessage() {
System.out.println("Invalid Information");
}

@When("the user provides the following information:")
public void theUserProvidesTheFollowingInformation(io.cucumber.datatable.DataTable dataTable) {

}

@When("there is an existing user account with the email {string}")
public void thereIsAnExistingUserAccountWithTheEmail(String string) {
	 String actualVal = string;
	 String expectedVal = newuser2.getEmail();
	    assertEquals(expectedVal, actualVal);
}

@Then("the system should Display an error message indicating that the email address is already registered")
public void theSystemShouldDisplayAnErrorMessageIndicatingThatTheEmailAddressIsAlreadyRegistered() {
	System.out.println("Email already exists");
}

}
