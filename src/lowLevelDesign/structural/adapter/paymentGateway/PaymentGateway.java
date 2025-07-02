package lowLevelDesign.structural.adapter.paymentGateway;

public interface PaymentGateway {
	void pay(String orderId, double amount);
}
