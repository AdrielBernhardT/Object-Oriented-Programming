import java.util.*;

public class Hall {
	Integer hallNumber;
	Integer capacity;
	ArrayList<Showtime> showtimes = new ArrayList<Showtime>();
	
	public Hall(int hallNumber, int capacity){
		this.hallNumber = hallNumber;
		this.capacity = capacity;
	}

	public void addShowtime(Showtime showtime1) {
		showtimes.add(showtime1);
	}

	public void addShowtime(Showtime showtime1) {
		showtimes.add(showtime1);
	}
}
