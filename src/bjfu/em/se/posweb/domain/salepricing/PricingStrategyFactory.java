package bjfu.em.se.posweb.domain.salepricing;

public class PricingStrategyFactory {
	
	private static int count=0;

	/**
	 * 创建定价策略实例
	 * @return
	 */
	public static ISalePricingStrategy createPricingStrategy() {
		count++;
		if (count==1) 
			return new PercentDiscountPricingStrategy(0.85);
		if (count==2) 
			return new AbsoluteDiscountOverThresholdPricingStrategy(500,100);
		if (count==3) 
			return new DiscountOverThresholdPricingStrategy(500,100);
		if (count==4) {
			CompositeBestForCustomerPricingStrategy strategy=
				new CompositeBestForCustomerPricingStrategy();
			strategy.addStrategy(new PercentDiscountPricingStrategy(0.85));
			strategy.addStrategy(new DiscountOverThresholdPricingStrategy(500,100));
			return strategy;
		}
		
		count=0;
		return new NoDiscountPricingStrategy();		
	}

}
