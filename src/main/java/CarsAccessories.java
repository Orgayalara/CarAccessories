import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CarsAccessories {
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
		 Product sampleProduct = new Product("Mirror", "https://m.indiamart.com/impcat/side-mirrors.html", 100, "The Color is red", "BMW", 5 , false , true , false);
	        Users sampleCustomer = new Users("Loai", "Loai@example.com", "48965", "123456", "Nablus", 1710, "Sample Car", "");

	        Order newOrder = new Order(sampleProduct, sampleCustomer, new Date(),true);
	        orders.add(newOrder);
	 }
	 public static void InstRequestInformation() {
		  Product sampleProduct = new Product("MudFlap","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",890,"the color is Pink","Honday", 4 , false , true , false);
	        Users sampleCustomer = new Users("Ashraf", "Ashraf@example.com", "7895", "123456", "Awarta", 230, "Sample Car", "");

	        InstallationRequest request1 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Pending");
	        InstallationRequest request2 = new InstallationRequest(sampleProduct, sampleCustomer, new Date(), "Approved");

	        InstRequest.add(request1);
	        InstRequest.add(request2);
	
	 }
	 public static int infoProductcatalog() {
		 
		 System.out.println("\n1.Internal \n2.External \n3.Electronics");
			return input2.nextInt();
	 }
	 public static boolean catalog(int n) {
		
		
			switch(n) {
			
			case 1:
		             System.out.print("Internal :\n");
		             for (int i =0 ; i<ProductList.size();i++) {
    		         if(ProductList.get(i).getInternal() == true ) {
    			 
    			 
    		    		System.out.print("name :");
    		    		System.out.println(ProductList.get(i).getName());
    		    		System.out.print("photo :");
    		    		System.out.println(ProductList.get(i).getPhoto());
    		    		System.out.print("Price :");
    		    		System.out.println(ProductList.get(i).getPrice());
    		    		System.out.print("Details :");
    		    		System.out.println(ProductList.get(i).getDetails());
    		    		System.out.print("type of car can apply  :");
    		    		System.out.println(ProductList.get(i).getType());
    		   
    		    		
    		    		System.out.println("____________________________________________________________________________________________________________");

    					 
    		             }
                       	 }
		            
		           break;
			case 2 :
				       System.out.print("External :\n");
	                   for (int i =0 ; i<ProductList.size();i++) {
		               if(ProductList.get(i).getExternal() == true ) {
			 

				    		System.out.print("name :");
				    		System.out.println(ProductList.get(i).getName());
				    		System.out.print("photo :");
				    		System.out.println(ProductList.get(i).getPhoto());
				    		System.out.print("Price :");
				    		System.out.println(ProductList.get(i).getPrice());
				    		System.out.print("Details :");
				    		System.out.println(ProductList.get(i).getDetails());
				    		System.out.print("type of car can apply  :");
				    		System.out.println(ProductList.get(i).getType());
				    
				    		System.out.println("____________________________________________________________________________________________________________");

							 
		                 }
                      	 }
	                   
	               break;
			case 3 :
				          System.out.print("Electronics :\n");
                          for (int i =0 ; i<ProductList.size();i++) {
	                      if(ProductList.get(i).getElectronics() == true ) {
		 

	                    		System.out.print("name :");
	    			    		System.out.println(ProductList.get(i).getName());
	    			    		System.out.print("photo :");
	    			    		System.out.println(ProductList.get(i).getPhoto());
	    			    		System.out.print("Price :");
	    			    		System.out.println(ProductList.get(i).getPrice());
	    			    		System.out.print("Details :");
	    			    		System.out.println(ProductList.get(i).getDetails());
	    			    		System.out.print("type of car can apply  :");
	    			    		System.out.println(ProductList.get(i).getType());
	    			    	//	System.out.print("The product isInternal?  :");
	    			    	//	System.out.println(ProductList.get(i).getInternal());
	    			    	//	System.out.print("The product isExternal?  :");
	    			    	//	System.out.println(ProductList.get(i).getExternal());
	    			    	//	System.out.print("The product isElectronics?  :");
	    			    	//	System.out.println(ProductList.get(i).getElectronics());
	    			    		System.out.println("____________________________________________________________________________________________________________");

	    						 
	    	                 }
	                   	 }
                         
	                break;
	                default:  break;
	                
	    }
			
			return true;
	}
     public static void ProductInformation() {
    	

    	Product p1 = new Product("Hood","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",5500,"the color is black","KIA sorento",2, false , true , false);
    	Product p2 = new Product("Serpentine_belt","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",100,"the color is black","KIA sorento", 3, false , false , true);
    	Product p3 = new Product("Holloy_wheel","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",1600,"the color is black","KIA sorento", 6, false , true , false);
    	Product p4 = new Product("Vehicle_mat","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",900,"the color is black","KIA sorento",1 , true , false, false);
    	Product p5 = new Product("Mud_Flap","https://m.indiamart.com/proddetail/renault-duster-hood-15550058133.html",500,"the color is black","KIA sorento",4, false , true , false);

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
		System.out.println("Enter the number of available pieces of the product:");
		int Availability = input2.nextInt();
		System.out.println("Is internal?:");
		boolean isInternal = input2.nextBoolean();
		System.out.println("Is External?:");
		boolean isExternal = input2.nextBoolean();
		System.out.println("Is Electronics?:");
		boolean isElectronics = input2.nextBoolean();
		
		Product Product1 = new Product(Name,Photo,Price,Details,Type,Availability,isInternal,isExternal,isElectronics);
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
		System.out.println(" in add !");

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
	
    public static boolean showMenuForCus() {
        Scanner scanner = new Scanner(System.in);
    	for (int i =0 ; i<CustomerList.size();i++) {
   		 if(CustomerList.get(i).getEmail().equals(Email)) {
   			currentuser = CustomerList.get(i).getfullname();
   			
   			break;
   		 }
    	}

    	
    		
            System.out.println("===== Customer Menu =====");
            System.out.println("1. Browse Products");
            System.out.println("2. Make a Purchase");
            System.out.println("3. View Order History");
            System.out.println("4. Request an Installtion");
            System.out.println("5. Reviews and Ratings.");
            System.out.println("6. Edit Profile");
            System.out.println("7. Search");
            System.out.println("8. Logout");
            System.out.print("Enter your choice: ");

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
                case 6:
                    editProfile(currentuser);
                    showMenuForCus();
                    break;
                case 7: 
                	System.out.println("Enter the beginning of the name of the product you want to search for: ");
            		String partfromName = input2.next();
                	search(partfromName);
                    showMenuForCus();
                	break;
                case 8:
                    System.out.println("Logging out from customer account.");
                    loginmain();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    showMenuForCus();
            }
			   return true;  }
		

   
  
    public static void editProfile(String username) {
        for (Users customer : CustomerList) {
            if (customer.getfullname().equals(username)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Editing profile for user: " + username);
//
                // Prompt the user to enter new details
                System.out.print("Enter new full name: ");
                String newFullName = scanner.nextLine();
                System.out.print("Enter new email: ");
                String newEmail = scanner.nextLine();
                System.out.print("Enter new Password: ");
                String newPass = scanner.nextLine();
                System.out.print("Enter new contact number: ");
                String newContactNumber = scanner.nextLine();

                // Set the new details
                customer.setfullname(newFullName);
                customer.setEmail(newEmail);
                customer.setnumber(newContactNumber);
                customer.setPassword(newPass);

                System.out.println("Profile updated successfully!");
                return;
            }
        }

        System.out.println("User not found. Unable to edit profile.");
    }


     
	public static void RequestanInstalltion(String currentuser) {
    	 System.out.println("===== Request an Installtion =====");
         browseProducts();

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the name of the product you want to Install: ");
        
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
                System.out.println("installtion req is successful. Thank you for shopping!");
                SendMail.getSendEmail(reqdetails, instemail);
                 break;
             }
         }

         if (selectedProduct == null) {
             System.out.println("Purchase unsuccessful. Product is unavailable!");
         }
     }
   
	
	public static int browseProducts() {
        System.out.println("===== Browse Products =====");
     
		catalog(infoProductcatalog());
    return 1; }

    public static void makePurchase(String customer) {
        System.out.println("===== Make a Purchase =====");
        browseProducts();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the product you want to purchase: ");
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
                System.out.println("Purchase successful. Thank you for shopping!");
                break;
            }
        }

        if (selectedProduct == null) {
            System.out.println("Purchase unsuccessful. Product is unavailable!");
        }
    }
  

    public static void viewOrderHistory(String customer) {
        System.out.println("===== Order History =====");
        for (Order order : orders) {
            if (order.getCustomer().getfullname().equals(customer)) {
                System.out.println("Product: " + order.getProduct().getName() + " - Price: $" + order.getProduct().getPrice());
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
       				System.out.println("The Edit isInternal is Done");
       				flag=true;	 
       			}
       			else if(n == 8) {
       				
       				ProductList.get(i).setExternal(b);
       				System.out.println("The Edit isExternal is Done");
       				flag=true;	 
       			}
       			else if(n == 9) {
       				
       				ProductList.get(i).setElectronics(b);
       				System.out.println("The Edit isElectronics is Done");
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
   			else if(n == 6) {
  				 p = Integer.parseInt(w) ;
  				ProductList.get(i).setAvailability(p);
  				System.out.println("The Edit Availability is Done");
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
    		System.out.print("The product isInternal?  :");
    		System.out.println(Products.getInternal());
    		System.out.print("The product isExternal?  :");
    		System.out.println(Products.getExternal());
    		System.out.print("The product isElectronics?  :");
    		System.out.println(Products.getElectronics());
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
    public static boolean showMenuForAd( ) {
        System.out.println("===== Admin Menu =====");
        System.out.println("Enter : \n1)Ptoduct Catalog.\n2) Remove Product.\n3) Add product.\n4) Update to any product.\n5) Viwe all Customers Acounts.\n6) Manage the Customers Acounts. \n7) Schedule and manage installation appointments."
        		+ "\n8) Show The Reviews And Ratings. \n9) log out");
    	int num = input2.nextInt();
switch(num) {
		
		case 1 :catalog(infoProductcatalog());
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
    		System.out.println("1.Edit Name  \n2.Edit Photo \n3.Edit Price \n4.Edit Details \n5.Edit Type \n6.Availability \n7.Edit isInternal \n8.Edit isExternal \n9.Edit isElectronics");
    		int n = input2.nextInt();
    		
            if(n <= 6)
            {
            	System.out.println("Enter the value:  ");
    		    String w = input2.next();
    		    editProduct(e,n,w );
            }
            else if (n > 6)
            {
            	System.out.println("Enter the value:  ");
    		    boolean b = input2.nextBoolean();
            	editProductboolean(e,n,b );
            }
			
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
		System.out.println("Enter the Name of Product:");
		String NameOfProduct = input2.next();
		System.out.println("Rate the product from 1 to 5, where 5 is the best: 1 2 3 4 5");
		int Rate = input2.nextInt();
		System.out.println("Enter Your Review :");
		String Review = input2.next();
		
		 ReviewsandRatings r= new ReviewsandRatings(Rate,Review,NameOfProduct,Emial);
    	return r;
		
    }
    public static  boolean funReviewsandRatings(ReviewsandRatings r) {
    	
    		ReviewsandRatingsList.add(r);
    		System.out.println("Done added !");
    	return true;
    }
    public static boolean ShowTheReviewsAndRatings() {
    
    		for (ReviewsandRatings show : ReviewsandRatingsList) {
        		System.out.print("Email :");
        		System.out.println(show.getEmail());
        		System.out.print("Name Of Product :");
        		System.out.println(show.getNameOfProduct());
        		System.out.print("Rate :");
        		System.out.println(show.getRatings());
        		System.out.print("Review :");
        		System.out.println(show.getReviews());
        		
        		System.out.println("____________________________________________________________________________________________________________");

          
        }
    	return true;
    }
    public static boolean viewInstRequestWithDateAndDetails(){
    	
    	
    	for (int i = 0; i < InstRequestWithDateAndDetails.size(); i++) {
            InstallationRequest request = InstRequestWithDateAndDetails.get(i);
            System.out.println((i + 1) + ") Product: " + request.getProduct().getName() +
                    " - Customer: " + request.getCustomer().getfullname() +
                    " - Preferred Date: " + request.getPreferredDate() +
                    " - Status: " + request.getStatus() + 
                    " - Details Form: " + request.getdetailsForm());
        }
    	
    	return true;
    }
    public static boolean showMenuForIns() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Installer Menu =====");
        System.out.println("Enter:\n1) View Installation Requests.\n2) Schedule Appointment And Form to specify installation details.\n3) Logout");
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
                System.out.println("Logging out from installer account.");
                loginmain();
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                showMenuForIns();
        }

        return true;
    }
    public static void loginmain() {
    	ProductInformation();
		Scanner input2 = new Scanner(System.in);
		System.out.println("\n========================");
		System.out.println("1.Sign Up");
		System.out.println("2.log in");
		System.out.println("3.Exit the program");
		System.out.println("========================");
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
		if (num==3)
		{
			System.out.println("Thanks for visiting the programs");
			System.exit(0);
		}
	}
    public static boolean scheduleAppointment() {
    	boolean flag=false;
    	Scanner scanner = new Scanner(System.in);

        System.out.println("===== Schedule Appointment =====");

        // Display available installation requests
        System.out.println("Available Installation Requests:");
        for (int i = 0; i < InstRequest.size(); i++) {
            InstallationRequest request = InstRequest.get(i);
            System.out.println((i + 1) + ") Product: " + request.getProduct().getName() +
                    " - Customer: " + request.getCustomer().getfullname() +
                    " - Preferred Date: " + request.getPreferredDate() +
                    " - Status: " + request.getStatus());
        }
         flag = true;
        // Ask the installer to choose an installation request
        System.out.print("Enter the number of the installation request you want to schedule: ");
        int requestNumber = scanner.nextInt();

        if (requestNumber >= 1 && requestNumber <= InstRequest.size()) {
            // Get the selected installation request
            InstallationRequest selectedRequest = InstRequest.get(requestNumber - 1);

            // Ask for appointment details
            System.out.print("Enter the appointment date (yyyy-MM-dd HH:mm): ");
            String dateString = scanner.next() + " " + scanner.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date appointmentDate;
            try {
                appointmentDate = dateFormat.parse(dateString);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter date in the format yyyy-MM-dd HH:mm.");
                return false;
            }

            // Update the installation request with the appointment details
            selectedRequest.setPreferredDate(appointmentDate);
            selectedRequest.setStatus("Scheduled");
            System.out.println("Enter the preferred date and car model: ");
            String dateAndmodel = scanner.next();
            selectedRequest.setdetailsForm(dateAndmodel);
            InstRequestWithDateAndDetails.add(selectedRequest);
            System.out.println("Appointment scheduled successfully for the selected installation request.");
        } else {
            System.out.println("Invalid installation request number.");
        }
        return true;
        
    }		
	
	private static void viewInstallationRequestsForInstaller() {
        // Implement functionality for installers to view their installation requests
        System.out.println("===== View Installation Requests =====");
        for (InstallationRequest request : InstRequest) {
            System.out.println("Product: " + request.getProduct().getName() +
                    " - Customer: " + request.getCustomer().getfullname() +
                    " - Preferred Date: " + request.getPreferredDate() +
                    " - Status: " + request.getStatus());
        }

        
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
			System.out.print("name :");
    		System.out.println(product.getName());
    		System.out.print("photo :");
    		System.out.println(product.getPhoto());
    		System.out.print("Price :");
    		System.out.println(product.getPrice());
    		System.out.print("Details :");
    		System.out.println(product.getDetails());
    		System.out.print("type of car can apply  :");
    		System.out.println(product.getType());
    		System.out.print("The product isInternal?  :");
    		System.out.println(product.getInternal());
    		System.out.print("The product isExternal?  :");
    		System.out.println(product.getExternal());
    		System.out.print("The product isElectronics?  :");
    		System.out.println(product.getElectronics());
    		System.out.println("____________________________________________________________________________________________________________");

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
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInformation();
		Scanner input2 = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1.Sign Up");
		System.out.println("2.log in");
		System.out.println("3.Exit the program");
		System.out.println("========================");
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
		if (num==3)
		{
			System.out.println("Thanks for visiting the programs");
			System.exit(0);
		}
	}

}
