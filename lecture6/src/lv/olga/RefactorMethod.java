package lv.olga;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		


		getGreating(9);
		System.out.println(getGreating(9));
		
		getGreatingWithVoid(8);
		
	}

	public static String getGreating(int time){
		if(time <= 8){
			return "Good morning";
			
		}else if (time <= 18){
		
			return	"Good day";
		
		}else{
			
				return "Good evening";
	}
	}
	public static void getGreatingWithVoid(int time){
		if(time <= 8){
			System.out.println("Good morning");
		}else if (time <= 18){
		
				System.out.println("Good day");
		
		}else{
			
				System.out.println("Good evening");
	}
	}
}
