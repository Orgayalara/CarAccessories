public class ReviewsandRatings {

	public int Ratings;
	public String Reviews;
	public String NameOfProduct;
	public String Email;
	

    public ReviewsandRatings(int Ratings ,String Reviews , String NameOfProduct , String Email ){
    	this.Ratings = Ratings;
        this.Reviews = Reviews;
        this.NameOfProduct = NameOfProduct;
        this.Email = Email;
	}
    public int getRatings() {
        return Ratings;
    }

    
    public String getReviews() {
        return Reviews;
    }

   
    public String getNameOfProduct() {
        return NameOfProduct;
    }

    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
  
    
}
