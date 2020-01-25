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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length");
		
		int[] arr = new int[];
		
		System.out.println("Enter first array value");
		
		arr[0] = sc.nextInt();
		
		System.out.println("Enter second array value");
		
		arr[1] = sc.nextInt();
		
		
		
		System.out.println(arr[0] + ", " +arr[1]);

	}

}
