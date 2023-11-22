import java.util.ArrayList;

public class Admins {

	private String fullName;
	private String email;
	private String password;
	public boolean loggedin = false;
	public static ArrayList <Product> ProductList = new ArrayList<Product>();
	public Admins () {}
	public Admins( String fullName ,String email,String password) {
		this.email = email;
		this.fullName=fullName;
		this.password = password;
	}
	public  String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	   	 
}
