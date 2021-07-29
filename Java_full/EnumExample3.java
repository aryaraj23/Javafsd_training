package com.ust.examples;

enum Directions {
	EAST, WEST, NORTH, SOUTH
}
public class EnumExample3 {

	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		if(dir == Directions.EAST) {
			System.out.println("Direction: east");
		}
		else if(dir == Directions.WEST) {
			System.out.println("Direction: west");
		}
		else if(dir == Directions.NORTH) {
			System.out.println("Direction: north");
		}
		else {
			System.out.println("Direction: south");
		}
	}

}
