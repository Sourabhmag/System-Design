package lldUseCases.rateLimiter.factory;

import lldUseCases.rateLimiter.rateLimiterAlgo.Algo2;
import lldUseCases.rateLimiter.rateLimiterAlgo.RateLimiterAlgo;

public class Algo2RateLimiterFactory extends RateLimiterFactory{
	private static RateLimiterAlgo algo2 = null;
	@SuppressWarnings("static-access")
	@Override
	protected RateLimiterAlgo getRateLimiter() {
		return this.getInstance();
	}
	
	private static RateLimiterAlgo getInstance() {
		if(algo2 == null) {
			synchronized (RateLimiterAlgo.class) {
				if(algo2 == null) {
					algo2 = new Algo2();
				}
			}
		}
		
		return algo2;
	}
}
