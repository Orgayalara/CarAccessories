import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.mail.MessagingException;

import com.sun.tools.javac.main.Main;

public class CarsAccessories {
	private static final String NAME = "name :";
	private static final String PHOTO = "photo :";
	private static final String PRICE = "price :";
	private static final String DETAILS = "details :";
	private static final String TYPE = "type of car can apply :";
	private static final String KIA_SORENTO ="KIA sorento";
	private static final String COLOR ="the color is black";
	private static final String DONE ="Done added !";
	private static final String EMAIL ="Enter your Email please";
	private static final String PASS ="Enter your password please";
	private static final String CUSTOMER =" - Customer: ";
	private static final String DATE =" - Preferred Date: ";
	private static final String STATUS =" - Status: ";
	private static final String SDASH ="____________";
	private static final String DASH ="========================";
	private static final String DDASH = "____________________________________________________________________________________________________________";
	private static final Logger LOGGER =  Logger.getLogger(CarsAccessories.class.getName());
	//new
	static String currentuser;
	static String EMAIL1;
	private static String userType = "none" ;
    private static ArrayList<Order> orders = new ArrayList<Order>();
	public static ArrayList <Users> CUSTOMERLIST = new ArrayList<Users>();
	public static ArrayList <Admins> ADMINLIST = new ArrayList<Admins>();
	public static ArrayList <Installar> INSTALLERLIST  = new ArrayList<Installar>();
    public static ArrayList<InstallationRequest> INSTREQUEST = new ArrayList<InstallationRequest>();
    public static ArrayList<InstallationRequest> INST_REQUEST_WITH_DATE_AND_DETAILS = new ArrayList<InstallationRequest>();
    public static ArrayList <Product> PRODUCTLIST = new ArrayList<Product>();
    public static ArrayList <Product> SEARCHLIST = new ArrayList<Product>();
    public static ArrayList <ReviewsandRatings> REVIEWS_AND_RATINGS_LIST = new ArrayList<ReviewsandRatings>();
	public static void setUserType(String type) {
		userType = type;
	}
	static Scanner input2 = new Scanner(System.in);
	public static String getUserType() {
		return userType;
	}
	 public static void orderInformation() {
		 Product sampleProduct = new Product("Mirror", " ", 100, "The Color is red", "BMW", 5 , false , true , false);
	        Users sampleCustomer = new Users("Loai", "Loai@example.com", "48965", "123456", "Nablus", 1710, "Sample Car", "");

	        Order newOrder = new Order(sampleProduct, sampleCustomer, new Date(),true);
	        orders.add(newOrder);
	 }
	 public static void instRequestInformation() {
		  Product sampleProduct = new Product("MudFlap","",890,"the color is Pink","Honday", 4 , false , true , false);
	        Users sampleCustomer = new Users("Ashraf", "Ashraf@example.com", "7895", "123456", "Awarta", 230, "Sample Car", "");

	        InstallationRequest request1 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Pending");
	        InstallationRequest request2 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Approved");

	        INSTREQUEST.add(request1);
	        INSTREQUEST.add(request2);
	
	 }
	 public static int infoProductcatalog() {
		 
		LOGGER.info("\n1.Internal \n2.External \n3.Electronics");
			return input2.nextInt();
	 }
	 public static boolean isInternal(int i)
	 {
		 return PRODUCTLIST.get(i).getInternal() == true ;
	 }
	 public static boolean isExternal(int i)
	 {
		 return PRODUCTLIST.get(i).getExternal() == true ;
	 }
	 public static boolean isElectronics(int i)
	 {
		 return PRODUCTLIST.get(i).getElectronics() == true ;
	 }
	 public static boolean cAtalog(int n) {
		
		
			switch(n) {
			
			case 1:
				LOGGER.info("Internal :\n");
		             for (int i =0 ; i<PRODUCTLIST.size();i++) {
    		         if(isInternal(i) ) {
    			 
    		        	  LOGGER.info(NAME + PRODUCTLIST.get(i).getName());
		            	   LOGGER.info(PHOTO + PRODUCTLIST.get(i).getPhoto());
		            	   LOGGER.info(PRICE + PRODUCTLIST.get(i).getPrice());
		            	   LOGGER.info(DETAILS + PRODUCTLIST.get(i).getDetails());
		            	   LOGGER.info(TYPE + PRODUCTLIST.get(i).getType());
    		    		
    		        	 LOGGER.info(DASH);

    					 
    		             }
                       	 }
		            
		           break;
			case 2 :
			         	LOGGER.info("External :\n");
	                   for (int i =0 ; i<PRODUCTLIST.size();i++) {
		               if(isExternal(i) ) {
			 
		            	   LOGGER.info(NAME + PRODUCTLIST.get(i).getName());
		            	   LOGGER.info(PHOTO + PRODUCTLIST.get(i).getPhoto());
		            	   LOGGER.info(PRICE + PRODUCTLIST.get(i).getPrice());
		            	   LOGGER.info(DETAILS + PRODUCTLIST.get(i).getDetails());
		            	   LOGGER.info(TYPE + PRODUCTLIST.get(i).getType());
		               
				    
		               LOGGER.info(DASH);

							 
		                 }
                      	 }
	                   
	               break;
			case 3 :
				         LOGGER.info("Electronics :\n");
                          for (int i =0 ; i<PRODUCTLIST.size();i++) {
	                      if(isElectronics(i)) {
		 
	                    	  LOGGER.info(NAME + PRODUCTLIST.get(i).getName());
	                    	  LOGGER.info(PHOTO + PRODUCTLIST.get(i).getPhoto());
	                    	  LOGGER.info(PRICE + PRODUCTLIST.get(i).getPrice());
	                    	  LOGGER.info(DETAILS + PRODUCTLIST.get(i).getDetails());
	                    	  LOGGER.info(TYPE + PRODUCTLIST.get(i).getType());
	                      

	    			    	
	                    	  LOGGER.info(DASH);

	    						 
	    	                 }
	                   	 }
                         
	                break;
	                default:  break;
	                
	    }
			
			return true;
	}
     public static void productInformation() {
    	

    	Product p1 = new Product("Hood"," ",5500,COLOR,KIA_SORENTO,2, false , true , false);
    	Product p2 = new Product("Serpentine_belt"," ",100,COLOR,KIA_SORENTO, 3, false , false , true);
    	Product p3 = new Product("Holloy_wheel"," ",1600,COLOR,KIA_SORENTO, 6, false , true , false);
    	Product p4 = new Product("Vehicle_mat"," ",900,COLOR,KIA_SORENTO,1 , true , false, false);
    	Product p5 = new Product("Mud_Flap"," ",500,COLOR,KIA_SORENTO,4, false , true , false);

    	PRODUCTLIST.add(p1);
    	PRODUCTLIST.add(p2);

    	PRODUCTLIST.add(p3);

    	PRODUCTLIST.add(p4);

    	PRODUCTLIST.add(p5);
    }
    public static Product addInfoProduct() {
    	 LOGGER.info("Enter Your Name Product:");
		String NAME1 = input2.next();
		 LOGGER.info("Enter Your Photo Product:");
		String PHOTO1 = input2.next();
		 LOGGER.info("Enter Your Price Product:");
		int Price = input2.nextInt();
		 LOGGER.info("Enter Your Details Product:");
		String DETAILS1 = input2.next();
		 LOGGER.info("Enter Your Type Product:");
		String TYPE1 = input2.next();
		 LOGGER.info("Enter the number of available pieces of the product:");
		int AVILABILITY1 = input2.nextInt();
		 LOGGER.info("Is internal?:");//TODO
		boolean ISINTERNAL1 = input2.nextBoolean();
		 LOGGER.info("Is External?:");//TODO
		boolean ISEXTERNAL1 = input2.nextBoolean();
		 LOGGER.info("Is Electronics?:");//TODO
		boolean ISELECTRONICS1 = input2.nextBoolean();
		
		Product PRODUCT1 = new Product(NAME1,PHOTO1,Price,DETAILS1,TYPE1,AVILABILITY1,ISINTERNAL1,ISEXTERNAL1,ISELECTRONICS1);
    	return PRODUCT1;
    		
        
    }
    public static Users addInfoCustomersAcount() {
    	 LOGGER.info("Enter the  Name of Customer:");
    	String NAME2 = input2.next();
    	 LOGGER.info("Enter the  Email of Customer:");
    	String EMAIL2 = input2.next();
    	 LOGGER.info("Enter the  Password of Customer:");
    	String PASSWORD = input2.next();
    	 LOGGER.info("Enter the  Contact Number of Customer:");
    	String  CONTACTNUMBER = input2.next();
    	 LOGGER.info("Enter the  Shipping Address of Customer:");
    	String SHIPPINGADDRESS = input2.next();
    	 LOGGER.info("Enter the  Number Of Car of Customer:");
    	int  NUMBEROFCAR = input2.nextInt();
    	 LOGGER.info("Enter the  Type Of Car of Customer:");
    	String TYPEOFCAR = input2.next();
    	
    	String HISTORYORDER = " ";
    	
    	Users user1 = new Users(NAME2,EMAIL2,PASSWORD,CONTACTNUMBER,SHIPPINGADDRESS,NUMBEROFCAR,TYPEOFCAR,HISTORYORDER);
    	return user1;
    }
    
  
    //    addProduct
    public static boolean addProduct(Product p) {
    	 LOGGER.info(" in add !");

    	boolean flag=false; 
    	PRODUCTLIST.add(p);
    	 LOGGER.info(DONE);
		flag=true; 
    	return flag;
    }
    public static boolean addCustomersAcounts(Users p) {
    	boolean flag=false; 
    	CUSTOMERLIST.add(p);
    	 LOGGER.info(DONE);
		flag=true; 
    	return flag;
    }

