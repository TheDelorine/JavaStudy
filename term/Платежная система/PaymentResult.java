public class PaymentResult {
	private final boolean ISSUCCESS;
	private final double AMOUNT;
	private final double BALANCE;

	public PaymentResult(boolean ISSUCCESS, double AMOUNT, double BALANCE) {
		this.ISSUCCESS = ISSUCCESS;
		this.AMOUNT = AMOUNT;
		this.BALANCE = BALANCE;
	}
}