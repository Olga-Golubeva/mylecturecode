
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] number = {1, 3, 4, 2};
		//find number ?? in array
		//print his name in console
		
		int checkNumber = 3;
		
		for(int i = 0; i < number.length; i++){
			if(number[i] == 3){
				System.out.println("Three");
			}else if(number[i] > 3){
				System.out.println("more than three");
			}else{
				System.out.println("Less than three");
			}
			
		}
		
		
	}

}
