package com.ust.examples;

interface Polygon {
	void getArea(int length, int breadth);
	
}
interface Polygon1 {
	void getArea(float radius);
}

class Rectangle implements Polygon {
	public void getArea(int length, int breadth) {
		System.out.println("The area of the rectangle is "+(length * breadth));
	}
}
class Square implements Polygon {
	public void getArea(int length, int breadth) {
		System.out.println("The area of the square is "+(length * length));
	}
}
class Circle implements Polygon1 {
	public void getArea(float radius) {
		System.out.println("The area of the circle is "+(3.214* radius * radius));
	}
}
public class PolygonDemo {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.getArea(5, 6);
		
		Square s1 = new Square();
		s1.getArea(5, 0);
		
		Circle c1 = new Circle();
		c1.getArea(5);

	}

}