    public static void showMenuForNone() throws MessagingException {
    	      LOGGER.info("you are not user in this system ! \n please sign up ner user or again log in  ");
    	      LOGGER.info("1.Enter To Sign Up");
    	      LOGGER.info("2.Enter To log in");
			int num = input2.nextInt();
			if ( num ==1 ) {
				signup(fullInformationToSignUp());
				num=2;
			}
			if (num==2){
				 LOGGER.info(EMAIL);

			
			EMAIL1 = input2.next();
			 LOGGER.info(PASS);
			String pass = input2.next();
			
			
			showMenu(login(EMAIL1 , pass));}
	    }
	
    public static boolean showMenuForCus() throws MessagingException {
        Scanner scanner = new Scanner(System.in);
    	for (int i =0 ; i<CUSTOMERLIST.size();i++) {
   		 if(CUSTOMERLIST.get(i).getEmail().equals(EMAIL1)) {
   			currentuser = CUSTOMERLIST.get(i).getfullname();
   			
   			break;
   		 }
    	}

    	
    		
    	       LOGGER.info("===== Customer Menu =====");
    	       LOGGER.info("1. Browse Products");
    	       LOGGER.info("2. Make a Purchase");
    	       LOGGER.info("3. View Order History");
    	       LOGGER.info("4. Request an Installtion");
    	       LOGGER.info("5. Reviews and Ratings.");
    	       LOGGER.info("6. Edit Profile");
    	       LOGGER.info("7. Search");
    	       LOGGER.info("8. Logout");
    	       LOGGER.info("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

			switch (choice) {
                case 1:
                    browseProducts();
                    showMenuForCus();
                    break;
                case 2:
                    makePurchase(currentuser);
                    showMenuForCus();
                    break;
                case 3:
                    viewOrderHistory(currentuser);
                    showMenuForCus();
                    break;
                case 4:
                	requestanInstalltion(currentuser);
                	showMenuForCus();
                    break;
                case 5:
                	funReviewsandRatings(infReviewsandRatings());
                    showMenuForCus();
                    break;
                    //
                case 6:
                    editProfile(currentuser);
                    showMenuForCus();
                    break;
                case 7: 
                	 LOGGER.info("Enter the beginning of the name of the product you want to search for: ");
            		String partfromName = input2.next();
                	search(partfromName);
                    showMenuForCus();
                	break;
                case 8:
                	 LOGGER.info("Logging out from customer account.");
                    loginmain();
                    break;
                default:
                	 LOGGER.info("Invalid choice. Please enter a valid option.");
                    showMenuForCus();
            }
			   return true;  }
		

   
  
    public static void editProfile(String USERNAME) {
        for (Users customer : CUSTOMERLIST) {
            if (customer.getfullname().equals(USERNAME)) {
                Scanner scanner = new Scanner(System.in);
                LOGGER.info("Editing profile for user: " + USERNAME);
//
                // Prompt the user to enter new details
                LOGGER.info("Enter new full name: ");
                String newFullName = scanner.nextLine();
                LOGGER.info("Enter new email: ");
                String newEmail = scanner.nextLine();
                LOGGER.info("Enter new Password: ");
                String newPass = scanner.nextLine();
                LOGGER.info("Enter new contact number: ");
                String newContactNumber = scanner.nextLine();

                customer.setfullname(newFullName);
                customer.setEmail(newEmail);
                customer.setnumber(newContactNumber);
                customer.setPassword(newPass);

                LOGGER.info("Profile updated successfully!");
                return;
            }
        }

        LOGGER.info("User not found. Unable to edit profile.");
    }


     
	public static void requestanInstalltion(String CURRENTUSER) throws MessagingException {
		LOGGER.info("===== Request an Installtion =====");
         browseProducts();

         Scanner scanner = new Scanner(System.in);

         LOGGER.info("Enter the name of the product you want to Install: ");
        
         String productName = scanner.nextLine();
         String reqdetails;
         String instemail = INSTALLERLIST.get(0).getEmail();
         Product selectedProduct = null;
         
         for (Product product : PRODUCTLIST) {
             if (product.getName().equalsIgnoreCase(productName)) {
                 selectedProduct = product;
                 InstallationRequest instreq = new InstallationRequest(selectedProduct, CUSTOMERLIST.get(0), new Date(), "New inst req");             
                 INSTREQUEST.add(instreq);
                 reqdetails=instreq.getStatus()+""
                 		+ ""+instreq.getCustomer()+""
                 		+ ""+instreq.getProduct()+""
                 		+ ""+instreq.getPreferredDate();
                 LOGGER.info("installtion req is successful. Thank you for shopping!");
                SendMail.getSendEmail(reqdetails, instemail);
                 break;
             }
         }

         if (selectedProduct == null) {
        	 LOGGER.info("Purchase unsuccessful. Product is unavailable!");
         }
     }
   
	
	public static int browseProducts() {
		LOGGER.info("===== Browse Products =====");
     
		cAtalog(infoProductcatalog());
    return 1; }

    public static void makePurchase(String Customer) throws MessagingException {
    	LOGGER.info("===== Make a Purchase =====");
        browseProducts();

        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Enter the name of the product you want to purchase: ");
        String productName = scanner.nextLine();
        boolean state=false;
        Product selectedProduct = null;
        for (Product product : PRODUCTLIST) {
            if (product.getName().equalsIgnoreCase(productName)) {
                selectedProduct = product;
                state =true;
                Order order = new Order(selectedProduct, CUSTOMERLIST.get(0), new Date() , true);   
                orders.add(order);
                CUSTOMERLIST.get(0).orderStatus(state, EMAIL1);
                LOGGER.info("Purchase successful. Thank you for shopping!");
                break;
            }
        }

        if (selectedProduct == null) {
        	LOGGER.info("Purchase unsuccessful. Product is unavailable!");
        }
    }
  

    public static void viewOrderHistory(String Customer) {
    	LOGGER.info("===== Order History =====");
        for (Order order : orders) {
            if (order.getCustomer().getfullname().equals(Customer)) {
            	LOGGER.info("Product: " + order.getProduct().getName() + " - Price: $" + order.getProduct().getPrice());
            }
        }
    }

   
	public static boolean removeProduct(String s) {
    	 boolean	flag=false;
    	 for (int i =0 ; i<PRODUCTLIST.size();i++) {
    		 if(PRODUCTLIST.get(i).getName().equals(s)) {
    			 PRODUCTLIST.remove(i);
    			 flag=true;
    					 
    		 }
    	 }
    	 
    	 return flag;
    }
    public static boolean removeCustomersAcount(String u) {
   	 boolean	flag=false;
	 for (int i =0 ; i<CUSTOMERLIST.size();i++) {
		 if(CUSTOMERLIST.get(i).getfullname().equals(u)) {
			 CUSTOMERLIST.remove(i);
			 flag=true;
					 
		 }
	 }
	 
	 return flag;
}
    
    public static boolean editProductboolean(String s , int n  , boolean b )
    {
    	boolean	flag=false;
    	 for (int i =0 ; i<PRODUCTLIST.size();i++) {
       		 if(PRODUCTLIST.get(i).getName().equals(s)) {
       			 if(n == 7) {
       				 
       				PRODUCTLIST.get(i).setInternal(b);
       				LOGGER.info("The Edit isInternal is Done");
       				flag=true;	 
       			}
       			else if(n == 8) {
       				
       				PRODUCTLIST.get(i).setExternal(b);
       				LOGGER.info("The Edit isExternal is Done");
       				flag=true;	 
       			}
       			else if(n == 9) {
       				
       				PRODUCTLIST.get(i).setElectronics(b);
       				LOGGER.info("The Edit isElectronics is Done");
       				flag=true;	 
       			}
              }
       		 }
    	return flag;
    }
    public static boolean editProduct(String s , int n  , String w ) {
   	 boolean	flag=false;
    	int p;
   	 for (int i =0 ; i<PRODUCTLIST.size();i++) {
   		 if(PRODUCTLIST.get(i).getName().equals(s)) {
   			
   			if(n == 1) {
   				PRODUCTLIST.get(i).setName(w);
   	    	 LOGGER.info("The Edit Name is Done");
   	    	 flag=true;
   			}
   			else if(n == 2)
   			{
   				PRODUCTLIST.get(i).setPhoto(w);
   				LOGGER.info("The Edit Photo is Done");
   				flag=true;
   			}
   			 
   			else if(n == 3) {
   				 p = Integer.parseInt(w) ;
   				PRODUCTLIST.get(i).setPrice(p);
   				LOGGER.info("The Edit Price is Done");
   				flag=true;
   			}
   			else if(n == 4) {
   				
   				PRODUCTLIST.get(i).setDetails(w);
   				LOGGER.info("The Edit Details is Done");
   				flag=true;
   			}
   			else if(n == 5) {
   				PRODUCTLIST.get(i).setType(s);
   				LOGGER.info("The Edit Type is Done");
   				flag=true;	 
   			}
   			else if(n == 6) {
  				 p = Integer.parseInt(w) ;
  				PRODUCTLIST.get(i).setAvailability(p);
  				LOGGER.info("The Edit Availability is Done");
  				flag=true;
  			}
   		
   		 }
   	 }
   	 
   	 return flag;
   }
  
    
    public static boolean viweCustomersAcounts() {
    	
    	 boolean	flag=false;
    	for (Users Customer : CUSTOMERLIST) {
    		LOGGER.info("fullName: " + Customer.getfullname());
    		LOGGER.info("Email: " + Customer.getEmail());
    		LOGGER.info("Password: " + Customer.getPassword());
    		LOGGER.info("contact Number: " + Customer.getnumber());
    		LOGGER.info("shipping address: " + Customer.getshippingaddress());
    		LOGGER.info("number Of Car: " + Customer.getnumberOfCar());
    		LOGGER.info("type Of Car: " + Customer.gettypeOfCar());
    		LOGGER.info("history Order: " + Customer.gethistoryOrder());
        
    		LOGGER.info(DASH);

    		flag=true;
    	}
    	
		return flag;
    }
    public static boolean showMenuForAd( ) throws MessagingException {
    	LOGGER.info("===== Admin Menu =====");
    	LOGGER.info("Enter : \n1)Ptoduct Catalog.\n2) Remove Product.\n3) Add product.\n4) Update to any product.\n5) Viwe all Customers Acounts.\n6) Manage the Customers Acounts. \n7) Schedule and manage installation appointments."
        		+ "\n8) Show The Reviews And Ratings. \n9) log out");
    	int num = input2.nextInt();
switch(num) {
		
		case 1 :cAtalog(infoProductcatalog());
		showMenuForAd();
			
				
		  break; 
		           
		case  2 :LOGGER.info("Enter Name item to removing");
		for (Product Products : PRODUCTLIST) {
			LOGGER.info(Products.getName());}
		LOGGER.info(SDASH);
    		String s = input2.next();
			removeProduct(s);
			showMenuForAd();
		          break;
		          
		case 3 :addProduct(addInfoProduct());
		showMenuForAd();
		break;
			   
		case 4 :LOGGER.info("Enter Name item to Editing");
		for (Product Products : PRODUCTLIST) {
			LOGGER.info(Products.getName());}
		LOGGER.info(SDASH);
    		String e = input2.next();
    		LOGGER.info("1.Edit Name  \n2.Edit Photo \n3.Edit Price \n4.Edit Details \n5.Edit Type \n6.Availability \n7.Edit isInternal \n8.Edit isExternal \n9.Edit isElectronics");
    		int n = input2.nextInt();
    		
            if(n <= 6)
            {
            	LOGGER.info("Enter the value:  ");
    		    String w = input2.next();
    		    editProduct(e,n,w );
            }
            else if (n > 6)
            {
            	LOGGER.info("Enter the value:  ");
    		    boolean b = input2.nextBoolean();
            	editProductboolean(e,n,b );
            }
			
		showMenuForAd();
		break;
		
		case 5 :viweCustomersAcounts();
		showMenuForAd();
		break;
		
		case 6 :LOGGER.info("1. Add Customer Acount.\n2. RemoveCustomer Acount.\n ");
		int number = input2.nextInt();
		if(number == 1) {
			addCustomersAcounts(addInfoCustomersAcount());
		showMenuForAd();
		}
		if(number == 2) {
			LOGGER.info("Enter Name of Acount to removing");
			for (Users user : CUSTOMERLIST) {
				LOGGER.info(user.getfullname());}
			LOGGER.info(SDASH);
	    		String u = input2.next();
				removeCustomersAcount(u);
				showMenuForAd();
				
		}
        break;
		case 7 : viewInstRequestWithDateAndDetails();
		         showMenuForAd();
		         break;
		case 8 : showTheReviewsAndRatings();
        showMenuForAd();
        break;
		case 9 : loginmain();
		break;
		  default:showMenuForAd();
		   break;
		}

    return true;}
    public static ReviewsandRatings infReviewsandRatings() {
   
		String EMAIL3 = CUSTOMERLIST.get(0).getEmail();
		LOGGER.info("Enter the Name of Product:");
		String NAMEOFPRODUCT3 = input2.next();
		LOGGER.info("Rate the product from 1 to 5, where 5 is the best: 1 2 3 4 5");
		int RATE = input2.nextInt();
		LOGGER.info("Enter Your Review :");
		String REVIEW = input2.next();
		
		 ReviewsandRatings R= new ReviewsandRatings(RATE,REVIEW,NAMEOFPRODUCT3,EMAIL3);
    	return R;
		
    }
    public static  boolean funReviewsandRatings(ReviewsandRatings r) {
    	
    	REVIEWS_AND_RATINGS_LIST.add(r);
    		LOGGER.info(DONE);
    	return true;
    }
    public static boolean showTheReviewsAndRatings() {
    
    		for (ReviewsandRatings show : REVIEWS_AND_RATINGS_LIST) {
    			LOGGER.info("Email: " + show.getEmail());
    			LOGGER.info("Name Of Product: " + show.getNameOfProduct());
    			LOGGER.info("Rate: " + show.getRatings());
    			LOGGER.info("Review: " + show.getReviews());
        		
        		LOGGER.info(DASH);

          
        }
    	return true;
    }
    public static boolean viewInstRequestWithDateAndDetails(){
    	
    	
    	for (int i = 0; i < INST_REQUEST_WITH_DATE_AND_DETAILS.size(); i++) {
            InstallationRequest REQUEST = INST_REQUEST_WITH_DATE_AND_DETAILS.get(i);
            LOGGER.info((i + 1) + ") Product: " + REQUEST.getProduct().getName() +
            		CUSTOMER + REQUEST.getCustomer().getfullname() +
                    DATE+ REQUEST.getPreferredDate() +
                    STATUS + REQUEST.getStatus() + 
                    " - Details Form: " + REQUEST.getdetailsForm());
        }
    	
    	return true;
    }
    public static boolean showMenuForIns() throws MessagingException {
        Scanner scanner = new Scanner(System.in);

        LOGGER.info("===== Installer Menu =====");
        LOGGER.info("Enter:\n1) View Installation Requests.\n2) Schedule Appointment And Form to specify installation details.\n3) Logout");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                viewInstallationRequestsForInstaller();
                showMenuForIns();
                break;
            case 2:
                scheduleAppointment();
                showMenuForIns();
                break;
            case 3:
            	LOGGER.info("Logging out from installer account.");
                loginmain();
                break;
            default:
            	LOGGER.info("Invalid choice. Please enter a valid option.");
                showMenuForIns();
        }

        return true;
    }
    public static void loginmain() throws MessagingException {
    	productInformation();
		Scanner input2 = new Scanner(System.in);
		LOGGER.info("\n========================");
		LOGGER.info("1.Sign Up");
		LOGGER.info("2.log in");
		LOGGER.info("3.Exit the program");
		LOGGER.info(DDASH);
		int num = input2.nextInt();
		if ( num ==1 ) {
			signup(fullInformationToSignUp());
			num=2;
		}
		if (num==2){
			LOGGER.info(EMAIL);
			EMAIL1 = input2.next();
		LOGGER.info(PASS);
		String pass = input2.next();
		showMenu(login(EMAIL1 , pass));}
		if (num==3)
		{
			LOGGER.info("Thanks for visiting the programs");
			System.exit(0);
		}
	}
    public static boolean scheduleAppointment() {
    	boolean flag=false;
    	Scanner scanner = new Scanner(System.in);

    	LOGGER.info("===== Schedule Appointment =====");

        // Display available installation requests
    	LOGGER.info("Available Installation Requests:");
        for (int i = 0; i < INSTREQUEST.size(); i++) {
            InstallationRequest REQUEST = INSTREQUEST.get(i);
            LOGGER.info((i + 1) + ") Product: " + REQUEST.getProduct().getName() +
            		CUSTOMER + REQUEST.getCustomer().getfullname() +
            		DATE+ REQUEST.getPreferredDate() +
            		STATUS + REQUEST.getStatus());
        }
         flag = true;
        // Ask the installer to choose an installation request
         LOGGER.info("Enter the number of the installation request you want to schedule: ");
        int requestNumber = scanner.nextInt();

        if (requestNumber >= 1 && requestNumber <= INSTREQUEST.size()) {
            // Get the selected installation request
            InstallationRequest selectedRequest = INSTREQUEST.get(requestNumber - 1);

            // Ask for appointment details
            LOGGER.info("Enter the appointment date (yyyy-MM-dd HH:mm): ");
            String dateString = scanner.next() + " " + scanner.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date appointmentDate;
            try {
                appointmentDate = dateFormat.parse(dateString);
            } catch (Exception e) {
            	LOGGER.info("Invalid date format. Please enter date in the format yyyy-MM-dd HH:mm.");
                return false;
            }

            selectedRequest.setPreferredDate(appointmentDate);
            selectedRequest.setStatus("Scheduled");
            LOGGER.info("Enter the preferred date and car model: ");
            String dateAndmodel = scanner.next();
            selectedRequest.setdetailsForm(dateAndmodel);
            INST_REQUEST_WITH_DATE_AND_DETAILS.add(selectedRequest);
            LOGGER.info("Appointment scheduled successfully for the selected installation request.");
        } else {
        	LOGGER.info("Invalid installation request number.");
        }
        return true;
        
    }		
	
