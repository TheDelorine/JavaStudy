public class CardPayment extends PaymentMethod implements Refundable {
	public CardPayment(double number) {
		super(number);
	}

	@Override
	public boolean isPay(double price) {
		if (price > balance) {
			return false;
		}
		return true;
	}

	public double refund(double amount) {
		if (amount < 0) {
			setBalance(getBalance() + amount);
		}
	}

	@Override
	public boolean payment(double price) {
		if (isPay(price + price * 0.02)) {
			balance -= price + price * 0.02;
			return true;
		}
		return false;
	}
}