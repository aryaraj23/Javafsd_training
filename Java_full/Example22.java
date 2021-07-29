package com.ust.examples;

public class Example22 {
	
	String fName;
	String lName;
	String city;
	String address;
	String date;
	float salary;
	
	Example22(String x, String y, String z, String a, String d, float s){
		fName = x;
		lName = y;
		city = z;
		address = a;
		date = d;
		salary = s;
	}
	
	void display() {
		System.out.println(fName + " "+ lName+ " "+ city +" "+ address + " "+ date +" "+ salary);
	}
	public static void main(String[] args) {
		
		/*Example22 e1= new Example22("Arya","Raj","Ernakulam","xyz","06 Wed June",25000.0f);
		Example22 e2= new Example22("Akila","Ab","Ernakulam","xyz","06 Wed June",15000.0f);
		Example22 e3= new Example22("Alona","Aj","Ernakulam","xyz","06 Wed June",28000.0f);
		Example22 e4= new Example22("Lon","Ra","Ernakulam","xyz","06 Wed June",35000.0f);
		Example22 e5= new Example22("Viky","M","Ernakulam","xyz","06 Wed June",45000.0f);
		*/
		Example22 array[] = new Example22[5];
		array[0] = new Example22("Arya","Raj","Ernakulam","xyz","06 Wed June",25000.0f);
		array[1] = new Example22("Akila","Ab","Ernakulam","xyz","06 Wed June",15000.0f);
		array[2] = new Example22("Alona","Aj","Ernakulam","xyz","06 Wed June",28000.0f);
		array[3] = new Example22("Lon","Ra","Ernakulam","xyz","06 Wed June",35000.0f);
		array[4] = new Example22("Viky","M","Ernakulam","xyz","06 Wed June",45000.0f);;
		
		for(int i=0; i<array.length; i++) {
			array[i].display();
		}
		
		/*for(Example22 e: array) {
			//System.out.println(e.fName + " "+ e.lName +" "+ e.city +" "+ e.address + " "+ e.date +" "+ e.salary);
			e.display();
		}
		/*e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		 */
	}

}