	private static void viewInstallationRequestsForInstaller() {
		LOGGER.info("===== View Installation Requests =====");
        for (InstallationRequest request : INSTREQUEST) {
        	LOGGER.info("Product: " + request.getProduct().getName() +
        			CUSTOMER + request.getCustomer().getfullname() +
        			DATE + request.getPreferredDate() +
        			STATUS + request.getStatus());
        }

        
    }

    public static Users fullInformationToSignUp() {
    
    	LOGGER.info("Enter Your fullName:");
		String fullName = input2.next();
		LOGGER.info("Enter Your Email:");
		String Email = input2.next();
		LOGGER.info("Enter Your password:");
		String password = input2.next();
		LOGGER.info("Enter Your contactNumber:");
		String contactNumber = input2.next();
		LOGGER.info("Enter Your shippingAddress:");
		String shippingAddress = input2.next();
		LOGGER.info("Enter Your numberOfCar:");
		int numberOfCar = input2.nextInt();
		LOGGER.info("Enter Your typeOfCar:");
		String typeOfCar = input2.next();
		Users newUser;
		return  newUser = new Users(fullName,Email,password,contactNumber,shippingAddress,numberOfCar,typeOfCar,"");
    	 
    	
    }
    public static boolean signup(Users U) {
    	
    	CUSTOMERLIST.add(U);
    	
    	LOGGER.info("done ! you are user please log in ");
		
		

    	return true;
		
    }
    public static boolean showMenu(String type ) throws MessagingException {
    	boolean flag=false;
    	if (type.equals("Customer"))
    	{flag= true; showMenuForCus();}
    	else     	if (type.equals("admin"))
    	{flag= true;showMenuForAd();}
    	
    	else if (type.equals("installer")) {flag= true;showMenuForIns();}
    	else 	{flag= true; showMenuForNone();}

return flag;
	
    	
    }
    
