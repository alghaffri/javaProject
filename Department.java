package scr;

import java.util.ArrayList;

public class Department {
	private String name;
	private int size;
	
	
	Department(String name,int size)
	{
		System.out.println("This is first Department" + name +""+ size);
	this.name = name;
	this.size = size;
	}
	Teacher teacher1 = new Teacher();
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	void addTeacher(String teacherName) {
		Teacher teacher1= new Teacher();
		teacher1.setTeacherName(teacherName);
		
		
		
		
		
		
		
	}
	
	
	

}
