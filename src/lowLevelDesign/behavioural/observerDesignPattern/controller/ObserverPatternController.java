package lowLevelDesign.behavioural.observerDesignPattern.controller;

import lowLevelDesign.behavioural.observerDesignPattern.service.Observer;
import lowLevelDesign.behavioural.observerDesignPattern.serviceImpl.LEDDisplay;
import lowLevelDesign.behavioural.observerDesignPattern.serviceImpl.PhoneDisplay;
import lowLevelDesign.behavioural.observerDesignPattern.serviceImpl.WeatherStation;

public class ObserverPatternController {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay1 = new PhoneDisplay("Phone 1");
		Observer phoneDisplay2 = new PhoneDisplay("Phone 2");
		Observer ledDisplay = new LEDDisplay();

		weatherStation.addObserver(phoneDisplay1);
		weatherStation.addObserver(phoneDisplay2);
		weatherStation.addObserver(ledDisplay);

		System.out.println("Setting temperature to 25°C...");
		weatherStation.setTemperature(25);

		System.out.println("\nRemoving Phone 2 from observer list...");
		weatherStation.removeObserver(phoneDisplay2);

		System.out.println("\nSetting temperature to 30°C...");
		weatherStation.setTemperature(30);
	}
}
