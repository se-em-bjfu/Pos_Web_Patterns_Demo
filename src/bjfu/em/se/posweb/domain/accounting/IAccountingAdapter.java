package bjfu.em.se.posweb.domain.accounting;

import bjfu.em.se.posweb.domain.Sale;
import bjfu.em.se.posweb.domain.payment.Payment;

/**
 * 外部财务系统接口
 * @author Roy
 *
 */
public interface IAccountingAdapter {
	/**
	 * 发送应收帐款信息
	 * @param payment
	 */
	void postReceivable(Payment payment) throws AccountingException;
	/**
	 * 发送销售信息
	 * @param sale
	 */
	void postSale(Sale sale) throws AccountingException;
}
