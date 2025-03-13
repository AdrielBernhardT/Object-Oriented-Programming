
public class Ticket {
    Integer id;
    double price;
    boolean paymentStatus;
    Customer customer;

    public Ticket(Integer id, double price, Customer customer){
        this.id = id;
        this.price = price;
        this.customer = customer;
        paymentStatus = true;
    }
}
