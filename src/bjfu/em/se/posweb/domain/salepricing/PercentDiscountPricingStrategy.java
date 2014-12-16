package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

public class PercentDiscountPricingStrategy implements ISalePricingStrategy {
	protected double percentage;
	/**
	 * 构造器
	 * 只能被同一个包内的类访问,即只有同一个包内的类才能创建该对象!
	 * @param percentage
	 */
	PercentDiscountPricingStrategy(double percentage) {
		super();
		this.percentage = percentage;
	}
	@Override
	public int calculate(Sale s) {
		return (int)(s.getPreDiscountTotal()*percentage);
	}
	@Override
	public String getName() {
		return String.format(
			"固定%d折", (int)(percentage*100)
			);
	}
	@Override
	public String getDescription() {
		return String.format(
				"折后价格是折钱价格的%d%%", (int)(percentage*100)
				);
	}

}
