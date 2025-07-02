package lldUseCases.rateLimiter.rateLimiterAlgo;

public abstract class AbstractRateLimiter implements RateLimiterAlgo{
	public boolean isAllowed() {
		System.out.println("Common code");
		return isServiceAllowed();
	}
	
	public abstract boolean isServiceAllowed();
}
