
public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare variable
		int[] marks = {76, 55, 34, 69, 4, 100, 10};
		//Make toString all elements of array
		//Print in console
		//out.println - print new line
		//out.print - print in one line
		
		//for(int i = 0; i <marks.length; i++){
			
		//	System.out.println(marks[i]);
		//}
		
		System.out.print("[");
		for(int i = 0; i < marks.length-1; i++){
			System.out.print(marks[i]+", ");
		}
		System.out.print(marks[marks.length-1]+"]");
		

		
		
		
	}

}
