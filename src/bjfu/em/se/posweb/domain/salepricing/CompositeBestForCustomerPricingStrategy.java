package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 取所有折扣策略中使折后总价最低的那种
 * @author Roy
 *
 */
public class CompositeBestForCustomerPricingStrategy extends
		CompositePricingStrategy {

	@Override
	public int calculate(Sale s) {
		int min=s.getPreDiscountTotal();
		for (ISalePricingStrategy strategy:strategies) {
			int price=strategy.calculate(s);
			if (price<min) {
				min=price;
			}
		}
		return min;
	}

	@Override
	public String getName() {
		return "取最低折扣组合策略";
	}

	@Override
	public String getDescription() {
		StringBuffer sb=new StringBuffer();
		sb.append("取下列所有折扣策略中使总价最低的那种:\n");
		for (ISalePricingStrategy strategy:strategies) {
			sb.append("* ");
			sb.append(strategy.getDescription());
			sb.append("\n");
		}
		return sb.toString();
	}

}
