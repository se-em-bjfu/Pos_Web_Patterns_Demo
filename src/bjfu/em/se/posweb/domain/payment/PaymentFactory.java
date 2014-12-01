package bjfu.em.se.posweb.domain.payment;

import bjfu.em.se.posweb.domain.exceptions.WrongPaymentTypeException;

/**
 * 支付类族的工程类
 * @author Roy
 *
 */
public class PaymentFactory {
	/**
	 * 创建支付类
	 * @param amount
	 * @param type
	 * @return
	 * @throws WrongPaymentTypeException 支付类型错误异常
	 */
	public static Payment createPayment(int amount,String type) throws WrongPaymentTypeException {
		Payment payment=null;
		//这里使用了Java 7的String case功能.Java 6无法编译
		switch(type) {
		case "ByCash":
			payment=new CashPayment(amount);
			break;
		case "ByCreditCard":
			payment=new CreditCardPayment(amount);
			break;
		case "ByCheck":
			payment=new CheckPayment(amount);
			break;
		default:
			throw new WrongPaymentTypeException("支付类型"+type+"错误!");
		}
		return payment;
	}
}
