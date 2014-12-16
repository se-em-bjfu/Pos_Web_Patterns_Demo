package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 满XX减YY（只减一次）折扣策略
 * @author Roy
 *
 */
public class AbsoluteDiscountOverThresholdPricingStrategy implements
		ISalePricingStrategy {
	private int threshold;
	private int discount;
	
	/**
	 * @param threshold 满多少(单位为分)?
	 * @param discount 减多少(单位为分)?
	 */
	AbsoluteDiscountOverThresholdPricingStrategy(int threshold, int discount) {
		super();
		this.threshold = threshold;
		this.discount = discount;
	}

	@Override
	public int calculate(Sale s) {
		int total=s.getPreDiscountTotal();
		if (total>=threshold)
			return total-discount;
		return total;
	}

	@Override
	public String getName() {
		return String.format(
			"满%d减%d(只减一次)", 
			threshold/100,discount/100);
	}

	@Override
	public String getDescription() {
		return String.format(
				"总价满%d减%d,不累计", 
				threshold/100,discount/100);
	}

}
