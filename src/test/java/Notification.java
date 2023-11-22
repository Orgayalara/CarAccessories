import io.cucumber.java.en.Given;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Notification {
	String reqdetails;
	boolean orderstate = true;
	Product hood = new Product("Hood","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",5500,"the color is black","KIA sorento");
	Users aya =new Users("Aya","ayahazeem3@gmail.com","123","059874","Nablus",12589,"BMW","");
	Installar x=new Installar("Marwa","s12043062@stu.najah.edu","3344");
	
	InstallationRequest newinstreq=new InstallationRequest(hood, aya, new Date(), "NEW");
	
	@Given("a customer has placed an order")
	public void aCustomerHasPlacedAnOrder() {
		Order ayasorder=new Order(hood, aya, new Date(),true );
	}

	@When("the order is confirmed")
	public void theOrderIsConfirmed() {
	    
	}

	@Then("the customer receives an order confirmation notification")
	public void theCustomerReceivesAnOrderConfirmationNotification() {
	assertTrue(aya.orderStatus(orderstate, "ayahazeem3@gmail.com")); 
	}

	@When("there is a change in the order status")
	public void thereIsAChangeInTheOrderStatus() {
	   orderstate=false;
	}

	@Then("the customer receives a notification about the updated order status")
	public void theCustomerReceivesANotificationAboutTheUpdatedOrderStatus() 
	{
		assertFalse(aya.orderStatus(orderstate, "ayahazeem3@gmail.com"));
	}

	@Given("there is a new installation request")
	public void thereIsANewInstallationRequest() {
		
	}

	@When("installers are notified")
	public void installersAreNotified() {
		 reqdetails=newinstreq.getStatus()+""
          		+ ""+newinstreq.getCustomer()+""
          		+ ""+newinstreq.getProduct()+""
          		+ ""+newinstreq.getPreferredDate();
	}

	@Then("installers receive a notification about the new request")
	public void installersReceiveANotificationAboutTheNewRequest() {
	    assertTrue(x.reqstatus(reqdetails, x.getEmail()));
	}
}
