import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class Users {

//Logger logger = Logger.getLogger(Users.class.getName());
	private String fullName;
	private String email;
	private String password;
	private String contactNumber;
	private String shippingAddress;
	private int numberOfCar;
	private String typeOfCar;
	private String historyOrder;


	//boolean loggedIn = false;

	
	
	
	public Users () {}
	public Users(String fullName , String email,String password,String contactNumber,String shippingaddress,int numberOfCar,String typeOfCar, String historyOrder) {
		this.fullName=fullName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this. shippingAddress =  shippingAddress;
		this.numberOfCar = numberOfCar;
		this.typeOfCar = typeOfCar;
		this.historyOrder = historyOrder;
	}
	
//	public Users() {
//		this.fullname = null;
//		this.contactnumber = null;
//		this.password = null;
//		this.shippingaddress=null;
//		this.email=null;
//	}

	public  String getEmail() {
		return email;
	}
	public void UpdateEmail(String newEmail) {
		this.email=newEmail;
	}
	public void UpdatecontactNumber(String newcontactNumber) {
		this.contactNumber=newcontactNumber;
	}
	public void UpdateshippingAddress(String newshippingAddress) {
		this.shippingAddress=newshippingAddress;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public  String getshippingaddress() {
		return shippingAddress;
	}

	public void setshippingaddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getnumber() {
		return contactNumber;
	}

	public void setnumber(String contactnumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setfullname(String fullName) {
		this.fullName = fullName;
	}

	public String getfullname() {
		return fullName;
	}
	public  int getnumberOfCar() {
		return numberOfCar;
	}
	public void setnumberOfCar(int numberOfCar) {
		this.numberOfCar = numberOfCar;
	}
	
	public  String gettypeOfCar() {
		return typeOfCar;
	}
	public void settypeOfCar(String typeOfCar) 
	{
		this.typeOfCar = typeOfCar;
	}
	
	
	public  String gethistoryOrder() {
		return historyOrder;
	}
	public void sethistoryOrder(String historyOrder) 
	{
		this.historyOrder = historyOrder;
	}
	
	public String toString() {
		return "customer: " + getfullname() + " - Email: " + getEmail();
	}

	


}
