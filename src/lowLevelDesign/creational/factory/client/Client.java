package lowLevelDesign.creational.factory.client;

import lowLevelDesign.creational.factory.factory.CarVehicleFactory;
import lowLevelDesign.creational.factory.factory.MotorCycleVehicleFactory;
import lowLevelDesign.creational.factory.service.Vehicle;

public class Client {
	public static void main(String[] args) {
		CarVehicleFactory carVehicleFactory = new CarVehicleFactory();
		Vehicle vehicle = carVehicleFactory.buildVehicle();
		vehicle.build();
		
		Vehicle bike = new MotorCycleVehicleFactory().buildVehicle();
		bike.build();
	}
}
