package lv.olga;

import lv.olga.figure.Rectangle;

public class TestFigure {

	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println(rectangle.toString());
		
		Rectangle rectangle2 = new Rectangle (0.0f, 2.0f);
		
		System.out.println(rectangle2);
		
		Rectangle rectangle3 = new Rectangle(2.5f);
		
		System.out.println(rectangle3);
		

	}

}
