package com.ust.examples;

enum Directions2 {
	EAST ("E"), WEST ("W"), NORTH ("N"), SOUTH ("S");
	
	private final String shortCode;
		Directions2(String code) {
			this.shortCode = code;
	}
	public String getDirectionCode() {
			return this.shortCode;
	}
}



public class EnumExample5 {

	public static void main(String[] args) {
		Directions2 dir = Directions2.SOUTH;
		System.out.println(dir.getDirectionCode());
		Directions2 dir2 = Directions2.EAST;
		System.out.println(dir2.getDirectionCode());

	}

}
