package lv.olga;

public class LearnMethods {

	/**
	 * @param args
	 */
	//void not return type
	//modifiers - public, private, protected
	
	public static void main(String[] args) {
		
		getMyName();
		getMyName();
		getMyName();
		System.out.println("***************************************");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.doYouHaveCat();			//veidojam klases objektu, kurš atsaucas uz metodi (bez "static") 
		

		
	}
	public static void getMyName (){
		System.out.println("My name is Olga");
		
	}
	
	public static void getMyCity (){
		
		getMyName();
		
		System.out.println("My city is Riga");
	}
	public void doYouHaveCat (){
		System.out.println("No I don't");
	}
}
