import java.util.ArrayList;
import java.util.Scanner;

public class CarsAccessories {
	static String Email;
	private static String userType = "none" ;
	public static ArrayList <Users> CustomerList = new ArrayList<Users>();
	public static ArrayList <Admins> AdminList = new ArrayList<Admins>();
	public static ArrayList <Installar> InstallarList = new ArrayList<Installar>();
	public static ArrayList <Product> ProductList = new ArrayList<Product>();
	public static void setUserType(String type) {
		userType = type;
	}
	static Scanner input2 = new Scanner(System.in);
	public static String getUserType() {
		return userType;
	}
    public static void ProductInformation() {
    	
    	
		
		
    	Product p1 = new Product("Hood","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",5500,"the color is black","KIA sorento");
    	Product p2 = new Product("Serpentine_belt","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",100,"the color is black","KIA sorento");
    	Product p3 = new Product("Alloy_wheel","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",1600,"the color is black","KIA sorento");
    	Product p4 = new Product("Vehicle_mat","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",900,"the color is black","KIA sorento");
    	Product p5 = new Product("Mud_Flap","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",500,"the color is black","KIA sorento");

    	ProductList.add(p1);
    	ProductList.add(p2);

    	ProductList.add(p3);

    	ProductList.add(p4);

    	ProductList.add(p5);
    }
    public static Product addInfoProduct() {
    	System.out.println("Enter Your Name Product:");
		String Name = input2.next();
		System.out.println("Enter Your Photo Product:");
		String Photo = input2.next();
		System.out.println("Enter Your Price Product:");
		int Price = input2.nextInt();
		System.out.println("Enter Your Details Product:");
		String Details = input2.next();
		System.out.println("Enter Your Type Product:");
		String Type = input2.next();
		
		Product Product1 = new Product(Name,Photo,Price,Details,Type);
    	return Product1;
    		
        
    }
    public static Users addInfoCustomersAcount() {
    	System.out.println("Enter the  Name of Customer:");
    	String Name = input2.next();
    	System.out.println("Enter the  Email of Customer:");
    	String Email = input2.next();
    	System.out.println("Enter the  Password of Customer:");
    	String Password = input2.next();
    	System.out.println("Enter the  Contact Number of Customer:");
    	String  ContactNumber = input2.next();
    	System.out.println("Enter the  Shipping Address of Customer:");
    	String ShippingAddress = input2.next();
    	System.out.println("Enter the  Number Of Car of Customer:");
    	int  NumberOfCar = input2.nextInt();
    	System.out.println("Enter the  Type Of Car of Customer:");
    	String TypeOfCar = input2.next();
    	
    	String HistoryOrder = " ";
    	
    	Users user1 = new Users(Name,Email,Password,ContactNumber,ShippingAddress,NumberOfCar,TypeOfCar,HistoryOrder);
    	return user1;
    }
    
    
    //    addProduct
    public static boolean addProduct(Product p) {
    	boolean flag=false; 
    	ProductList.add(p);
		System.out.println("Done added !");
		flag=true; 
    	return flag;
    }
    public static boolean addCustomersAcounts(Users p) {
    	boolean flag=false; 
    	CustomerList.add(p);
		System.out.println("Done added !");
		flag=true; 
    	return flag;
    }

