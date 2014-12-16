package bjfu.em.se.posweb.domain.salepricing;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 打折策略
 * @author Roy
 *
 */
public interface ISalePricingStrategy {
	/**
	 * 计算折后总价
	 * @param s
	 * @return
	 */
	int calculate(Sale s);
	/**
	 * 获取策略名称
	 * @return
	 */
	String getName();
	/**
	 * 获取策略描述
	 * @return
	 */
	String getDescription();	
}
