public class PaymentService {
	public PaymentResult pay(PaymentMethod paymentMethod, double amount) {
		if (paymentMethod.payment(amount) == false) {
			return new PaymentResult(false, amount, paymentMethod.getBalance());
		} else {
			return new PaymentResult(true, amount, paymentMethod.getBalance());
		}
	}

	public void refunding(PaymentMethod paymentMethod, double amount) {
		if (paymentMethod instanceof Refundable) {
			paymentMethod.addBalance(amount);
		}
	}
}