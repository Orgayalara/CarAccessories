public class ReviewsandRatings {

	public int Ratings;
	public String Reviews;
	public String NameOfProduct;
	public String Email;
	
	public ReviewsandRatings(){
		
	}
    public ReviewsandRatings(int Ratings ,String Reviews , String NameOfProduct , String Email ){
    	this.Ratings = Ratings;
        this.Reviews = Reviews;
        this.NameOfProduct = NameOfProduct;
        this.Email = Email;
	}
    public int getRatings() {
        return Ratings;
    }

    public void setRatings(int Ratings) {
        this.Ratings = Ratings;
    }
    public String getReviews() {
        return Reviews;
    }

    public void setReviews(String Reviews) {
        this.Reviews = Reviews;
    }
    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String NameOfProduct) {
        this.NameOfProduct = NameOfProduct;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
  
    
}
