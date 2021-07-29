package com.ust.examples;

class CPU {
	double price;
	
	//nested class
	class Processor {
		double cores;
		String manufacturer;
		
		double getCatch() {
			return 4.2;
		}
	}
	
	//nested protected class
	protected class RAM {
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.6;
		}
	}
}

public class ExampleInner {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		
		//create an object of inner class Processor using outer class
		CPU.Processor processor = cpu.new Processor();
		CPU.RAM ram = cpu.new RAM();
		
		System.out.println("Processor Cache = "+processor.getCatch());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());

	}

}
