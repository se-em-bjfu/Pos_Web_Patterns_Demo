package bjfu.em.se.posweb.domain.accounting;

import bjfu.em.se.posweb.domain.Sale;
import bjfu.em.se.posweb.domain.payment.Payment;

/**
 * 金蝶财务系统Demo实现
 * @author Roy
 *
 */
public class DemoKingdeeAccountingAdapter implements IAccountingAdapter {

	@Override
	public void postReceivable(Payment payment) throws AccountingException {
		System.out.println("Demo 金蝶 Accounting System:");
		System.out.println("processing post Receivable");
		System.out.println("");
	}

	@Override
	public void postSale(Sale sale) throws AccountingException {
		System.out.println("Demo 金蝶 Accounting System:");
		System.out.println("processing post Receivable");
		System.out.println("");
	}

}
