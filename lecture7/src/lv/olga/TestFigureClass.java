package lv.olga;

import lv.olga.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {

		Circle figure = new Circle();
		
		Circle figure1 = new Circle(40.2);
		
		Circle figure2 = new Circle(20.5, "green");
		
		
		

		System.out.println(figure.getColor() + " " + figure.getRadius());
		System.out.println(figure1.getColor() + " " + figure1.getRadius());
		System.out.println(figure2.getColor() + " " + figure2.getRadius());
		
		System.out.println("Area of figure: " +figure.getArea());
		
		System.out.println(figure2.toString());
		System.out.println(figure.toString()+ " and area is " +figure.getArea());
	}

}
