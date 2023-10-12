import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class Users {

	Logger logger = Logger.getLogger(Users.class.getName());
	private String fullname;
	private String email;
	private String password;
	private String contactnumber;
	private String shippingaddress;
	boolean loggedIn = false;

	
	public Users() {
		this.fullname = null;
		this.contactnumber = null;
		this.password = null;
		this.shippingaddress=null;
		this.email=null;
	}

	public  String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public  String getshippingaddress() {
		return shippingaddress;
	}

	public void setshippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public String getnumber() {
		return contactnumber;
	}

	public void setnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public void setfullname(String fullname) {
		this.fullname = fullname;
	}

	public String getfullname() {
		return fullname;
	}

	public boolean isLoggedin() {
		return loggedIn;
	}
	public String toString() {
		return "customer: " + getfullname() + " - Email: " + getEmail();
	}

	public void logOut() {
		loggedIn = false;
	}


}
