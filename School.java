package scr;

import java.io.Serializable;

public class School implements Serializable {
	
	public String name;
	public String location;
	public int id;
	
	//Department department1 = new Department();
	
	
	
	public School(String name, int id) {
		System.out.println("This is "+ name +""+ id);
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	void DisplayDepartment(String DepartmentName) {
		System.out.println(DepartmentName);
		
	}
}
