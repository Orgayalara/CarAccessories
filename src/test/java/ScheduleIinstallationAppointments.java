import static org.junit.Assert.assertTrue;

import java.util.Date;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScheduleIinstallationAppointments {
   
	@Given("appointments")
	public void appointments() {
		assertTrue(true);

	}

	@Then("Specific appointments are scheduled.")
	public void specific_appointments_are_scheduled() {
		
		CarsAccessories.productInformation();
		assertTrue(rolemaintest.scheduleAppointment());	}
	

	
}
