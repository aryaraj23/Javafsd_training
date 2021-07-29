package com.ust.examples;

class CarNew {
	String carName;
	String carType;
	
	//assign values using constructor
	public CarNew(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	//private method
	private String getCarName() {
		return this.carName;
	}
	
	//inner class
	class Engine{
		String engineType;
		void setEngine() {
			if(CarNew.this.carType.equals("4WD")) {
				if(CarNew.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				}else {
					this.engineType = "Bigger";
				}
			}else {
				this.engineType = "Bigger";
			}
			
			
	}
	String getEngineType() {
		return this.engineType;
		}
	}
}
public class MainCar {

	public static void main(String[] args) {
		CarNew car1 = new CarNew("Honda","8WD");
		CarNew.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD = "+engine.getEngineType());
		
		
		CarNew car2 = new CarNew("Crysler","4WD");
		CarNew.Engine engine2 = car2.new Engine();
		engine2.setEngine();
		System.out.println("Engine type for 4WD =  "+engine2.getEngineType());
	}

}
