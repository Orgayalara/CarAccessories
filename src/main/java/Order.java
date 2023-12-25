import java.util.Date;

import java.util.Date;

public class Order {

    private Product product;
    private Users customer;
   // private Date orderDate;
    private boolean status;

    // Parameterized constructor
    public Order(Product product, Users customer, Date orderDate , boolean status) {
        this.product = product;
        this.customer = customer;
     //   this.orderDate = orderDate;
        this.setStatus(status);
    }

    public Product getProduct() {
        return product;
    }

   
    public Users getCustomer() {
        return customer;
    }

   

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

