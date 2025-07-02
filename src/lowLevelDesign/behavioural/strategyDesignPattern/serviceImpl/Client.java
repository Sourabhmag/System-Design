package lowLevelDesign.behavioural.strategyDesignPattern.serviceImpl;

public class Client {
	public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Use Credit Card
        processor.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456", "123"));
        processor.processPayment(100.00);

        // Switch to UPI
        processor.setPaymentStrategy(new UPIStrategy("sourabhmagdum@ybl"));
        processor.processPayment(50.00);

        // Switch to Crypto
        processor.setPaymentStrategy(new CryptoStrategy("0xABC123"));
        processor.processPayment(75.00);
    }
}
