import java.util.*;
public class Showtime {
    String time;
    String date;
    Movie movie;
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public Showtime(String time, String date, Movie movie){
        this.time = time;
        this.date = date;
        this.movie = movie;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
