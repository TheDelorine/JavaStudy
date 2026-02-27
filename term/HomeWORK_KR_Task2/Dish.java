public abstract class Dish {
	private final double MAX_PRICE = 10000;

	private String title;
	private double price;

	public Dish(String title, double price) {
		setTitle(title);
		setPrice(price);
	}

	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}

	public void setTitle(String title) {
		if (title == null || title.equals("")) {
			throw new IllegalArgumentException("Введите не пустое название title");
		}
		this.title = title;
	}
	public void setPrice(double price) {
		if (price < 0 || price > MAX_PRICE) {
			throw new IllegalArgumentException("Введите правильное значение price");
		}
		this.price = price;
	}

	public abstract String description();

	public String info() {
		return title + "\n" + price;
	}
}