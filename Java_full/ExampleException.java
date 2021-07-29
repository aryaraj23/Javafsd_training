package com.ust.examples;
/*
 * Example Exception
 */
public class ExampleException {

	public static void main(String[] args) {
		
		try {

			int a[] = new int[5];
			a[6]=10;
		}	catch(ArithmeticException e1) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next staement..");
		/*String s = null;
		//int x = 5/0;
		
		try {
			try {
				System.out.println(s.length());
			}catch(NullPointerException npe) {
				System.out.println("occured");
				npe.printStackTrace();
			}finally {
				System.out.println("This code gets executed always");
			}
			int a[] = new int[5];
			a[6]=10;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("occured");
			e.printStackTrace();
		}
		*/
		
	}

}