    public static void showMenuForNone() {
			System.out.println("you are not user in this system ! \n please sign up ner user or again log in  ");
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
	
    public static void showMenuForCus() {
		System.out.println("in cus menu");

    }
  
    public static boolean removeProduct(String s) {
    	 boolean	flag=false;
    	 for (int i =0 ; i<ProductList.size();i++) {
    		 if(ProductList.get(i).getName().equals(s)) {
    			 ProductList.remove(i);
    			 flag=true;
    					 
    		 }
    	 }
    	 
    	 return flag;
    }
    public static boolean removeCustomersAcount(String u) {
   	 boolean	flag=false;
	 for (int i =0 ; i<CustomerList.size();i++) {
		 if(CustomerList.get(i).getfullname().equals(u)) {
			 CustomerList.remove(i);
			 flag=true;
					 
		 }
	 }
	 
	 return flag;
}
    
    
    public static boolean editProduct(String s , int n  , String w) {
   	 boolean	flag=false;
    	int p;
   	 for (int i =0 ; i<ProductList.size();i++) {
   		 if(ProductList.get(i).getName().equals(s)) {
   			
   			if(n == 1) {
   	    	    ProductList.get(i).setName(w);
   	    	 System.out.println("The Edit Name is Done");
   	    	 flag=true;
   			}
   			else if(n == 2)
   			{
   				ProductList.get(i).setPhoto(w);
   				System.out.println("The Edit Photo is Done");
   				flag=true;
   			}
   			 
   			else if(n == 3) {
   				 p = Integer.parseInt(w) ;
   				ProductList.get(i).setPrice(p);
   				System.out.println("The Edit Price is Done");
   				flag=true;
   			}
   			else if(n == 4) {
   				
   				ProductList.get(i).setDetails(w);
   				System.out.println("The Edit Details is Done");
   				flag=true;
   			}
   			else if(n == 5) {
   				ProductList.get(i).setType(s);
   				System.out.println("The Edit Type is Done");
   				flag=true;	 
   			}
   		 }
   	 }
   	 
   	 return flag;
   }
    public static boolean ShowAllProduct() {
    boolean	flag=false;
    	for (Product Products : ProductList) {
    		System.out.print("name :");
    		System.out.println(Products.getName());
    		System.out.print("photo :");
    		System.out.println(Products.getPhoto());
    		System.out.print("Price :");
    		System.out.println(Products.getPrice());
    		System.out.print("Details :");
    		System.out.println(Products.getDetails());
    		System.out.print("type of car can apply  :");
    		System.out.println(Products.getType());
    		System.out.println("____________________________________________________________________________________________________________");

    		flag=true;
    	}
    	
		return flag;}
    
    public static boolean viweCustomersAcounts() {
    	
    	 boolean	flag=false;
    	for (Users Customer : CustomerList) {
    		System.out.print("fullName :");
    		System.out.println(Customer.getfullname());
    		System.out.print("Email :");
    		System.out.println(Customer.getEmail());
    		System.out.print("Password :");
    		System.out.println(Customer.getPassword());
    		System.out.print("contact Number :");
    		System.out.println(Customer.getnumber());
    		System.out.print("shipping address  :");
    		System.out.println(Customer.getshippingaddress());
    		System.out.print("number Of Car :");
    		System.out.println(Customer.getnumberOfCar());
    		System.out.print("type Of Car :");
    		System.out.println(Customer.gettypeOfCar());
    		System.out.print("history Order :");
    		System.out.println(Customer.gethistoryOrder());
    		System.out.println("____________________________________________________________________________________________________________");

    		flag=true;
    	}
    	
		return flag;
    }
    public static void showMenuForAd( ) {
    	System.out.println("in admin menu");
    	System.out.println("Enter : \n1) Show all Product.\n2) Remove Product.\n3) Add product.\n4) Update to any product.\n5) Viwe all Customers Acounts.\n6) Manage the Customers Acounts.  \n8) log out");
    	int num = input2.nextInt();
switch(num) {
		
		case 1 :ShowAllProduct();
		showMenuForAd();
			
				
		           break; 
		           
		case  2 :System.out.println("Enter Name item to removing");
		for (Product Products : ProductList) {
    		System.out.println(Products.getName());}
		System.out.println("____________");
    		String s = input2.next();
			removeProduct(s);
			showMenuForAd();
		          break;
		          
		case 3 :addProduct(addInfoProduct());
		showMenuForAd();
		break;
			   
		case 4 :System.out.println("Enter Name item to Editing");
		for (Product Products : ProductList) {
    		System.out.println(Products.getName());}
		System.out.println("____________");
    		String e = input2.next();
    		System.out.println("1.Edit Name  \n2.Edit Photo \n3.Edit Price \n4.Edit Details \n5.Edit Type ");
    		int n = input2.nextInt();
    		System.out.println("Enter the value:  ");
    		String w = input2.next();

			editProduct(e,n,w);
		showMenuForAd();
		break;
		
		case 5 :viweCustomersAcounts();
		showMenuForAd();
		break;
		
		case 6 :System.out.println("1. Add Customer Acount.\n2. RemoveCustomer Acount.\n ");
		int number = input2.nextInt();
		if(number == 1) {
			addCustomersAcounts(addInfoCustomersAcount());
		showMenuForAd();
		}
		if(number == 2) {
			System.out.println("Enter Name of Acount to removing");
			for (Users user : CustomerList) {
	    		System.out.println(user.getfullname());}
			System.out.println("____________");
	    		String u = input2.next();
				removeCustomersAcount(u);
				showMenuForAd();
				
		}
        break;
		  default:showMenuForAd();
		   break;
		}
    }
   

    public static void showMenuForIns( ) {
    	System.out.println("in ins menu");
    }

    public static Users FullInformationToSignUp() {
    
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
    	else 	{flag= true; showMenuForNone();}

return flag;
	
    	
    }
	

    public static String login(String Email , String passWord) {
    	
    	
    	Users UserNumber1 = new Users("Aya","aya@example.com","123","059874","Nablus",12589,"BMW","");
    	Users UserNumber2 = new Users("LARA","lara@example.com","456","056987","jenin",4587,"marceds","");
    	Users UserNumber3 = new Users("batool","batool@example.com","789","05684","Ramalla",4658,"seat","");
    	CustomerList.add(UserNumber1);
    	CustomerList.add(UserNumber2);
    	CustomerList.add(UserNumber3);
//    	2 admin 
    	Admins AdminNumber1 = new Admins("Bayan","Bayan@example.com","1122");
    	AdminList.add(AdminNumber1);
    	Admins AdminNumber11 = new Admins("1","1","1");
    	AdminList.add(AdminNumber11);

//    	2installar
    	Installar InstallarNumber1 = new Installar("Marwa","Marwa@example.com","3344");
    	InstallarList.add(InstallarNumber1);


    	
    	
    	
for (Users user : CustomerList) {
			
			if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
				
					setUserType("Customer");
				}
			
					
			}

//for admin
for (Admins Admin : AdminList) {
	
	if ((Admin.getEmail() .equals(Email))&&(Admin.getPassword().equals(passWord))) {
		
			setUserType("admin");
		}
	
			
	}
//for installar
for (Installar installar : InstallarList) {
	
	if ((installar.getEmail() .equals(Email))&&(installar.getPassword().equals(passWord))) {
		
			setUserType("installer");
		}
	
			
	}

			
		
		
		
    	

		return getUserType();  

    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInformation();
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
