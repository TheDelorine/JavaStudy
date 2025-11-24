public class Product {
	private static Scanner scanner = new Scanner(System.in);
	public static int totalProducts = 0;
	public final int store_name = "Супермаркет 'У дома'";
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;

	public static double (Product[] products) {
		double result = 0;
		for (int i = 0; i < products.length(); i++) {
			result += products[i].getPrice();
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public boolean getInStock() {
		return inStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		while (price < 0 || price > 1_000_000) {
			System.out.println("Error");
			price = scanner.nextDouble();
		}
		this.price = price;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public void setQuantity(int quantity) {
		while (quantity < 0) {
			System.out.println("Error");
			quantity = scanner.nextInt();
		}
		this.quantity = quantity;
	}

	public Product() {
		this("Name", 0, "category", false, 0);
	}
	public Product(String name, double price, String category) {
		this(name, price, category, false, 0);
	}
	public Product(String name, double price, String category, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		if (quantity != 0) {
			this.inStock = true;
		}
		totalProducts++;
	}
	public String displayInfo(boolean showStockStatus) {
		if (showStockStatus == true) {
			String result = name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
			return result;
		} else {
			String result = name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
			return result;
		}
	}

	public void applyDiscount(double percent) {
		if (percent >= 0 && percent <= 100) {
			price = price * (1 - percent / 100);
		} else {
			System.out.println("Error");
		}
	}

	public void applyDiscount(double percent, String promoCode) {
		if (percent >= 0 && percent <= 100) {
			price = price * (1 - percent / 100);
			System.out.println(promoCode);
		} else {
			System.out.println("Error");
		}
	}

	public void restock(int amount) {
		if (amount > 0) {
			quantity = quantity + amount;
		} else {
			System.out.println("Error");
		}
		inStock = true;
	}

	public void restock(int amount, String supplier) {
		if (amount > 0) {
			quantity = quantity + amount;
			System.out.println(supplier);
		} else {
			System.out.println("Error");
		}
		inStock = true;
	}



	public void sell(int amount) {
		if (amount > 0 && quantity >= amount) {
			quantity = quantity - amount;
		} else {
			System.out.println("Error");
		}
		if (quantity == 0) {
			inStock = false;
		}
	}

	public void sell(int amount, String customer) {
		if (amount > 0 && quantity >= amount) {
			quantity = quantity - amount;
			System.out.println(customer);
		} else {
			System.out.println("Error");
		}
		if (quantity == 0) {
			inStock = false;
		}
	}
}