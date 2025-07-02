package lowLevelDesign.creational.factory.service.serviceImpl;

import lowLevelDesign.creational.factory.service.Vehicle;

public class MotorCycle implements Vehicle{

	@Override
	public void build() {
		System.out.println("Building a Bullet 350");
	}

}
