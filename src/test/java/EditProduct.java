import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProduct {

	@When("Admin Edit Product .")
	public void admin_edit_product() {
		assertTrue(true);

	}

	@Then("Edit the Product .")
	public void edit_the_product() {
		CarsAccessories.productInformation();
		assertTrue(CarsAccessories.editProduct("Hood",1,"Hod"));
		assertTrue(CarsAccessories.editProduct("Hod",2,"15fh324r"));
		assertTrue(CarsAccessories.editProduct("Hod",3,"5700"));
		assertTrue(CarsAccessories.editProduct("Hod",4,"the_color_is_red"));
		assertTrue(CarsAccessories.editProduct("Hod",5,"Jeep"));
		assertTrue(CarsAccessories.editProduct("Hod",6,"2"));
		assertTrue(CarsAccessories.editProductboolean("Hod",7,false));
		assertTrue(CarsAccessories.editProductboolean("Hod",8,false));
		assertTrue(CarsAccessories.editProductboolean("Hod",9,false));
	}

}