    public static boolean search(String s) {
		
		for(int i =0 ; i <PRODUCTLIST.size(); i++ )
		{
			if ((PRODUCTLIST.get(i).getName()).startsWith(s))
			{
				SEARCHLIST.add(PRODUCTLIST.get(i));
			}
			
				
		}
		for (Product product: SEARCHLIST)
		{
			LOGGER.info(NAME + product.getName());
			LOGGER.info(PHOTO + product.getPhoto());
	        LOGGER.info(PRICE + product.getPrice());
	        LOGGER.info(DETAILS + product.getDetails());
	        LOGGER.info(TYPE + product.getType());
	        LOGGER.info("The product isInternal?: " + product.getInternal());
	        LOGGER.info("The product isExternal?: " + product.getExternal());
	        LOGGER.info("The product isElectronics?: " + product.getElectronics());
	    
    		LOGGER.info(DASH);//TODO

		}

		return true;
	}

    public static String login(String Email , String passWord) {
    	
    	
    	Users UserNumber1 = new Users("AYAAWWAD","ayahazeem3@gmail.com","123","056","Nablus",12589,"BMW","");
    	Users UserNumber2 = new Users("LARA","lara@example.com","456","056987","jenin",4587,"marceds","");
    	Users UserNumber3 = new Users("batool","batool@example.com","789","05684","Ramalla",4658,"seat","");
    	Users UserNumber4 = new Users("2","2","2","2","2",2,"2","");
    	CUSTOMERLIST.add(UserNumber1);
    	CUSTOMERLIST.add(UserNumber2);
    	CUSTOMERLIST.add(UserNumber3);
    	CUSTOMERLIST.add(UserNumber4);

    	Admins AdminNumber1 = new Admins("Bayan","Bayan@example.com","1122");
    	ADMINLIST.add(AdminNumber1);
    	Admins AdminNumber11 = new Admins("1","1","1");
    	ADMINLIST.add(AdminNumber11);


    	Installar InstallarNumber1 = new Installar("Marwa","s12043062@stu.najah.edu","3344");
    	INSTALLERLIST.add(InstallarNumber1);
    	Installar InstallarNumber2 = new Installar("3","3","3");
    	INSTALLERLIST.add(InstallarNumber2);

    	
    	
    	
for (Users user : CUSTOMERLIST) {
			
			if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
				
					setUserType("Customer");
				}
			
					
			}

for (Admins Admin : ADMINLIST) {
	
	if ((Admin.getEmail() .equals(Email))&&(Admin.getPassword().equals(passWord))) {
		
			setUserType("admin");
		}
	
			
	}
for (Installar installar : INSTALLERLIST) {
	
	if ((installar.getEmail() .equals(Email))&&(installar.getPassword().equals(passWord))) {
		
			setUserType("installer");
		}
	
			
	}

			
		
		
		
    	

		return getUserType();  

    }
    
    
    
	public static void main(String[] args) throws MessagingException {
		
		productInformation();
		Scanner input2 = new Scanner(System.in);
		LOGGER.info(DDASH);
		LOGGER.info("1.Sign Up");
		LOGGER.info("2.log in");
		LOGGER.info("3.Exit the program");
		LOGGER.info(DDASH);
		int num = input2.nextInt();
		if ( num ==1 ) {
			signup(fullInformationToSignUp());
			num=2;
		}
		if (num==2){
			LOGGER.info(EMAIL);
			EMAIL1 = input2.next();
		LOGGER.info(PASS);
		String pass = input2.next();
		showMenu(login(EMAIL1 , pass));}
		if (num==3)
		{
			LOGGER.info("Thanks for visiting the programs");
			System.exit(0);
		}
	}

}
