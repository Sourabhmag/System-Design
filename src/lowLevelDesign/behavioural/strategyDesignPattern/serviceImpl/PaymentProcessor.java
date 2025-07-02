package lowLevelDesign.behavioural.strategyDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.strategyDesignPattern.service.PaymentStrategy;

public class PaymentProcessor {
	private PaymentStrategy strategy;

	// Set strategy dynamically
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void processPayment(double amount) {
		if (strategy == null) {
			throw new IllegalStateException("Payment strategy not set!");
		}
		strategy.pay(amount);
	}
}
