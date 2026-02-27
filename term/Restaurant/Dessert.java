public class Dessert extends MenuItem {
	private int sweetnessLevel;
	private boolean containsNuts;
	private boolean isGlutenFree;

	public Dessert(String itemId, String name, double price, int cookingTime, boolean isAvailable, int sweetnessLevel, boolean containsNuts, boolean isGlutenFree) {
		super(itemId, name, price, cookingTime, isAvailable);
		this.sweetnessLevel = sweetnessLevel;
		this.containsNuts = containsNuts;
		this.isGlutenFree = isGlutenFree;
	}

	public String getItemType() {
		return "Десерт";
	}
	public String prepare() {
		return "Готовит десерт";
	}
	public String prepare(boolean withExtraDecoration) {
		return "Готовит десерт с дополнительным украшением в виде: " + withExtraDecoration;
	}
	public void addTopping(String topping) {
		System.out.println("Добавил " + topping);
	}

	public void checkAllergies() {
		System.out.println("Аллергенов нет");
	}
}