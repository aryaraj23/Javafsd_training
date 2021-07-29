package com.ust.examples;

import java.util.PriorityQueue;

public class CollectionExample6 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(); //empty priority queue
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(50);
		
		System.out.println(pQueue.peek()); //to print top element
		System.out.println(pQueue.poll()); //to print top element and remove it from the container
		System.out.println(pQueue.peek()); //to print top element again
	}

}
