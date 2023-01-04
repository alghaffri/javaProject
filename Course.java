package scr;

import java.io.Serializable;

public class Course implements Serializable{
	private String courseName;
	private String courseType;
	private int courseId;
	
	
      Mark mark1 = new Mark();
      
      
	
	
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	void addMark(int mark) {
		System.out.println( mark);
		
	}
	
		
	}
	
	

