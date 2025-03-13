import java.util.ArrayList;

public class Customer {
    String name;
    Integer age;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public Customer(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
