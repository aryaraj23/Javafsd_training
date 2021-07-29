package com.ust.examples;

public class Example25 {
	int a = 9;
	int b =20;
	
	
	void m1() {
		a = 10;
		b = 30;
	}
	class Test{
		static void m1(Example25[] e) {
		e[1].m1();
		}
	}
	public static void main(String[] args) {
		Example25[] e1 = {new Example25(), new Example25(), new Example25()};
		Test.m1(e1);
		
		for(int i=0; i<e1.length; i++) {
			System.out.println(e1[i].a+"\t");
			System.out.println(e1[i].b+"\n");
		}

	}

}
