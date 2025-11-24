public class BankAccount {
	private static Scanner scanner = new Scanner(System.in);
	private static int totalAccounts = 0;
	private final String bank_name = "Национальный Банк";
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;

	public static double calculateInterest(double amount, double rate, int years) {
		double res = (1 + rate / 100);
		for (int i = 0; i <= years; i++) {
			res *= res;
		}
		return amount * res;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public String getCurrency() {
		return currency;
	}
	public boolean getIsActive() {
		return isActive;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setBalance(double balance) {
		while (balance < 0 || balance > 1_000_000_000) {
			System.out.println("Error");
			balance = scanner.nextDouble();
		}
		this.balance = balance;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public BankAccount() {
		this("accountNumber", "ownerName", 0, "currency", true);
	}

	public BankAccount(String accountNumber, String ownerName) {
		this(accountNumber, ownerName, 0, "currency", true);
	}

	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.currency = currency;
		this.isActive = isActive;
		totalAccounts++;
	}

	public String displayInfo(boolean showStatus) {
		if (showStatus == true) {
			String result = accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
			return result;
		}
		return accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency;
	}

	public String displayInfo() {
		String result = accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
		return result;
	}

	public void deposit(double amount, String description) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println(description);
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}

	public void withdraw(double amount, String purpose) {
		if (balance >= amount && amount > 0) {
			balance = balance - amount;
			System.out.println(purpose);
		} else {
			System.out.println("Error");
		}
	}

	public void withdraw(double amount) {
		if (balance >= amount && amount > 0) {
			balance = balance - amount;
		} else {
			System.out.println("Error");
		}
	}

	public void activateAccount() {
		isActive = true;
	}
	public void deactivateAccount() {
		isActive = false;
	}
}