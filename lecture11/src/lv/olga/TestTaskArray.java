package lv.olga;

import java.util.ArrayList;

public class TestTaskArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("VW");
		cars.add("Volvo");
		cars.add("Opel");
		cars.add("Ferrari");
		cars.add("Ford");
		
		System.out.println(cars.indexOf("BMW"));
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(5));
		System.out.println(cars.set(0, "Lamborgini"));
//		cars.clear();
		
		
		System.out.println("**************************************");
		
		for(String car : cars){
		
		System.out.println(car);

	}
		System.out.println();
		cars.remove("Ferrari");
		cars.remove("Volvo");
		System.out.println(cars.size());
				for(String car : cars){
					
					System.out.println(car);
	}
	}
}