package lv.olga;

public class TestArraysandLists {

	
	public static void main(String[] args) {
		
		String[] arr = new String[10];
		String[] arrWidth = {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"};
		arrToString(arr);
		arrToString(arrWidth);
		addElementToArr(arrWidth);
		
		
		}

	public static void arrToString(String[] arr){
		for(int i =0; i<arr.length; i++){
			System.out.println("index number is " + i + " " + arr[i]);
	}

}
	public static void addElementToArr(String[] arr){
	
		for(int i =0; i<arr.length; i++){
			arr[i] = arr[i]+i;
			
		}
		arrToString(arr);
	}
	}
