package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 无折扣
 * @author Roy
 *
 */
public class NoDiscountPricingStrategy implements ISalePricingStrategy {

	@Override
	public int getTotal(Sale s) {
		return s.getPreDiscountTotal();
	}

	@Override
	public String getName() {
		return "无折扣";
	}

	@Override
	public String getDescription() {
		return "无折扣";
	}

}
