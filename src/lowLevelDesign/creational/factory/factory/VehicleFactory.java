package lowLevelDesign.creational.factory.factory;

import lowLevelDesign.creational.factory.service.Vehicle;

public abstract class VehicleFactory {
	public Vehicle buildVehicle() {
		return createVehicle();
	}

	protected abstract Vehicle createVehicle();
}
