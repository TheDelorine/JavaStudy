public class BonusPayment extends PaymentMethod {
	public BonusPayment(double balance) {
		super(balance);
	}

	@Override
	public boolean isPay(double price) {
		if (price > balance) {
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