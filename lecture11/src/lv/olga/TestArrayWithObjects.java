package lv.olga;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayWithObjects {

	
	public static void main(String[] args) {
		
		Integer intObj = 40;
		Double doubObj = 30.21;
		
		
		System.out.println(intObj);
		
		ArrayList<Integer> intArrays = new ArrayList<>();
		intArrays.add(50);
		intArrays.add(34);
		intArrays.add(23);
		intArrays.add(6);
		
		System.out.println(intArrays);
		Collections.sort(intArrays);
		System.out.println(intArrays);
	}

}
