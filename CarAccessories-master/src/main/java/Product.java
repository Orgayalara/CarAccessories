
public class Product {
    
//	1. name 
//	photo
//	price 
//	 details
//	 type of car can apply 
	
	private String Name;
	private String Photo;
	private int Price;
	private String Details;
	private String Type;
	
	public Product() {}
	public Product(String Name , String Photo , int Price , String Details , String Type ) {
		this.Name = Name; 
		this.Photo = Photo;
		this.Price = Price;
		this.Details = Details;
		this.Type = Type;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	
	public void setPhoto(String Photo) {
		this.Photo = Photo;
	}
	public String getPhoto() {
		return Photo;
	}
	
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public int getPrice() {
		return Price;
	}
	
	
	public void setDetails(String Details) {
		this.Details = Details;
	}
	public String getDetails() {
		return Details;
	}
	
	
	public void setType(String Type) {
		this.Type = Type;
	}
	public String getType() {
		return Type;
	}
	
}
