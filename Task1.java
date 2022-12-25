package scr;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
        String cyan= "\u001b[36m";
        String brightYellow= "\u001b[93m";
		School school = new School();
		Scanner sc = new Scanner(System.in);
		ArrayList<Department> departmentList = new ArrayList<Department>();

		System.out.println(cyan+ "Enter School Name");  //user add school name
		String name = sc.next();
		school.setName(name);
		System.out.println(brightYellow+"School Name :" + school.getName());

		System.out.println(cyan+"Enter School location"); //user add school location
		String location = sc.next();
		school.setLocation(location);
		System.out.println(brightYellow+"School location :" + school.getLocation());

		System.out.println(cyan+"Enter School ID");
		int id = sc.nextInt();
		school.setId(id);
		System.out.println(brightYellow+"School ID :" + school.getId());

		Boolean condtion = true;
		Boolean condtion1 = true;
		Boolean condtion2 = true;
		Boolean condtion3 = true;
		/////////////////////////////////////////////////////////////////////

		while (condtion) {

			Department departmentX = new Department();

			System.out.println(cyan+"Enter Department Name");
			departmentX.setName(sc.next());

			System.out.println(brightYellow+" Department Name : " + departmentX.getName());
			System.out.println(cyan+"Enter Department Size");
			departmentX.setSize(sc.nextInt());
			System.out.println(brightYellow+" Department Size : " + departmentX.getSize());

			while (condtion1) {
				Teacher teacher1 = new Teacher();

				System.out.println(cyan+"Enter Teacher Name");
				teacher1.setTeacherName(sc.next());

				System.out.println(brightYellow+"Enter Teacher id");
				teacher1.setTeacherId(sc.nextInt());
				departmentX.teacherList.add(teacher1);

				while (condtion2) {

					Student student1 = new Student();

					System.out.println(cyan+"Enter Student Name");
					student1.setStudentName(sc.next());

					System.out.println(brightYellow+"Enter Student Age");
					student1.setStudentAge(sc.nextInt());

					while (condtion3) {
						Course course1 = new Course();

						System.out.println(cyan+"Enter Course Name");
						course1.setCourseName(sc.next());

						System.out.println(brightYellow+"Enter Course ID");
						course1.setCourseId(sc.nextInt());

						System.out.println(cyan+"Enter Mark");
						course1.mark1.setMark(sc.nextInt());

						student1.courseList.add(course1);
						System.out.println(brightYellow+"Do you want to add another Course 1 if yes");
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

			departmentList.add(departmentX);
			System.out.println("Do you want add another Department 1 if yes");
			condtion1 = true;
			condtion2 = true;
			int option = sc.nextInt();
			if (option != 1) {
				condtion = false;
				
				///////////////////////School Details/////////////////

				System.out.println(cyan+"======+++ School Info +++======");
				System.out.println(cyan+"School Name is :" + school.getName());
				System.out.println(cyan+"School ID is :" + school.getId());
				System.out.println(cyan+"====== ========= ======");


				for (Department department : departmentList) {
					System.out.println(brightYellow+"===========>>>  Department Info  <<< ===========");
					System.out.println(brightYellow+" Department Name : " + department.getName());
					System.out.println(brightYellow+" Department Size : " + department.getSize());
					System.out.println("=====================<>========================");

					for (Teacher teacher : department.teacherList) {
						System.out.println(cyan+" Teacher Name : " + teacher.getTeacherName());
						System.out.println(cyan+" Teacher id : " + teacher.getTeacherId());

						for (Student student : teacher.studentList) {
							System.out.println(brightYellow+"Student Name : " + student.getStudentName());
							System.out.println(brightYellow+" Student Age :" + student.getStudentAge());

							for (Course course : student.courseList) {
								System.out.println(cyan+"Course Name : " + course.getCourseName());
								System.out.println(cyan+"Course ID : " + course.getCourseId());
								System.out.println(cyan+"Enter Mark : " + course.mark1.getMark());
							}
						}
					}
				}
				System.out.println(brightYellow+"+++===== Good bye =====+++");
				sc.close();
			}
		}
	}
}
