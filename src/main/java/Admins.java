
public class Admins {
//updated
	private String fullName;
	private String email;
	private String password;
	public boolean loggedin = false;
	public Admins( String fullName ,String email,String password) {
		this.email = email;
		this.fullName=fullName;
		this.password = password;
	}
	public  String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}

	

	
	   	 
}
