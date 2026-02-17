public class Cake extends Dish {
	private boolean isStrawberrySupplement;
	private boolean isChocolateChips;
	
	public Cake() {
		this("title", 0, false, false);
	}
	public Cake(String title, double price) {
		this(title, price, false, false);
	}
	public Cake(String title, double price, int sugarLevel, boolean isVegetarian, boolean isStrawberrySupplement, boolean isChocolateChips) {
		super(title, price);
		this.isStrawberrySupplement = isStrawberrySupplement;
		this.isChocolateChips = isChocolateChips;

	}

	@Override
	public String description() {
		if (isStrawberrySupplement && isChocolateChips) {
			return "Вкусный тортик с вишневой и шоколадной добавкой";
		} else if (isStrawberrySupplement) {
			return "Вкусный тортик с вишневой добавкой";
		} else if (isChocolateChips) {
			return "Вкусный тортик с шоколадной добавкой";
		}
		return "Вкусный тортик";
	}

	@Override
	public String info() {
		return super.info() + "\n" + isStrawberrySupplement + "\n" + isChocolateChips;
	}
}