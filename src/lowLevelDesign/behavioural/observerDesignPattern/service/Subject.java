package lowLevelDesign.behavioural.observerDesignPattern.service;

public interface Subject {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
