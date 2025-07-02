package lldUseCases.rateLimiter.rateLimiterAlgo;

public class Algo2 extends AbstractRateLimiter{

	@Override
	public boolean isServiceAllowed() {
		System.out.println("I am algo2");
		return false;
	}

}
