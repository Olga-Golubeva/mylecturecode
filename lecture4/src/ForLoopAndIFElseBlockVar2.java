
public class ForLoopAndIFElseBlockVar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] number = {1, 3, 4, 2};
		int checkNumber = 3;
		
		for(int i = 0; i < number.length; i++){
			if(number[i] == 3){
				System.out.println("Three");
			}else if(number[i] != checkNumber){
				System.out.println("more than three");
			}else{
				System.out.println("Less than three");

	}

}
}}