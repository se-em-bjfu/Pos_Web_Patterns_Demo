package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 满XX减YY（累计）折扣策略
 * @author Roy
 *
 */
public class DiscountOverThresholdPricingStrategy implements
		ISalePricingStrategy {
	private int threshold;
	private int discount;
	@Override
	public int calculate(Sale s) {
		int total=s.getPreDiscountTotal();
		int discountTimes=total/threshold;
		return total-discountTimes*discount;
	}

	/**
	 * @param threshold 满多少(单位为分)?
	 * @param discount 减多少(单位为分)?
	 */
	DiscountOverThresholdPricingStrategy(int threshold, int discount) {
		super();
		this.threshold = threshold;
		this.discount = discount;
	}

	@Override
	public String getName() {
		return String.format(
			"满%d减%d(累计)", 
			threshold/100,discount/100);
	}

	@Override
	public String getDescription() {
		return String.format(
				"满%d减%d,多买多减", 
				threshold/100,discount/100);
	}

}
