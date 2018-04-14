/* 2. Consider a scenario of myself owning a car and a bike, which need fuel to run. The maximum speed at which my car can run is 150 Km/Hr and bike is 100 Km/Hr. write a java program to define an abstract class which contain methods for printing the status of fuel (EMPTY, HALF or FULL) in the vehicle and top speed of it. Vehicles fuel status and top speed is initialized at the time of object creation. (hint: use CONSTRUCTOR, SUPER, ABSTRACT CLASS)
a. Identify the abstract class and normal class to implement above scenario.
b. Check weather constructors can be used in the abstract class.
c. Identify abstract and non-abstract methods in a abstract class.
d. Demonstrate how to pass values from derived class constructor to base class constructor.
e. Display the attributes of the car and a bike using abstract method. */

package lab_programs;

abstract class Vehicle{
	String fuel;

	public Vehicle(String fuel) {
		this.fuel = fuel;
	}
	public void fuelStatus(String vehicle){
		System.out.println("This "+vehicle+"\'s fuel tank is "+fuel);
	}
	abstract void topSpeed();
}
class Car extends Vehicle{
	int speed;
	public Car(String fuel,int carSpeed) {
		super(fuel);	
		speed=carSpeed;
	}

	@Override
	void topSpeed() {
System.out.println("Car runs at "+speed+" Km/Hr top speed");
	}
}
class Bike extends Vehicle{
	int speed;
	public Bike(String fuel,int bikeSpeed) {
		super(fuel);	
		speed=bikeSpeed;
	}

	@Override
	void topSpeed() {
System.out.println("Bike runs at "+speed+" Km/Hr top speed");
	}
}

public class pgm2 {
	public static void main(String[] args) {
		Car car=new Car("FULL",150);
		car.fuelStatus("CAR");
		car.topSpeed();
		System.out.println("\n");
		Bike bike=new Bike("HALF",100);
		bike.fuelStatus("BIKE");
		bike.topSpeed();
	}
}
