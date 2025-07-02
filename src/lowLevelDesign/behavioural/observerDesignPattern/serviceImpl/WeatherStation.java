package lowLevelDesign.behavioural.observerDesignPattern.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import lowLevelDesign.behavioural.observerDesignPattern.service.Observer;
import lowLevelDesign.behavioural.observerDesignPattern.service.Subject;

public class WeatherStation implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private float temperature;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature);
		}
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
}
