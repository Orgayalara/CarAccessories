import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.mail.MessagingException;

import com.sun.tools.javac.main.Main;

public class CarsAccessories {
	private static final String name = "name";
	private static final String photo = "photo";
	private static final String price = "price";
	private static final String details = "details";
	private static final String type = "type of car can apply";
	private static final String KIA_sorento ="KIA sorento";
	private static final String color ="the color is black";
	private static final String Done ="Done added !";
	private static final String email ="Enter your Email please";
	private static final String Pass ="Enter your password please";
	private static final String Customer =" - Customer: ";
	private static final String Date =" - Preferred Date: ";
	private static final String Status =" - Status: ";
	private static final String sdash ="____________";
	private static final String Ddash ="========================";
	private static final String dash = "____________________________________________________________________________________________________________";
	private static final Logger LOGGER =  Logger.getLogger(CarsAccessories.class.getName());
	//new
	static String currentuser;
	static String Email;
	private static String userType = "none" ;
    private static ArrayList<Order> orders = new ArrayList<Order>();
	public static ArrayList <Users> CustomerList = new ArrayList<Users>();
	public static ArrayList <Admins> AdminList = new ArrayList<Admins>();
	public static ArrayList <Installar> InstallarList  = new ArrayList<Installar>();
    public static ArrayList<InstallationRequest> InstRequest = new ArrayList<InstallationRequest>();
    public static ArrayList<InstallationRequest> InstRequestWithDateAndDetails = new ArrayList<InstallationRequest>();
    public static ArrayList <Product> ProductList = new ArrayList<Product>();
    public static ArrayList <Product> SearchList = new ArrayList<Product>();
    public static ArrayList <ReviewsandRatings> ReviewsandRatingsList = new ArrayList<ReviewsandRatings>();
	public static void setUserType(String type) {
		userType = type;
	}
	static Scanner input2 = new Scanner(System.in);
	public static String getUserType() {
		return userType;
	}
	 public static void OrderInformation() {
		 Product sampleProduct = new Product("Mirror", " ", 100, "The Color is red", "BMW", 5 , false , true , false);
	        Users sampleCustomer = new Users("Loai", "Loai@example.com", "48965", "123456", "Nablus", 1710, "Sample Car", "");

	        Order newOrder = new Order(sampleProduct, sampleCustomer, new Date(),true);
	        orders.add(newOrder);
	 }
	 public static void InstRequestInformation() {
		  Product sampleProduct = new Product("MudFlap","",890,"the color is Pink","Honday", 4 , false , true , false);
	        Users sampleCustomer = new Users("Ashraf", "Ashraf@example.com", "7895", "123456", "Awarta", 230, "Sample Car", "");

	        InstallationRequest request1 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Pending");
	        InstallationRequest request2 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Approved");

	        InstRequest.add(request1);
	        InstRequest.add(request2);
	
	 }
	 public static int infoProductcatalog() {
		 
		LOGGER.info("\n1.Internal \n2.External \n3.Electronics");
			return input2.nextInt();
	 }
	 public static boolean catalog(int n) {
		
		
			switch(n) {
			
			case 1:
				LOGGER.info("Internal :\n");
		             for (int i =0 ; i<ProductList.size();i++) {
    		         if(ProductList.get(i).getInternal() == true ) {
    			 
    		        	  LOGGER.info(name + ProductList.get(i).getName());
		            	   LOGGER.info(photo + ProductList.get(i).getPhoto());
		            	   LOGGER.info(price + String.valueOf(ProductList.get(i).getPrice()));
		            	   LOGGER.info(details + ProductList.get(i).getDetails());
		            	   LOGGER.info(type + ProductList.get(i).getType());
    		    		
    		        	 LOGGER.info(dash);

    					 
    		             }
                       	 }
		            
		           break;
			case 2 :
			         	LOGGER.info("External :\n");
	                   for (int i =0 ; i<ProductList.size();i++) {
		               if(ProductList.get(i).getExternal() == true ) {
			 
		            	   LOGGER.info(name + ProductList.get(i).getName());
		            	   LOGGER.info(photo + ProductList.get(i).getPhoto());
		            	   LOGGER.info(price + String.valueOf(ProductList.get(i).getPrice()));
		            	   LOGGER.info(details + ProductList.get(i).getDetails());
		            	   LOGGER.info(type + ProductList.get(i).getType());
		               
				    
		               LOGGER.info(dash);

							 
		                 }
                      	 }
	                   
	               break;
			case 3 :
				         LOGGER.info("Electronics :\n");
                          for (int i =0 ; i<ProductList.size();i++) {
	                      if(ProductList.get(i).getElectronics() == true ) {
		 
	                    	  LOGGER.info(name + ProductList.get(i).getName());
	                    	  LOGGER.info(photo + ProductList.get(i).getPhoto());
	                    	  LOGGER.info(price + String.valueOf(ProductList.get(i).getPrice()));
	                    	  LOGGER.info(details + ProductList.get(i).getDetails());
	                    	  LOGGER.info(type + ProductList.get(i).getType());
	                      

	    			    	
	                    	  LOGGER.info("____________________________________________________________________________________________________________");

	    						 
	    	                 }
	                   	 }
                         
	                break;
	                default:  break;
	                
	    }
			
			return true;
	}
     public static void ProductInformation() {
    	

    	Product p1 = new Product("Hood"," ",5500,color,KIA_sorento,2, false , true , false);
    	Product p2 = new Product("Serpentine_belt"," ",100,color,KIA_sorento, 3, false , false , true);
    	Product p3 = new Product("Holloy_wheel"," ",1600,color,KIA_sorento, 6, false , true , false);
    	Product p4 = new Product("Vehicle_mat"," ",900,color,KIA_sorento,1 , true , false, false);
    	Product p5 = new Product("Mud_Flap"," ",500,color,KIA_sorento,4, false , true , false);

    	ProductList.add(p1);
    	ProductList.add(p2);

    	ProductList.add(p3);

    	ProductList.add(p4);

    	ProductList.add(p5);
    }
    public static Product addInfoProduct() {
    	 LOGGER.info("Enter Your Name Product:");
		String Name = input2.next();
		 LOGGER.info("Enter Your Photo Product:");
		String Photo = input2.next();
		 LOGGER.info("Enter Your Price Product:");
		int Price = input2.nextInt();
		 LOGGER.info("Enter Your Details Product:");
		String Details = input2.next();
		 LOGGER.info("Enter Your Type Product:");
		String Type = input2.next();
		 LOGGER.info("Enter the number of available pieces of the product:");
		int Availability = input2.nextInt();
		 LOGGER.info("Is internal?:");//TODO
		boolean isInternal = input2.nextBoolean();
		 LOGGER.info("Is External?:");//TODO
		boolean isExternal = input2.nextBoolean();
		 LOGGER.info("Is Electronics?:");//TODO
		boolean isElectronics = input2.nextBoolean();
		
		Product Product1 = new Product(Name,Photo,Price,Details,Type,Availability,isInternal,isExternal,isElectronics);
    	return Product1;
    		
        
    }
    public static Users addInfoCustomersAcount() {
    	 LOGGER.info("Enter the  Name of Customer:");
    	String Name = input2.next();
    	 LOGGER.info("Enter the  Email of Customer:");
    	String Email = input2.next();
    	 LOGGER.info("Enter the  Password of Customer:");
    	String Password = input2.next();
    	 LOGGER.info("Enter the  Contact Number of Customer:");
    	String  ContactNumber = input2.next();
    	 LOGGER.info("Enter the  Shipping Address of Customer:");
    	String ShippingAddress = input2.next();
    	 LOGGER.info("Enter the  Number Of Car of Customer:");
    	int  NumberOfCar = input2.nextInt();
    	 LOGGER.info("Enter the  Type Of Car of Customer:");
    	String TypeOfCar = input2.next();
    	
    	String HistoryOrder = " ";
    	
    	Users user1 = new Users(Name,Email,Password,ContactNumber,ShippingAddress,NumberOfCar,TypeOfCar,HistoryOrder);
    	return user1;
    }
    
  
    //    addProduct
    public static boolean addProduct(Product p) {
    	 LOGGER.info(" in add !");

    	boolean flag=false; 
    	ProductList.add(p);
    	 LOGGER.info(Done);
		flag=true; 
    	return flag;
    }
    public static boolean addCustomersAcounts(Users p) {
    	boolean flag=false; 
    	CustomerList.add(p);
    	 LOGGER.info(Done);
		flag=true; 
    	return flag;
    }

