public abstract class PaymentMethod {
	private double balance;

	public PaymentMethod(double balance) {
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public abstract boolean isPay();

	public abstract boolean payment();

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Не может быть отрицательным.");
		}
		this.balance = balance;
	}
}