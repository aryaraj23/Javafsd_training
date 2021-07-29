package com.ust.examples;

enum Directions1 {
	EAST, WEST, NORTH, SOUTH
}
public class EnumExample4 {
	Directions1 dir;
	public EnumExample4(Directions1 dir) {
		this.dir =dir;
	}
	public void getMyDirection() {
		switch(dir) {
		case EAST:
			System.out.println("In east Directions");
			break;
		case WEST:
			System.out.println("In west Directions");
			break;
		case NORTH:
			System.out.println("In north Directions");
			break;
		default:
			System.out.println("In south Directions");
			break;
		}
	}
	public static void main(String[] args) {
		EnumExample4 e1 = new EnumExample4(Directions1.EAST);
		e1.getMyDirection();
		EnumExample4 e2 = new EnumExample4(Directions1.SOUTH);
		e2.getMyDirection();
	}

}
