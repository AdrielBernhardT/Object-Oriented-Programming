package actor;
import academic.Course;

import java.util.*;

public class Lecturer {
    public String lecturerCode;
    public String name;
    public String dob;
    public ArrayList<Course> courses = new ArrayList<>();
    
    public Lecturer(String lecturerCode, String name, String dob) {
        this.lecturerCode = lecturerCode;
        this.name = name;
        this.dob = dob;
    }

    public void addCourse(Course course, int semester) {
        courses.add(course);
        System.out.println("Course " + course.courseName + " added for semester " + semester + ".");
    }
}
