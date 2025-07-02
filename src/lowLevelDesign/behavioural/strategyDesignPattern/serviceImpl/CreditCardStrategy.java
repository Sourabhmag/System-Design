package lowLevelDesign.behavioural.strategyDesignPattern.serviceImpl;

import lowLevelDesign.behavioural.strategyDesignPattern.service.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy{
	private String cardNumber;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid Rs.%.2f via Credit Card (%s)\n", amount, cardNumber);
    }
}
