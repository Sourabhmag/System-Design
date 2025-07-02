package lowLevelDesign.behavioural.observerDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.observerDesignPattern.service.Observer;

public class LEDDisplay implements Observer {
	@Override
	public void update(float temperature) {
		System.out.println("LED Display: Temperature is now " + temperature + "°C");
	}

}
