import io.cucumber.java.en.Given;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ROLE {
	Admins admin=new Admins("ahmed","ahmed@gmail.com","12456");
	Users cus=new Users("Ayara","ayamed@example.com","582","852","Nablus",852,"seaat","");
	Installar inst=new Installar("mohamad","mohamad@test","1234");
@Given("an admin user is logged in")
public void anAdminUserIsLoggedIn() {
  admin.loggedin=true;
}

@Then("they should see the admin menu")
public void theyShouldSeeTheAdminMenu() {
 assertTrue(CarsAccessories.showMenuForAd());
}

@Given("a customer is logged in")
public void aCustomerIsLoggedIn() {
  cus.loggedIn=true;  
}

@Then("they should see the Customer menu")
public void theyShouldSeeTheCustomerMenu() {
CarsAccessories.showMenuForCus();
}

@Given("an installer is logged in")
public void anInstallerIsLoggedIn() {
  inst.loggedin=true;
}

@Then("they should see the Installer menu")
public void theyShouldSeeTheInstallerMenu() {
	assertTrue(CarsAccessories.showMenuForIns()); 
}

}
