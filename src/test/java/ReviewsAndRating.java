import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ReviewsAndRating {

@Given("the user left a comment and rated it")
public void the_user_left_a_comment_and_rated_it() {
  
}

@Then("the moderator should see this comment")
public void the_moderator_should_see_this_comment() {
  
	ReviewsandRatings r= new ReviewsandRatings(5 ,"nice" , "Hood" , "lara@example.com" );
	
	assertTrue(CarsAccessories.funReviewsandRatings(r));
	assertTrue(CarsAccessories.ShowTheReviewsAndRatings());
}
}
