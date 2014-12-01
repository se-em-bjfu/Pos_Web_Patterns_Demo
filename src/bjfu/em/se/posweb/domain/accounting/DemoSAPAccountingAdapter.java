package bjfu.em.se.posweb.domain.accounting;

import bjfu.em.se.posweb.domain.Sale;
import bjfu.em.se.posweb.domain.payment.Payment;

/**
 * SAP财务系统接口Demo实现
 * @author Roy
 *
 */
public class DemoSAPAccountingAdapter implements IAccountingAdapter {

	@Override
	public void postReceivable(Payment payment) throws AccountingException {
		System.out.println("Demo SAP Accounting System:");
		System.out.println("processing post Receivable");
		System.out.println("");
	}

	@Override
	public void postSale(Sale sale) throws AccountingException {
		System.out.println("Demo SAP Accounting System:");
		System.out.println("processing sale");
		System.out.println("");
	}

}
