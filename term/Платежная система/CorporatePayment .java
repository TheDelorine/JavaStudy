public class CorporatePayment extends PaymentMethod implements Refundable {
	private double limit = 1000;

	public CorporatePayment(double balance) {
		super(balance);
	}
	public double refund(double amount) {
		if (amount < 0) {
			setBalance(getBalance() + amount);
		}
	}

	@Override
	public boolean isPay(double price) {
		if (price > balance && price > limit) {
			return false;
		}
		return true;
	}

	@Override
	public boolean payment(double price) {
		if (isPay(price)) {
			balance -= price;
			return true;
		}
		return false;
	}

}