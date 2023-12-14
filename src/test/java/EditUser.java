import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditUser {
    private String username;	
    Users cus=new Users("AYAAWWAD","ayahazeem3@gmail.com","123","056","Nablus",12589,"BMW","");


    @Given("the user {string} is logged in")
    public void the_user_is_logged_in(String username) {
        this.username = username;
        cus.loggedIn=true;  
        CarsAccessories.CustomerList.add(cus);

    }

    @When("the user updates their profile with new information")
    public void the_user_updates_their_profile_with_new_information() {
        CarsAccessories.editProfile(username);
    }

    @Then("the user's profile should be updated successfully")
    public void the_user_s_profile_should_be_updated_successfully() {
    	 Users updatedUser = getUserByUsername(username);

         System.out.println("Updated User Details:");
         System.out.println("Full Name: " + updatedUser.getfullname());
         System.out.println("Email: " + updatedUser.getEmail());
         System.out.println("Password: " + updatedUser.getPassword());
         System.out.println("Contact Number: " + updatedUser.getnumber());

         assertTrue(updatedUser.getfullname().equals("AYAAWWAD"));
         assertTrue(updatedUser.getEmail().equals("ayahazeem3@gmail.com"));
         assertTrue(updatedUser.getPassword().equals("123"));
         assertTrue(updatedUser.getnumber().equals("056"));
    }

    public Users getUserByUsername(String username) {
        for (Users user : CarsAccessories.CustomerList) {
            if (user.getfullname().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
