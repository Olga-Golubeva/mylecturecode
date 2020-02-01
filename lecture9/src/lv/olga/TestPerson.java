package lv.olga;

import lv.olga.users.Teacher;

public class TestPerson {

	
	public static void main(String[] args) {
		
	
		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";
		
		System.out.println(strArr[0]+ ", " +strArr[1]);
		
		
	Teacher teacher1 = new Teacher("Toms", "Riga");
	System.out.println(teacher1.toString());
//	teacher1.addCourse("Sport");
//	teacher1.addCourse("Math");
//	teacher1.addCourse("English");
//	teacher1.addCourse("History");
	String[] courses = {"Sport", "Math", "English", "History"};
	
//	for-each loops
	for(String course: courses){
		teacher1.addCourse(course);
	}
	
	
	Teacher t1 = new Teacher("Janis", "Ogre");
	System.out.println(t1.toString());
	String[] coursesForT1 = {"Math", "Biology", "Eng", "Math"};
	for(String X: coursesForT1){
		if(t1.addCourses(X)){
			System.out.println(X + " added");
		}else{
			System.out.println(X + " cannot be added");
		}
		
	}
	
	for(String X: coursesForT1){
		if(t1.removeCourses(X)){
			System.out.println(X + " removed");
		}else{
			System.out.println(X + " cannot be removed");
		}
	}
	}
}

