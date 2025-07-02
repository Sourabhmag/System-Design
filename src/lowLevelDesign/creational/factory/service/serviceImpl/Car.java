package lowLevelDesign.creational.factory.service.serviceImpl;

import lowLevelDesign.creational.factory.service.Vehicle;

public class Car implements Vehicle{

	@Override
	public void build() {
		System.out.println("Building a super car");
	}

}
