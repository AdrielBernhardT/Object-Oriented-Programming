import java.util.*;

public class Customer {
	String name;
	Integer age;
	ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public Customer(String string, int i) {
		name = string;
		age = i;
	}
	
}
