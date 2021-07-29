package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class StudentNew {
	int rollno;
	String name;
	int age;
	StudentNew(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}


class NameComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		StudentNew s1 =(StudentNew)ob1;
		StudentNew s2 =(StudentNew)ob2;
		
		return s1.name.compareTo(s2.name);
		
	}

}

class AgeComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		StudentNew s1 =(StudentNew)ob1;
		StudentNew s2 =(StudentNew)ob2;
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
		
	
	}

}
public class ComparatorExample1{
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new StudentNew(101,"Arya",23));
		al.add(new StudentNew(102,"Alona",22));
		al.add(new StudentNew(104,"Sarmada",24));
		al.add(new StudentNew(103,"Akhila",22));
		
		System.out.println("Sorting by name");
		
		Collections.sort(al,new NameComparator());
		Collections.sort(al,new AgeComparator());
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			StudentNew st = (StudentNew)itr.next();
			System.out.println(st.rollno+"\s"+st.name+"\s"+st.age);
		}
		
	}

}
