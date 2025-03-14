import java.util.*;
public class Cinema{
	String name;
    String location;
    ArrayList<Hall> halls = new ArrayList<Hall>();
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public Cinema(String name, String location){
        this.name = name;
        this.location = location;
    }

    public void addHall(Hall hall){
        halls.add(hall);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void displayCinemaInfo(){
        System.out.println("Cinema: " + name);
        System.out.println("Location: " + location);

        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println("- Name: " + employee.name + ", Role: " + employee.role);
        }

        System.out.println("\nHalls:");
        for (Hall hall : halls) {
            System.out.println("Hall " + hall.hallNumber + "(Capacity: " + hall.capacity + ")");
            System.out.println("    Showtimes:");
            for (Showtime showtime : hall.showtimes){
                System.out.println("        - Movie: " + showtime.movie.title);
                System.out.println("          Time: " + showtime.time + ", Date: " + showtime.date);
                if (showtime.tickets.size() == 0) { // salah
                    System.out.println("        Tickets: No tickets booked yet.");
                } else {
                    System.out.println("          Tickets:");
                    for (Ticket ticket : showtime.tickets){
                        System.out.print("          * Ticket ID: " + ticket.id + ", Price: $" + ticket.price + ", Customer: " + ticket.customer.name);
                        if (ticket.paymentStatus) {
                            System.out.println(", Payment Status: Paid");
                        } else {
                            System.out.println(", Payment Status: UnPaid");
                        }
                    }
                    System.out.println("");
                }
            }
        }
        
        System.out.println("\nCustomers:");
        for(Hall hall : halls){ // Setiap hall yang ada
            for(Showtime showtime : hall.showtimes){ // Setiap showrime di dalam list showtime di setiap hall
                for(Ticket ticket : showtime.tickets){ // Setiap ticket di dalam list ticket di setiap showtime 
                    System.out.println("- Name: " + ticket.customer.name + ", Age: " + ticket.customer.age);
                    System.out.println("  Tickets:");
                    for(Ticket ticket2 : ticket.customer.tickets){ // setiap ticket pada customer
                        System.out.print("    * Ticket ID: " + ticket2.id +", Movie: " + showtime.movie.title + ", Showtime: " + showtime.date + ", Date: " + showtime.date + ", Price: " + ticket.price);
                        if (ticket.paymentStatus) {
                            System.out.println(", Payment Status: Paid");
                        } else {
                            System.out.println(", Payment Status: UnPaid");
                        }
                    }
                }
            }
        }


    }
}