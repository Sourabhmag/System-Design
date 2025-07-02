package lowLevelDesign.creational.factory.factory;

import lowLevelDesign.creational.factory.service.Vehicle;
import lowLevelDesign.creational.factory.service.serviceImpl.Car;

public class CarVehicleFactory extends VehicleFactory{

	@Override
	protected Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
