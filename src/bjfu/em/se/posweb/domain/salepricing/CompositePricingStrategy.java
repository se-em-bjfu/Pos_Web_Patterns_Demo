package bjfu.em.se.posweb.domain.salepricing;

import java.util.ArrayList;
import java.util.List;

import bjfu.em.se.posweb.domain.Sale;

/**
 * 组合策略类
 * @author Roy
 *
 */
public abstract class CompositePricingStrategy implements ISalePricingStrategy {
	protected List<ISalePricingStrategy> strategies;
	
	public CompositePricingStrategy(){
		strategies=new ArrayList<ISalePricingStrategy>();
	}

	public void addStrategy(ISalePricingStrategy strategy) {
		strategies.add(strategy);
	}
}
