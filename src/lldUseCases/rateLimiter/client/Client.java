package lldUseCases.rateLimiter.client;

import lldUseCases.rateLimiter.factory.Algo1RateLimiterFactory;
import lldUseCases.rateLimiter.factory.Algo2RateLimiterFactory;
import lldUseCases.rateLimiter.factory.RateLimiterFactory;
import lldUseCases.rateLimiter.rateLimiterAlgo.RateLimiterAlgo;

public class Client {
	public static void main(String[] args) {
		RateLimiterFactory algo1RateLimiterFactory = new Algo1RateLimiterFactory();
		RateLimiterAlgo algo1 = algo1RateLimiterFactory.createFactory();
		algo1.isAllowed();
		
		Algo2RateLimiterFactory algo2Fact = new Algo2RateLimiterFactory();
		RateLimiterAlgo algo2 = algo2Fact.createFactory();
		algo2.isAllowed();
	}
}
