package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2> {
	int rollno;
	String name;
	int age;
	
	Student2(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student2 st) {
		if (age ==st.age)
				return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101,"Arya",23));
		al.add(new Student2(102,"Chinnu",22));
		al.add(new Student2(101,"Sofi",24));
		
		Collections.sort(al);
		
	for(Student2 st:al) {
		System.out.println(st.rollno+"\s"+st.name+"\s"+st.age);
	}
	}

}
