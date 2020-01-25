package lv.olga;

public class LearnMethodsWithParams {

	
	//cast 
	public static void main(String[] args) {
		
		double radius = 76;
		
		String color = "red";
		
		
		int resultWithCastInt = getArea(radius); // this method cast double to int
		double result = getAreaForCircle(radius);
		System.out.println("Area: "+resultWithCastInt);
		System.out.println("Area: "+result);
		System.out.println( getColorAndArea(color, result));
		
	}

	
	public static int getArea(double radius){
		double result = Math.PI * radius * radius;
		return (int) result;
		
	}
		public static double getAreaForCircle(double radius){
			double result = Math.PI * radius * radius;
			return result;
		}
		
		public static String getColorAndArea(String color, double area){
			return "Color: " + color + " and area " + area;
			
			
			
		}
				
	
}
