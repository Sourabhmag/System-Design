package lowLevelDesign.structural.adapter.adapter;

import lowLevelDesign.structural.adapter.paymentGateway.PaymentGateway;
import lowLevelDesign.structural.adapter.paymentGateway.Paypal;

public class PaypalAdapter implements PaymentGateway {
	private final Paypal paypal;
	private final String customerEmailId;

	public PaypalAdapter(Paypal paypal, String customerEmailId) {
		this.paypal = paypal;
		this.customerEmailId = customerEmailId;
	}

	@Override
	public void pay(String orderId, double amount) {
		this.paypal.sendPayment(this.customerEmailId, orderId, amount);
	}
}
