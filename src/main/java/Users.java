import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.mail.MessagingException;

public class Users {

    private String fullName;
    private String email;
    private String password;
    private String contactNumber;
    private String shippingAddress;
    private int numberOfCar;
    private String typeOfCar;
    private String historyOrder;

    boolean loggedIn = false;

    public Users() {}

    public Users(String fullName, String email, String password, String contactNumber, String shippingAddress, int numberOfCar, String typeOfCar, String historyOrder) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.shippingAddress = shippingAddress;
        this.numberOfCar = numberOfCar;
        this.typeOfCar = typeOfCar;
        this.historyOrder = historyOrder;
    }

    public String getEmail() {
        return email;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public String getshippingaddress() {
        return shippingAddress;
    }

 

    public String getnumber() {
        return contactNumber;
    }

    public void setnumber(String contactNumber) {
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

    public int getnumberOfCar() {
        return numberOfCar;
    }



    public String gettypeOfCar() {
        return typeOfCar;
    }

  

    public String gethistoryOrder() {
        return historyOrder;
    }

  

    public String toString() {
        return "customer: " + getfullname() + " - Email: " + getEmail();
    }

    public boolean orderStatus(boolean orderstatusnow, String email) throws MessagingException {
        String status = "";

        if (orderstatusnow) {
            status = "Your Order is Confirmed";
            SendMail.getSendEmail(status, email);
            return true;
        } else {
            status = "an error occurred in your order, Sorry";
            SendMail.getSendEmail(status, email);
            return false;
        }
    }

   
}