package lldUseCases.rateLimiter.rateLimiterAlgo;

public class Algo1 extends AbstractRateLimiter{

	@Override
	public boolean isServiceAllowed() {
		System.out.println("I am algo1");
		return false;
	}
}
