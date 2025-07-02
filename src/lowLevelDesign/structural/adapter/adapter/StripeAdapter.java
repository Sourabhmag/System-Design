package lowLevelDesign.structural.adapter.adapter;

import lowLevelDesign.structural.adapter.paymentGateway.PaymentGateway;
import lowLevelDesign.structural.adapter.paymentGateway.Stripe;

public class StripeAdapter implements PaymentGateway {
	private final Stripe stripe;
	private final String token;

	public StripeAdapter(Stripe stripe, String token) {
		this.stripe = stripe;
		this.token = token;
	}

	@Override
	public void pay(String orderId, double amount) {
		this.stripe.sendPayment(this.token, amount);
	}
}
