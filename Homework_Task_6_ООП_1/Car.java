public class Car {
	private String brand;
	private String model;
	private int year;
	private String color;
	private double price;
	private boolean isRunning;
	private double mileage;

	public Car() {
		this("Brand", "Model", 0, "Color", 0, false, 0);
	}
	public Car(String brand, String model, int year) {
		this(brand, model, year, "Color", 0, false, 0);
	}
	public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.isRunning = isRunning;
		this.mileage = mileage;
	}

	public String displayInfo() {
		String result = brand + "\n" + model + "\n" + year + "\n" + color + "\n" + price + "\n" + isRunning + "\n" + mileage;
		return result;
	}
	public void startEngine() {
		isRunning = true;
	}
	public void stopEngine() {
		isRunning = false;
	}
	public void drive(double distance) {
		if (distance > 0 && isRunning == true) {
			mileage = mileage + distance;
		} else {
			System.out.println("Error");
		}
	}
	public void repaint(String newColor) {
		color = newColor;
	}
	public void updatePrice(double newPrice) {
		price = newPrice;
	}
}