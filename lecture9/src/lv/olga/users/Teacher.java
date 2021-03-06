package lv.olga.users;

import java.util.Arrays;

public class Teacher extends Person{
	
	private int numCourse;
	private String[] courses; 
	private static final int MAX_COURSES = 4;
	
	
	public Teacher(String name, String address){
	super(name, address);
	this.numCourse = 0;
	this.courses = new String[MAX_COURSES];
	
	}
	
	public void addCourse(String course){
		courses[numCourse] = course;
		++numCourse; //katru reizi izsaucot metodi, pievieno kursu
//		System.out.println(Arrays.toString(this.courses));
	}
	
	public boolean addCourses(String course){
		for(int i = 0; i<numCourse; i++){
			if(courses[i].equals(course)){
				return false;
			}
		}
		courses[numCourse] = course;
		numCourse++;
		return true;
		
	}
	
	public boolean removeCourses(String course){
		boolean found = false;
		int courseIndex = -1;
		for(int i = 0; i< numCourse; i++){
			if(courses[i].equals(course)){
				courseIndex = i;
				found = true;
				break;
		}
		}
			if(found){
				for(int i = courseIndex; i<numCourse -1; i++){
					courses[i] = courses[i+1];
				}
				numCourse--;
				return true;
			}else{
				return false;
				
			}
		
	}
	
	public String toString(){
		return "Teacher: " + super.toString();
		
	}
	
}