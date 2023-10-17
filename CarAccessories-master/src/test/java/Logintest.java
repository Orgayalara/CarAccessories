import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	Users newuser=new Users();
	boolean verification;
boolean verification1;
boolean verification2;
@When("admin enters email <{string}> and password <{string}>")
public void adminEntersEmailAndPassword(String string, String string2) {

    
}

@Then("Show admin page and success message")
public void showAdminPageAndSuccessMessage() {
    // Write code here that turns the phrase above into concrete actions
	
	 equals( CarsAccessories.login("Bayan@example.com","1122")== "admin");
 
}

@Then("Show error message.")
public void showErrorMessage() {
	 equals( CarsAccessories.login("Bayan@example.com","115622") == "none");

    // Write code here that turns the phrase above into concrete actions
    
}

@When("customer enters email <{string}> and password <{string}>")
public void customerEntersEmailAndPassword(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("Show customer page and success message")
public void showCustomerPageAndSuccessMessage() {
    // Write code here that turns the phrase above into concrete actions
	 equals( CarsAccessories.login("aya@example.com","123")== "Customer");
}

@Then("Show not correct email message")
public void showNotCorrectEmailMessage() {
    // Write code here that turns the phrase above into concrete actions
	 equals( CarsAccessories.login("ayayara@example.com","123")!= "Customer");
    
}

@When("installer enters email <{string}> and password <{string}>")
public void installerEntersEmailAndPassword(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("Show installer page and success message")
public void showInstallerPageAndSuccessMessage() {
    // Write code here that turns the phrase above into concrete actions
	 equals( CarsAccessories.login("Marwa@example.com","3344") == "installar");

}


}
