
public class ArraysSumForLoop {

	
	public static void main(String[] args) {
	
		int[] marks = {76, 55, 34, 69, 4, 100, 10};
		//sum all values in arrays
		//print in console
		
//		int result = 10;
//		System.out.println("result value: "+result);
//		int testInt = 90;
//		result = 200;
//		System.out.println("result value: "+result);
		
		int sum = 0;
		for(int i = 0; i < marks.length; i++){
			sum+=marks[i];
		}
		System.out.println("Sum of marks: "+sum);
		
//		System.out.println(marks[0]+marks[1]);
		
		int sumTest = 0;
		sumTest = sumTest + 200; //200
		sumTest = sumTest + 220; //200+220 = 420
		sumTest = sumTest + 240; //420+240 = 660
		
		System.out.println("Testing += operator:" +sumTest);

		// -= how it works
		
		int subOperator = 1000;
		subOperator = subOperator - 200;
		subOperator -= 200; 
		subOperator  -= 300; 
		subOperator  -= 10; 
		
		System.out.println("Testing -= operator:" +subOperator);
		
	}

}
