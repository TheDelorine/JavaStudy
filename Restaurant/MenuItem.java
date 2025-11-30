import java.util.Scanner;

public abstract class MenuItem {
	private static int totalMenuItems = 0;
	private final int MAX_COOKING_TIME = 120;
	private static Scanner scanner = new Scanner(System.in);

	private String itemId;
	private String name;
	private double price;
	private int cookingTime;
	private boolean isAvailable;

	public MenuItem() {
		this("itemId", "name", 0, 0, false);
	}
	public MenuItem(String itemId, String name, double price) {
		this(itemId, name, price, 0, false);
	}
	public MenuItem(String itemId, String name, double price, int cookingTime, boolean isAvailable) {
		setItemId(itemId);
		setName(name);
		setPrice(price);
		setCookingTime(cookingTime);
		setIsAvailable(isAvailable);
		totalMenuItems++;
	}

	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public void setName(String name) {
		if (name == null || name.equals("")) {
			throw new  IllegalArgumentException("Name не может быть пустым");
		}
		this.name = name;
	}
	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Сумма должна быть положительной");
		}
		this.price = price;
	}
	public void setCookingTime(int cookingTime) {
		if (cookingTime < 1 || cookingTime > MAX_COOKING_TIME) {
			throw new IllegalArgumentException("1 < cookingTime <= " + MAX_COOKING_TIME);
		}
		this.cookingTime = cookingTime;
	}
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getTotalMenuItems() {
		return totalMenuItems;
	}

	public abstract String getItemType();
	public abstract String prepare();

	public String displayInfo() {
		String result = itemId + "\n" + name + "\n" + price + "\n" + cookingTime + "\n" + isAvailable;
		return result;
	}

	public void updatePrice(double newPrice) {
		setPrice(newPrice);
	}
}