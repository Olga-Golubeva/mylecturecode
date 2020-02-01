package lv.olga;

import lv.olga.encapsulation.Student;

public class TestEncapsulation {


	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setName("Janis");
		
		System.out.println(student.getName());
		
	}

}
