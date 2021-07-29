package com.ust.examples;


class GenericsClass<T>{
	private T data;
	public GenericsClass(T data) {
		this.data = data;
	}
	public T getdata() {
		return this.data;
	}
}

public class GenericClassDemo1 {

	public static void main(String[] args) {
		GenericsClass<Integer> gc1 = new GenericsClass<>(5);
		System.out.println("Generic class returns: "+gc1.getdata());
		
		GenericsClass<String> gc2 = new GenericsClass<>("Hello Worlds!");
		System.out.println("Generic class returns: "+gc2.getdata());

	}

}
