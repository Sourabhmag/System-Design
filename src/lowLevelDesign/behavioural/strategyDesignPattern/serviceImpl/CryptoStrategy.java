package lowLevelDesign.behavioural.strategyDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.strategyDesignPattern.service.PaymentStrategy;

public class CryptoStrategy implements PaymentStrategy {
	private String walletAddress;

	public CryptoStrategy(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	@Override
	public void pay(double amount) {
		System.out.printf("Paid Rs.%.2f via Crypto Wallet (%s)\n", amount, walletAddress);
	}
}
