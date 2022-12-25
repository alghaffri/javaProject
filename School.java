package scr;

public class School {
	
	public String name;
	public String location;
	public int id;
	
	Department department1 = new Department();
	
	
	
	
	
	
	
	

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
