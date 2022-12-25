package scr;

import java.util.ArrayList;

public class Teacher {
	private String teacherName;
	private int teacherId;
	
	Student student1 = new Student();
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	void addStudent(String studentName) {
		System.out.println(studentName);
		
	}
	
}
