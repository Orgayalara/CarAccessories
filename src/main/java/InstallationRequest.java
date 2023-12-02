import java.util.Date;

public class InstallationRequest {
    private Product product;
    private Users customer;
    private Date preferredDate;
    private String status;
    private String detailsForm;
    public InstallationRequest() {
    }

    public InstallationRequest(Product product, Users customer, Date preferredDate, String status) {
        this.product = product;
        this.customer = customer;
        this.preferredDate = preferredDate;
        this.status = status;
    }

  
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getCustomer() {
        return customer;
    }

    public void setCustomer(Users customer) {
        this.customer = customer;
    }

    public Date getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(Date preferredDate) {
        this.preferredDate = preferredDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getdetailsForm() {
        return detailsForm;
    }

    public void setdetailsForm(String detailsForm) {
        this.detailsForm = detailsForm;
    }
}