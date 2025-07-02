package lowLevelDesign.structural.adapter.paymentGateway;

public class Paypal {
	public void sendPayment(String email, String orderId, double amount){
        System.out.println("Payment email: " + email);
    }
}
