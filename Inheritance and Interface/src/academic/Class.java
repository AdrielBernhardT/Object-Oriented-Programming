package academic;

import java.util.*;

import actor.Lecturer;
import actor.Student;

public class Class {
    public String classCode;
    public int semester;
    public String year;
    public ArrayList<Course> Courses = new ArrayList<>();
    public ArrayList<Student> Students = new ArrayList<>();
    public ArrayList<Lecturer> Lecturers = new ArrayList<>();


    public Class(String classCode, int semester, String year) {
        this.classCode = classCode;
        this.semester = semester;
        this.year = year;
    }

    public void addCourse(Course course) {
        Courses.add(course);
    }

    public void addStudent(Student student) {
       Students.add(student);
    }

    public void addLecturer(Lecturer lec1, Course co1) {
        Lecturers.add(lec1);
        lec1.addCourse(co1, semester);
    }


}
