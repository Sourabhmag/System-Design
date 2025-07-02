package lldUseCases.rateLimiter.factory;

import lldUseCases.rateLimiter.rateLimiterAlgo.RateLimiterAlgo;

public abstract class RateLimiterFactory {
	public RateLimiterAlgo createFactory() {
		return getRateLimiter();
	}

	protected abstract RateLimiterAlgo getRateLimiter();
}
