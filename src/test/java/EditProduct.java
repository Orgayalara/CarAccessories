import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProduct {

	@When("Admin Edit Product .")
	public void admin_edit_product() {
	   
	}

	@Then("Edit the Product .")
	public void edit_the_product() {
		CarsAccessories.ProductInformation();
		assertTrue(CarsAccessories.editProduct("Hood",1,"Hod"));
		assertTrue(CarsAccessories.editProduct("Hod",2,"15fh324r"));
		assertTrue(CarsAccessories.editProduct("Hod",3,"5700"));
		assertTrue(CarsAccessories.editProduct("Hod",4,"the_color_is_red"));
		assertTrue(CarsAccessories.editProduct("Hod",5,"Jeep"));
		
	}

}
