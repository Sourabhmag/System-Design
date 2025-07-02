package lldUseCases.rateLimiter.factory;

import lldUseCases.rateLimiter.rateLimiterAlgo.Algo3;
import lldUseCases.rateLimiter.rateLimiterAlgo.RateLimiterAlgo;

public class Algo3RateLimiterFactory extends RateLimiterFactory{
	
	private static RateLimiterAlgo algo3 = null;
	@SuppressWarnings("static-access")
	@Override
	protected RateLimiterAlgo getRateLimiter() {
		return this.getInstance();
	}
	
	private static RateLimiterAlgo getInstance() {
		if(algo3 == null) {
			synchronized (RateLimiterAlgo.class) {
				if(algo3 == null) {
					algo3 = new Algo3();
				}
			}
		}
		
		return algo3;
	}

}
