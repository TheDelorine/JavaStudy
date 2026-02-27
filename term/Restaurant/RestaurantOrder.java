public class RestaurantOrder {
	private int totalOrders = 0;
	private final int MAX_TABLE_BUMBER = 50;
	private int countItems = 0;

	private String orderId;
	private int tableNumber;
	private MenuItem[] orderItems;
	private String orderStatus;

	public void addItem(MenuItem item) {
		if (countItems == 0) {
			MenuItem[] newArray = new MenuItem[countItems + 1];
			newArray[countItems] = item;
			countItems++;
			orderItems = newArray;
		} else {
			int index = 0;
			MenuItem[] newArray = new MenuItem[countItems + 1];
			for (MenuItem items : orderItems) {
				newArray[index] = items;
				index++;
			}
			newArray[countItems] = item;
			countItems++;
			orderItems = newArray;
		}
	}

	public void removeItem(String itemId) {
		if (countItems == 0) {
			return;
		}
		int index = 0;
		MenuItem[] newArray = new MenuItem[countItems - 1];
		for (MenuItem item : orderItems) {
			if (item.getItemId().equals(itemId)) {
				continue;
			} else {
				newArray[index] = item;
				index++;
			}
		}
		orderItems = newArray;
		countItems--;
	}

	public double calculateTotal() {
		double result = 0;
		for (MenuItem item : orderItems) {
			result += item.getPrice();
		}
		return result;
	}

	public String getOrderDetails() {
		String result = "";
		for (MenuItem item : orderItems) {
			result += item.displayInfo() + "\n\n";
		}
		return result;
	}

	public void updateStatus(String newStatus) {
		this.orderStatus = newStatus;
	}

	public MenuItem[] getItemsByType(String type) {
		int count = 0;
		int index = 0;
		for (MenuItem item : orderItems) {
			if (item.getItemType().equals(type)) {
				count++;
			}
		}
		MenuItem[] array = new MenuItem[count];
		for (MenuItem item : orderItems) {
			if (item.getItemType().equals(type)) {
				array[index] = item;
				index++;
			}
		}
		return array;
	}

	public int estimatePreparationTime() {
		int result = 0;
		for (MenuItem item : orderItems) {
			result+=item.getCookingTime();
		}
		return result;
	}
}