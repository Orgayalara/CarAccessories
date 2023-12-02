
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
	private int Availability;
	boolean isInternal;
	boolean isExternal;
	boolean isElectronics; 
	public Product() {}
	public Product(String Name , String Photo , int Price , String Details , String Type , int Availability , boolean Internal , boolean External , boolean Electronics) {
		this.Name = Name; 
		this.Photo = Photo;
		this.Price = Price;
		this.Details = Details;
		this.Type = Type;
		this.isInternal = Internal;
		this.isExternal = External;
		this.isElectronics = Electronics ;
		this.Availability = Availability;
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
	
	public void setAvailability(int Availability) {
		this.Availability = Availability;
	}
	public int getAvailability() {
		return Availability;
	}
	
	
	public void setInternal(boolean  Internal) {
		this.isInternal = Internal;
	}
	public boolean getInternal () {
		return isInternal;
	}
	
	public void setExternal(boolean  External) {
		this.isExternal = External;
	}
	public boolean getExternal () {
		return isExternal;
	}
	

	public void setElectronics(boolean  Electronics) {
		this.isElectronics = Electronics;
	}
	public boolean getElectronics () {
		return isElectronics;
	}
	
}
