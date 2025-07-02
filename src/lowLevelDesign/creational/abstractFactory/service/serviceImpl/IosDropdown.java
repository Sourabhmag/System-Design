package lowLevelDesign.creational.abstractFactory.service.serviceImpl;

import lowLevelDesign.creational.abstractFactory.service.DropDown;

public class IosDropdown implements DropDown{

	@Override
	public void paint() {
		System.out.println("I am Ios Dropdown");
	}
}
