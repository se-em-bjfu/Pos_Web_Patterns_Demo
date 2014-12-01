package bjfu.em.se.posweb.domain.accounting;

/**
 * 外部财务系统处理异常
 * @author Roy
 *
 */
public class AccountingException extends Exception {
	public AccountingException() {
		super("外部财务系统处理异常!");
	}
}
