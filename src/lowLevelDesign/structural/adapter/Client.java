package lowLevelDesign.structural.adapter;

import java.util.UUID;

import lowLevelDesign.structural.adapter.adapter.PaypalAdapter;
import lowLevelDesign.structural.adapter.adapter.StripeAdapter;
import lowLevelDesign.structural.adapter.paymentGateway.PaymentGateway;
import lowLevelDesign.structural.adapter.paymentGateway.Paypal;
import lowLevelDesign.structural.adapter.paymentGateway.Stripe;

public class Client {
	public static void main(String[] args) {
		Paypal legacyPaypalApp = new Paypal();
		PaymentGateway paymentGateway = new PaypalAdapter(legacyPaypalApp, "xyz@gmail.com");
		paymentGateway.pay("order123", 2312.90);

		Stripe stripeApp = new Stripe();
		PaymentGateway paymentGateway1 = new StripeAdapter(stripeApp, UUID.randomUUID().toString());
		paymentGateway1.pay("order123", 2312.90);

	}
}
