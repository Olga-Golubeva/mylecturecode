package lv.olga.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//user input array length;
		//User add to element value;
		//Array values are printed to console;
		//Create methods for printing out arrays values
		//for loop
		
		System.out.println("Enter array length");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter array value");
			
			arr[i] +=sc.nextInt();
		}
		
//		if (i == arr.length) {
		
		System.out.println("Inserted array elements: ");
		for (int i = 0; i <= arr.length; i++){

				System.out.println(arr[i]);

			}
		}
		
		
		
		
		
		
		
		
		
		
	}

