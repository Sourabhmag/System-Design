package lowLevelDesign.behavioural.strategyDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.strategyDesignPattern.service.PaymentStrategy;

public class UPIStrategy implements PaymentStrategy {
	private String upiId;

	public UPIStrategy(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public void pay(double amount) {
		System.out.printf("Paid Rs.%.2f via upi (%s)\n", amount, upiId);
	}
}
