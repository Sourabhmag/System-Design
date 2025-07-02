package lowLevelDesign.behavioural.observerDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.observerDesignPattern.service.Observer;

public class PhoneDisplay implements Observer {

	private String name;

	public PhoneDisplay(String name) {
		this.name = name;
	}

	@Override
	public void update(float temperature) {
		System.out.println(name + " received update: Temperature is " + temperature + "°C");
	}
}
