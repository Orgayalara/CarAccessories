import java.util.ArrayList;
import java.util.Scanner;

public class CarsAccessories {
	static String Email;
	private static String userType = "none" ;
	public static ArrayList <Users> CustomerList = new ArrayList<Users>();
	public static void setUserType(String type) {
		userType = type;
	}	
	public static String getUserType() {
		return userType;
	}
	
	
    public static void showMenuForCus() {
		System.out.println("in cus menu");

    }
    public static void showMenuForAd( ) {
    }
    public static void showMenuForIns( ) {
    }
//    signup
    public static Users FullInformationToSignUp() {
    	Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Your fullName:");
		String fullName = input2.next();
		System.out.println("Enter Your Email:");
		String Email = input2.next();
		System.out.println("Enter Your password:");
		String password = input2.next();
		System.out.println("Enter Your contactNumber:");
		String contactNumber = input2.next();
		System.out.println("Enter Your shippingAddress:");
		String shippingAddress = input2.next();
		System.out.println("Enter Your numberOfCar:");
		int numberOfCar = input2.nextInt();
		System.out.println("Enter Your typeOfCar:");
		String typeOfCar = input2.next();
//		System.out.println("Enter Your historyOrder:");
//		String historyOrder = input2.next();
		Users newUser = new Users(fullName,Email,password,contactNumber,shippingAddress,numberOfCar,typeOfCar,"");
    	return newUser;
    }
    public static boolean signup(Users U) {
//    	print 1 enter name , email 
    	
    	CustomerList.add(U);
    	
		System.out.println("done ! you are user please log in ");
		
		

    	return true;
		
    }
    public static boolean showMenu(String type ) {
    	boolean flag=false;
    	if (type.equals("Customer")) {flag= true; showMenuForCus();}
    	else     	if (type.equals("admin")) {flag= true;showMenuForAd();}
    	else if (type.equals("installer")) {flag= true;showMenuForIns();}
    	else 	flag= false;

return flag;
	
    	
    }
	
//	login
    public static String login(String Email , String passWord) {
    	
    	
    	Users UserNumber1 = new Users("Aya","aya@example.com","123","059874","Nablus",12589,"BMW","");
    	Users UserNumber2 = new Users("LARA","lara@example.com","456","056987","jenin",4587,"marceds","");
    	Users UserNumber3 = new Users("batool","batool@example.com","789","05684","Ramalla",4658,"seat","");
    	CustomerList.add(UserNumber1);
    	CustomerList.add(UserNumber2);
    	CustomerList.add(UserNumber3);
    	
    	
for (Users user : CustomerList) {
			
			if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
				
					setUserType("Customer");
				}
			
					
			}

////for admin
//for (Users user : CustomerList) {
//	
//	if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
//		
//			setUserType("admin");
//		}
//	
//			
//	}
//for installer
//for (Users user : CustomerList) {
//	
//	if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
//		
//			setUserType("installer");
//		}
//	
//			
//	}

			
		
		
		
    	

		return getUserType();  

    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input2 = new Scanner(System.in);
		System.out.println("1.Enter To Sign Up");
		System.out.println("2.Enter To log in");
		int num = input2.nextInt();
		if ( num ==1 ) {
			signup(FullInformationToSignUp());
			num=2;
		}
		if (num==2){
			System.out.println("Enter your Email please");

		
		Email = input2.next();
		System.out.println("Enter your password please");
		String pass = input2.next();
		
		
		showMenu(login(Email , pass));}
	}

}