    public static void showMenuForNone() throws MessagingException {
    	      LOGGER.info("you are not user in this system ! \n please sign up ner user or again log in  ");
    	      LOGGER.info("1.Enter To Sign Up");
    	      LOGGER.info("2.Enter To log in");
			int num = input2.nextInt();
			if ( num ==1 ) {
				signup(FullInformationToSignUp());
				num=2;
			}
			if (num==2){
				 LOGGER.info(email);

			
			Email = input2.next();
			 LOGGER.info(Pass);
			String pass = input2.next();
			
			
			showMenu(login(Email , pass));}
	    }
	
    public static boolean showMenuForCus() throws MessagingException {
        Scanner scanner = new Scanner(System.in);
    	for (int i =0 ; i<CustomerList.size();i++) {
   		 if(CustomerList.get(i).getEmail().equals(Email)) {
   			currentuser = CustomerList.get(i).getfullname();
   			
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
                	RequestanInstalltion(currentuser);
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
		

   
  
    public static void editProfile(String username) {
        for (Users customer : CustomerList) {
            if (customer.getfullname().equals(username)) {
                Scanner scanner = new Scanner(System.in);
                LOGGER.info("Editing profile for user: " + username);
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


     
	public static void RequestanInstalltion(String currentuser) throws MessagingException {
		LOGGER.info("===== Request an Installtion =====");
         browseProducts();

         Scanner scanner = new Scanner(System.in);

         LOGGER.info("Enter the name of the product you want to Install: ");
        
         String productName = scanner.nextLine();
         String reqdetails;
         String instemail = InstallarList.get(0).getEmail();
         Product selectedProduct = null;
         
         for (Product product : ProductList) {
             if (product.getName().equalsIgnoreCase(productName)) {
                 selectedProduct = product;
                 InstallationRequest instreq = new InstallationRequest(selectedProduct, CustomerList.get(0), new Date(), "New inst req");             
                 InstRequest.add(instreq);
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
     
		catalog(infoProductcatalog());
    return 1; }

    public static void makePurchase(String customer) throws MessagingException {
    	LOGGER.info("===== Make a Purchase =====");
        browseProducts();

        Scanner scanner = new Scanner(System.in);

        LOGGER.info("Enter the name of the product you want to purchase: ");
        String productName = scanner.nextLine();
        boolean state=false;
        Product selectedProduct = null;
        for (Product product : ProductList) {
            if (product.getName().equalsIgnoreCase(productName)) {
                selectedProduct = product;
                state =true;
                Order order = new Order(selectedProduct, CustomerList.get(0), new Date() , true);   
                orders.add(order);
                CustomerList.get(0).orderStatus(state, Email);
                LOGGER.info("Purchase successful. Thank you for shopping!");
                break;
            }
        }

        if (selectedProduct == null) {
        	LOGGER.info("Purchase unsuccessful. Product is unavailable!");
        }
    }
  

    public static void viewOrderHistory(String customer) {
    	LOGGER.info("===== Order History =====");
        for (Order order : orders) {
            if (order.getCustomer().getfullname().equals(customer)) {
            	LOGGER.info("Product: " + order.getProduct().getName() + " - Price: $" + order.getProduct().getPrice());
            }
        }
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
    
    public static boolean editProductboolean(String s , int n  , boolean b )
    {
    	boolean	flag=false;
    	 for (int i =0 ; i<ProductList.size();i++) {
       		 if(ProductList.get(i).getName().equals(s)) {
       			 if(n == 7) {
       				 
       				ProductList.get(i).setInternal(b);
       				LOGGER.info("The Edit isInternal is Done");
       				flag=true;	 
       			}
       			else if(n == 8) {
       				
       				ProductList.get(i).setExternal(b);
       				LOGGER.info("The Edit isExternal is Done");
       				flag=true;	 
       			}
       			else if(n == 9) {
       				
       				ProductList.get(i).setElectronics(b);
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
   	 for (int i =0 ; i<ProductList.size();i++) {
   		 if(ProductList.get(i).getName().equals(s)) {
   			
   			if(n == 1) {
   	    	    ProductList.get(i).setName(w);
   	    	 LOGGER.info("The Edit Name is Done");
   	    	 flag=true;
   			}
   			else if(n == 2)
   			{
   				ProductList.get(i).setPhoto(w);
   				LOGGER.info("The Edit Photo is Done");
   				flag=true;
   			}
   			 
   			else if(n == 3) {
   				 p = Integer.parseInt(w) ;
   				ProductList.get(i).setPrice(p);
   				LOGGER.info("The Edit Price is Done");
   				flag=true;
   			}
   			else if(n == 4) {
   				
   				ProductList.get(i).setDetails(w);
   				LOGGER.info("The Edit Details is Done");
   				flag=true;
   			}
   			else if(n == 5) {
   				ProductList.get(i).setType(s);
   				LOGGER.info("The Edit Type is Done");
   				flag=true;	 
   			}
   			else if(n == 6) {
  				 p = Integer.parseInt(w) ;
  				ProductList.get(i).setAvailability(p);
  				LOGGER.info("The Edit Availability is Done");
  				flag=true;
  			}
   		
   		 }
   	 }
   	 
   	 return flag;
   }
  
    
    public static boolean viweCustomersAcounts() {
    	
    	 boolean	flag=false;
    	for (Users Customer : CustomerList) {
    		LOGGER.info("fullName: " + Customer.getfullname());
    		LOGGER.info("Email: " + Customer.getEmail());
    		LOGGER.info("Password: " + Customer.getPassword());
    		LOGGER.info("contact Number: " + Customer.getnumber());
    		LOGGER.info("shipping address: " + Customer.getshippingaddress());
    		LOGGER.info("number Of Car: " + Customer.getnumberOfCar());
    		LOGGER.info("type Of Car: " + Customer.gettypeOfCar());
    		LOGGER.info("history Order: " + Customer.gethistoryOrder());
        
    		LOGGER.info(dash);//TODO

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
		
		case 1 :catalog(infoProductcatalog());
		showMenuForAd();
			
				
		  break; 
		           
		case  2 :LOGGER.info("Enter Name item to removing");
		for (Product Products : ProductList) {
			LOGGER.info(Products.getName());}
		LOGGER.info(sdash);
    		String s = input2.next();
			removeProduct(s);
			showMenuForAd();
		          break;
		          
		case 3 :addProduct(addInfoProduct());
		showMenuForAd();
		break;
			   
		case 4 :LOGGER.info("Enter Name item to Editing");
		for (Product Products : ProductList) {
			LOGGER.info(Products.getName());}
		LOGGER.info(sdash);
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
			for (Users user : CustomerList) {
				LOGGER.info(user.getfullname());}
			LOGGER.info(sdash);
	    		String u = input2.next();
				removeCustomersAcount(u);
				showMenuForAd();
				
		}
        break;
		case 7 : viewInstRequestWithDateAndDetails();
		         showMenuForAd();
		case 8 : ShowTheReviewsAndRatings();
        showMenuForAd();
		case 9 : loginmain();
		  default:showMenuForAd();
		   break;
		}

    return true;}
    public static ReviewsandRatings infReviewsandRatings() {
   
		String Emial = CustomerList.get(0).getEmail();
		LOGGER.info("Enter the Name of Product:");
		String NameOfProduct = input2.next();
		LOGGER.info("Rate the product from 1 to 5, where 5 is the best: 1 2 3 4 5");
		int Rate = input2.nextInt();
		LOGGER.info("Enter Your Review :");
		String Review = input2.next();
		
		 ReviewsandRatings r= new ReviewsandRatings(Rate,Review,NameOfProduct,Emial);
    	return r;
		
    }
    public static  boolean funReviewsandRatings(ReviewsandRatings r) {
    	
    		ReviewsandRatingsList.add(r);
    		LOGGER.info(Done);
    	return true;
    }
    public static boolean ShowTheReviewsAndRatings() {
    
    		for (ReviewsandRatings show : ReviewsandRatingsList) {
    			LOGGER.info("Email: " + show.getEmail());
    			LOGGER.info("Name Of Product: " + show.getNameOfProduct());
    			LOGGER.info("Rate: " + show.getRatings());
    			LOGGER.info("Review: " + show.getReviews());
        		
        		LOGGER.info(dash);

          
        }
    	return true;
    }
    public static boolean viewInstRequestWithDateAndDetails(){
    	
    	
    	for (int i = 0; i < InstRequestWithDateAndDetails.size(); i++) {
            InstallationRequest request = InstRequestWithDateAndDetails.get(i);
            LOGGER.info((i + 1) + ") Product: " + request.getProduct().getName() +
            		Customer + request.getCustomer().getfullname() +
                    Date+ request.getPreferredDate() +
                    Status + request.getStatus() + 
                    " - Details Form: " + request.getdetailsForm());
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
            	LOGGER.info("Logging out from installer account.");//TODO
                loginmain();
                break;
            default:
            	LOGGER.info("Invalid choice. Please enter a valid option.");//TODO
                showMenuForIns();
        }

        return true;
    }
    public static void loginmain() throws MessagingException {
    	ProductInformation();
		Scanner input2 = new Scanner(System.in);
		LOGGER.info("\n========================");
		LOGGER.info("1.Sign Up");
		LOGGER.info("2.log in");
		LOGGER.info("3.Exit the program");
		LOGGER.info(Ddash);
		int num = input2.nextInt();
		if ( num ==1 ) {
			signup(FullInformationToSignUp());
			num=2;
		}
		if (num==2){
			LOGGER.info(email);
		Email = input2.next();
		LOGGER.info(Pass);
		String pass = input2.next();
		showMenu(login(Email , pass));}
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
        for (int i = 0; i < InstRequest.size(); i++) {
            InstallationRequest request = InstRequest.get(i);
            LOGGER.info((i + 1) + ") Product: " + request.getProduct().getName() +
            		Customer + request.getCustomer().getfullname() +
            		Date+ request.getPreferredDate() +
            		Status + request.getStatus());
        }
         flag = true;
        // Ask the installer to choose an installation request
         LOGGER.info("Enter the number of the installation request you want to schedule: ");
        int requestNumber = scanner.nextInt();

        if (requestNumber >= 1 && requestNumber <= InstRequest.size()) {
            // Get the selected installation request
            InstallationRequest selectedRequest = InstRequest.get(requestNumber - 1);

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
            InstRequestWithDateAndDetails.add(selectedRequest);
            LOGGER.info("Appointment scheduled successfully for the selected installation request.");
        } else {
        	LOGGER.info("Invalid installation request number.");
        }
        return true;
        
    }		
	
	private static void viewInstallationRequestsForInstaller() {
		LOGGER.info("===== View Installation Requests =====");
        for (InstallationRequest request : InstRequest) {
        	LOGGER.info("Product: " + request.getProduct().getName() +
        			Customer + request.getCustomer().getfullname() +
        			Date + request.getPreferredDate() +
        			Status + request.getStatus());
        }

        
    }

    public static Users FullInformationToSignUp() {
    
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

		Users newUser = new Users(fullName,Email,password,contactNumber,shippingAddress,numberOfCar,typeOfCar,"");
    	return newUser;
    	
    }
    public static boolean signup(Users U) {
    	
    	CustomerList.add(U);
    	
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
		
		for(int i =0 ; i <ProductList.size(); i++ )
		{
			if ((ProductList.get(i).getName()).startsWith(s))
			{
				SearchList.add(ProductList.get(i));
			}
			
				
		}
		for (Product product: SearchList)
		{
			LOGGER.info(name + product.getName());
			LOGGER.info(photo + product.getPhoto());
	        LOGGER.info(price + product.getPrice());
	        LOGGER.info(details + product.getDetails());
	        LOGGER.info(type + product.getType());
	        LOGGER.info("The product isInternal?: " + product.getInternal());
	        LOGGER.info("The product isExternal?: " + product.getExternal());
	        LOGGER.info("The product isElectronics?: " + product.getElectronics());
	    
    		LOGGER.info(dash);//TODO

		}

		return true;
	}

    public static String login(String Email , String passWord) {
    	
    	
    	Users UserNumber1 = new Users("AYAAWWAD","ayahazeem3@gmail.com","123","056","Nablus",12589,"BMW","");
    	Users UserNumber2 = new Users("LARA","lara@example.com","456","056987","jenin",4587,"marceds","");
    	Users UserNumber3 = new Users("batool","batool@example.com","789","05684","Ramalla",4658,"seat","");
    	Users UserNumber4 = new Users("2","2","2","2","2",2,"2","");
    	CustomerList.add(UserNumber1);
    	CustomerList.add(UserNumber2);
    	CustomerList.add(UserNumber3);
    	CustomerList.add(UserNumber4);

    	Admins AdminNumber1 = new Admins("Bayan","Bayan@example.com","1122");
    	AdminList.add(AdminNumber1);
    	Admins AdminNumber11 = new Admins("1","1","1");
    	AdminList.add(AdminNumber11);


    	Installar InstallarNumber1 = new Installar("Marwa","s12043062@stu.najah.edu","3344");
    	InstallarList.add(InstallarNumber1);
    	Installar InstallarNumber2 = new Installar("3","3","3");
    	InstallarList.add(InstallarNumber2);

    	
    	
    	
for (Users user : CustomerList) {
			
			if ((user.getEmail() .equals(Email))&&(user.getPassword().equals(passWord))) {
				
					setUserType("Customer");
				}
			
					
			}

for (Admins Admin : AdminList) {
	
	if ((Admin.getEmail() .equals(Email))&&(Admin.getPassword().equals(passWord))) {
		
			setUserType("admin");
		}
	
			
	}
for (Installar installar : InstallarList) {
	
	if ((installar.getEmail() .equals(Email))&&(installar.getPassword().equals(passWord))) {
		
			setUserType("installer");
		}
	
			
	}

			
		
		
		
    	

		return getUserType();  

    }
    
    
    
	public static void main(String[] args) throws MessagingException {
		
		ProductInformation();
		Scanner input2 = new Scanner(System.in);
		LOGGER.info(Ddash);
		LOGGER.info("1.Sign Up");
		LOGGER.info("2.log in");
		LOGGER.info("3.Exit the program");
		LOGGER.info(Ddash);
		int num = input2.nextInt();
		if ( num ==1 ) {
			signup(FullInformationToSignUp());
			num=2;
		}
		if (num==2){
			LOGGER.info(email);
		Email = input2.next();
		LOGGER.info(Pass);
		String pass = input2.next();
		showMenu(login(Email , pass));}
		if (num==3)
		{
			LOGGER.info("Thanks for visiting the programs");
			System.exit(0);
		}
	}

}
