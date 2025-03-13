import java.util.*;
public class Hall {
    Integer hallNumber;
    Integer capacity;
    ArrayList<Showtime> showtimes = new ArrayList<Showtime>();

    public Hall(Integer hallNumber, Integer capacity){
        this.hallNumber = hallNumber;
        this.capacity = capacity;
    }

    public void addShowtime(Showtime showtime){
        showtimes.add(showtime);
    }
}
