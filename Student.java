package scr;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentAge;
	
	
	Course course1 = new Course();
	ArrayList<Course> courseList = new ArrayList<Course>();
	
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	void addCourse(String courseName) {
		System.out.println(courseName);
		
	
	}
}
