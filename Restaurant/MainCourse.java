public class MainCourse extends MenuItem {
	private String mainIngredient;
	private String sideDish;
	private int calories;

	public String getMainIngredient() {
		return mainIngredient;
	}
	public String getSideDish() {
		return sideDish;
	}
	public int getCalories() {
		return calories;
	}

	public MainCourse(String itemId, String name, double price, int cookingTime, boolean isAvailable, String mainIngredient, String sideDish, int calories) {
		super(itemId, name, price, cookingTime, isAvailable);
		setMainIngredient(mainIngredient);
		setSideDish(sideDish);
		setCalories(calories);
	}

	public void setMainIngredient(String mainIngredient) {
		if (mainIngredient == null || mainIngredient.equals("")) {
			throw new IllegalArgumentException("MainIngredient не может быть пустым");
		}
		this.mainIngredient = mainIngredient;
	}
	public void setSideDish(String sideDish) {
		if (sideDish == null || sideDish == "") {
			throw new IllegalArgumentException("MainIngredient не может быть пустым");
		}
		this.sideDish = sideDish;
	}
	public void setCalories(int calories) {
		if (calories < 1) {
			throw new IllegalArgumentException("calories >= 1");
		}
		this.calories = calories;
	}

	public String getItemType() {
		return "Основное блюдо";
	}
	public String prepare() {
		return "Готовит основное блюдо";
	}

	public void updatePrice(double newPrice) {
		setPrice(newPrice);
	}
	public void updatePrice(double newPrice, String reason) {
		setPrice(newPrice);
		System.out.println("Изменана цена по причине: " + reason);
	}

	public void changeSideDish(String newSideDish) {
		setSideDish(newSideDish);
	}
	public String getCookingInstructions() {
		return "Инструкция по приготовлению...";
	}
}