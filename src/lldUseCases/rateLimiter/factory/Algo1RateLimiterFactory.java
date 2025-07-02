package lldUseCases.rateLimiter.factory;

import lldUseCases.rateLimiter.rateLimiterAlgo.Algo1;
import lldUseCases.rateLimiter.rateLimiterAlgo.RateLimiterAlgo;

public class Algo1RateLimiterFactory extends RateLimiterFactory{
	private static RateLimiterAlgo algo1 = null;
	@SuppressWarnings("static-access")
	@Override
	protected RateLimiterAlgo getRateLimiter() {
		return this.getInstance();
	}
	
	private static RateLimiterAlgo getInstance() {
		if(algo1 == null) {
			synchronized (RateLimiterAlgo.class) {
				if(algo1 == null) {
					algo1 = new Algo1();
				}
			}
		}
		
		return algo1;
	}
}
