
public class ArraysPrimitiveDataType {


	public static void main(String[] args) {
		
		int[] arrays; //Declare array with type int
		
//		int arrays2[]; // tas pats ka augstak, bet tā mēs tā nerakstīsim	
		 
		arrays = new int[2];
		
		int[] arr = new int [10];
		
		int[] arrTest = new int[5];
		
		arrTest[0] = 10;
		arrTest[1] = 3;
		arrTest[4] = 4;
		
		
		System.out.println(arrTest[0] + " " + arrTest[1] +" " + arrTest[2]+" " + arrTest[3]+" " + arrTest[4]);

		
		System.out.println("**********************************************");
		double[] doubleArray = new double[3];
		doubleArray[0] = 0.5;
		doubleArray[1] = 1;
		doubleArray[2] = 0.2;
		
		System.out.println(doubleArray[0] + " " + doubleArray[1] + " " + doubleArray[2] + " ");
		
		System.out.println("**********************************************");
		char[] charArray = new char[2];
		charArray[0] = 22;
		charArray[1] = 'f';
		
		
		System.out.println(charArray[0] + " " + charArray[1] + " " );
		
		System.out.println("**********************************************");
		boolean[] booleanArray = new boolean[2];
		booleanArray[0] = true;
		booleanArray[1] = false;
		
		
		System.out.println(booleanArray[0] + " " + booleanArray[1] + " " );
		
		int checkLength = arrTest.length;
		int checkLength2 = booleanArray.length;
		
		System.out.println("Arrays length is " + checkLength);
		System.out.println("Arrays length is " + checkLength2);
		
		System.out.println("**********************************************");
		System.out.println(booleanArray[booleanArray.length-1]);
		
		
	}

}
