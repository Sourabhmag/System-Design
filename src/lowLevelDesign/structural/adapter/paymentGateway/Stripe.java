package lowLevelDesign.structural.adapter.paymentGateway;

public class Stripe {
	public void sendPayment(String token, double amount){
		System.out.println("Making payment for token: " + token);
    }
}
