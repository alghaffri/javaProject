package scr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
	public static void main(String[] args) {
		String cyan = "\u001b[36m";
		String brightYellow = "\u001b[93m";
		Stack<String> stackHis = new Stack<String>();

		School school = new School("Muscat", 43432);
		Scanner sc = new Scanner(System.in);
		ArrayList<Department> departmentList = new ArrayList<Department>();
		Boolean condtion = true;
		Boolean condtion1 = true;
		Boolean condtion2 = true;
		Boolean condtion3 = true;
		Boolean condtion4 = true;
		
		
		while(condtion4) {

			System.out.println("please select one ");

			System.out.println("1 - Do object chaining ");

			System.out.println("2 - Display History in text file ");

			System.out.println("3 - Display History in console ");
			System.out.println("4 - Search for word ");
			System.out.println("5 - Exit");

			int option1 = sc.nextInt();

			if( option1== 1) {
			
			

		System.out.println(cyan + "Enter School Name"); // user add school name
		String name = sc.next();
		school.setName(name);
		stackHis.push(name);
		System.out.println(brightYellow + "School Name :" + school.getName());

		System.out.println(cyan + "Enter School location"); // user add school location
		String location = sc.next();
		school.setLocation(location);
		stackHis.push(location);
		System.out.println(brightYellow + "School location :" + school.getLocation());

		System.out.println(cyan + "Enter School ID");
		Integer id = sc.nextInt();
		school.setId(id);
		stackHis.push(id.toString());
		System.out.println(brightYellow + "School ID :" + school.getId());

		
		/////////////////////////////////////////////////////////////////////

		while (condtion) {

			Department departmentX = new Department("Math", 5454);

			System.out.println(cyan + "Enter Department Name");
			String dname = sc.next();
			departmentX.setName(dname);
			stackHis.push(dname);
			System.out.println(brightYellow + " Department Name : " + departmentX.getName());
			System.out.println(cyan + "Enter Department Size");
			Integer dsize = sc.nextInt();
			departmentX.setSize(dsize);
			stackHis.push(dsize.toString());
			System.out.println(brightYellow + " Department Size : " + departmentX.getSize());

			while (condtion1) {
				Teacher teacher1 = new Teacher();

				System.out.println(cyan + "Enter Teacher Name");
				teacher1.setTeacherName(sc.next());
				
				
				System.out.println(brightYellow + "Enter Teacher id");
				teacher1.setTeacherId(sc.nextInt());
				departmentX.teacherList.add(teacher1);

				////////// add while loop//////////////

				while (condtion2) {

					Student student1 = new Student();

					System.out.println(cyan + "Enter Student Name");
					student1.setStudentName(sc.next());

					System.out.println(brightYellow + "Enter Student Age");
					student1.setStudentAge(sc.nextInt());

					while (condtion3) {
						Course course1 = new Course();

						System.out.println(cyan + "Enter Course Name");
						course1.setCourseName(sc.next());

						System.out.println(brightYellow + "Enter Course ID");
						course1.setCourseId(sc.nextInt());

						System.out.println(cyan + "Enter Mark");
						course1.mark1.setMark(sc.nextDouble());

						student1.courseList.add(course1);
						System.out.println(brightYellow + "Do you want to add another Course 1 if yes");
						if (sc.nextInt() != 1) {
							condtion3 = false;

						}

					}

					teacher1.studentList.add(student1);
					System.out.println("Do you want to add another Student 1 if yes");
					if (sc.nextInt() != 1) {
						condtion2 = false;

					}
					condtion3 = true;
					
					

				}

				System.out.println("Do you want to add another Teacher 1 if yes");
				if (sc.nextInt() != 1) {
					condtion1 = false;

				}
				condtion2 = true;

			}
			
	
		{
			
		}

			departmentList.add(departmentX);
			System.out.println("Do you want add another Department 1 if yes");
			condtion1 = true;
			condtion2 = true;
			int option = sc.nextInt();
			if (option != 1) {
				condtion = false;

				/////////////////////// School Details/////////////////

				System.out.println(cyan + "======+++ School Info +++======");
				System.out.println(cyan + "School Name is :" + school.getName());
				System.out.println(cyan + "School ID is :" + school.getId());
				System.out.println(cyan + "====== ========= ======");

				///////// for each loop ////////////
				for (Department department : departmentList) {
					System.out.println(brightYellow + "===========>>>  Department Info  <<< ===========");
					System.out.println(brightYellow + " Department Name : " + department.getName());
					System.out.println(brightYellow + " Department Size : " + department.getSize());
					System.out.println("=====================<>========================");

					for (Teacher teacher : department.teacherList) {
						System.out.println(cyan + " Teacher Name : " + teacher.getTeacherName());
						System.out.println(cyan + " Teacher id : " + teacher.getTeacherId());

						for (Student student : teacher.studentList) {
							System.out.println(brightYellow + "Student Name : " + student.getStudentName());
							System.out.println(brightYellow + " Student Age :" + student.getStudentAge());

							for (Course course : student.courseList) {
								System.out.println(cyan + "Course Name : " + course.getCourseName());
								System.out.println(cyan + "Course ID : " + course.getCourseId());
								System.out.println(cyan + "Enter Mark : " + course.mark1.getMark());
							}
						}
					}
			
				}
		
		}}}
			else if (option1 == 2){

					System.out.println("============== History ==============");
					System.out.println("++++ School Details ++++");
					System.out.println("Print to a text file");
					File f1 = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Test\\src\\scr\\HistoryFile.txt");
					
					
					try {
						FileWriter f2 = new FileWriter(f1);
					for(String s : stackHis) {
						f2.write("\n");
						f2.write(s);
					}
					f2.close();
					}
					catch (IOException e) {
	
					System.out.println("Error");

					e.printStackTrace();

					}

		}
			else if(option1 == 3) {
				
				try {
				      File f3 = new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Test\\\\src\\\\scr\\\\HistoryFile.txt");
				      Scanner file1 = new Scanner(f3);
				      while (file1.hasNextLine()) {
				        String data = file1.nextLine();
				        System.out.println(data);
				      }
				      file1.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("Error.");
				      e.printStackTrace();
				    }
			}
			else if(option1 == 4) {
		        
		        System.out.print(" Enter Word to search ");
		        String input = sc.next();
		        int count = 0;
		        File file4 = new File("C:\\\\\\\\Users\\\\\\\\Lenovo\\\\\\\\eclipse-workspace\\\\\\\\Test\\\\\\\\src\\\\\\\\scr\\\\\\\\HistoryFile.txt");
		        try {
		        	
		        	Scanner sr = new Scanner(file4);
		        	while(sr.hasNext()){
		        		String[] stringCount = sr.nextLine().split(" ");
		        		for(int i = 0; i < stringCount.length; i++) {
		        		if(input.equalsIgnoreCase(stringCount[i])) {
		        			count++;
		        		}
		        	}  
			
		        	} 
		        	System.out.println(" The Word exists " + count + " Times ");
		        	sr.close();
		        }
		        catch (FileNotFoundException e) {
				      System.out.println("Error.");
				      e.printStackTrace();
				    }
		        	
			
			}


					else {

						condtion4 = false;

					}
		
				
			}		System.out.println(brightYellow + "+++ Good bye +++");
		
		sc.close();
	}
			

		
		
		
	}
	
