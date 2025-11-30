public class Appetizer extends MenuItem {
	private String servingTemperature;
	private boolean isVegetarian;
	private int spiceLevel;

	public String getServingTemperature() {
		return servingTemperature;
	}
	public boolean getIsVegetarian() {
		return isVegetarian;
	}
	public int getSpiceLevel() {
		return spiceLevel;
	}

	public void setServingTemperature(String servingTemperature) {
		if (servingTemperature == null || servingTemperature.equals("")) {
			throw new IllegalArgumentException("servingTemperature не должен быть пустым");
		}
		this.servingTemperature = servingTemperature;
	}
	public void setIsVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public void setSpiceLevel(int spiceLevel) {
		if (spiceLevel > 5 || spiceLevel < 1) {
			throw new IllegalArgumentException("1 <= SpiceLevel <= 5");
		}
		this.spiceLevel = spiceLevel;
	}

	public Appetizer(String itemId, String name, double price, int cookingTime, boolean isAvailable, String servingTemperature, boolean isVegetarian, int spiceLevel) {
		super(itemId, name, price, cookingTime, isAvailable);
		setServingTemperature(servingTemperature);
		setIsVegetarian(isVegetarian);
		changeSpiceLevel(spiceLevel);
	}

	public void changeSpiceLevel(int level) {
		if (level > 5 || level < 1) {
			throw new IllegalArgumentException("1 <= Level <= 5");
		}
		this.spiceLevel = level;
	}

	public String getItemType() {
		return "Закуска";
	}
	public String prepare() {
		return "Готовит закуску";
	}
	public String displayInfo() {
		return super.displayInfo();
	}

	public void displayInfo(boolean showDetails) {
		if (showDetails == true) {
			String result = super.displayInfo() + "\n" + servingTemperature + "\n" + isVegetarian + "\n" + spiceLevel;
			System.out.println(result);
		}
	}

	public String getNutrationInfo() {
		String result = servingTemperature + "\n" + isVegetarian + "\n" + spiceLevel;
		return result;
	}
}