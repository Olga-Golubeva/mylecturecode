package lv.olga.repeat;

import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input value ");

		int inputvalue;
		boolean done;

		while (!(input.hasNextInt())) {
			
			if(input.hasNextInt()){
			inputvalue = input.nextInt();
			done = true;
		}
		
		else{
			done = false;
		}
				
//		System.out.println("Assigne to variable with type int "
//				+ inputvalue);
			
		}
	}
}