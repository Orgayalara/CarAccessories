import javax.mail.MessagingException;

public class Installar {

	private String fullName;
	private String email;
	private String password;
	public boolean loggedin=false;

	public Installar () {}
	public Installar(String fullName , String email ,String password) {
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
	 public boolean reqstatus(String status,String email) throws MessagingException {
	                    SendMail.getSendEmail(status, email);
	   return true;
	 }
}


