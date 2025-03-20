import java.util.*;

public class Cinema {
	String name;
	String location;
	ArrayList<Hall> halls = new ArrayList<Hall>();
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public Cinema(String string, String string2) {
		name = string;
		location = string;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void addHall(Hall hall1) {
		halls.add(hall1);
	}

}
