package lldUseCases.rateLimiter.rateLimiterAlgo;

public class Algo3 extends AbstractRateLimiter{

	@Override
	public boolean isServiceAllowed() {
		System.out.println("I am algo3");
		return false;
	}

}
