
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] marks = {76, 55, 34, 69, 100, 10};
		// For-each loops for(type var : arrays)
		for(int mark: marks){
			System.out.println(mark);
		}	
		System.out.println("*************************************************");
		for(int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
		}
	
		
	
	}
	
	

}
