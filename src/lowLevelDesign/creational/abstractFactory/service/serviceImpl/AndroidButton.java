package lowLevelDesign.creational.abstractFactory.service.serviceImpl;

import lowLevelDesign.creational.abstractFactory.service.Button;

public class AndroidButton implements Button{

	@Override
	public void paint() {
		System.out.println("I am Android Button");
	}

}
