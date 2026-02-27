public class MobilePhone {
	public static int totalPhones = 0;
	private final int max_battery = 100;
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;

	public static void displayTechSupport() {
		System.out.println("TechSupport");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBatteryLevel(int batteryLevel) {
		if (batteryLevel >= 0 && batteryLevel <= 100) {
			this.batteryLevel = batteryLevel;
		}
	}

	public void setStorageGB(int storageGB) {
		if (storageGB > 0) {
			this.storageGB = storageGB;
		}
	}

	public void setIsPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getStorageGB() {
		return storageGB;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public boolean getIsPoweredOn() {
		return isPoweredOn;
	}

	public MobilePhone() {
		this("Brand", "Model", 0, 0, false);
	}
	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 0, false);
	}
	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
		totalPhones++;
	}

	public String displayInfo(boolean showPowerStatus) {
		if (showPowerStatus == true) {
			String result = brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
			return result;
		} else {
			String result = brand + "\n" + model + "\n" + storageGB + "\n" + isPoweredOn;
			return result;
		}
	}
	public void powerOn() {
		isPoweredOn = true;
	}
	public void powerOff() {
		isPoweredOn = false;
	}
	public void chargeBattery(int percent, int minutes) {
		if (batteryLevel + percent > 100 || percent < 0) {
			System.out.println("Error");
		} else {
			batteryLevel = batteryLevel + percent;
			System.out.println(minutes);
		}
	}

	public void chargeBattery(int percent) {
		if (batteryLevel + percent > 100 || percent < 0) {
			System.out.println("Error");
		} else {
			batteryLevel = batteryLevel + percent;
		}
	}

	public void useBattery(int percent, String appName) {
		if (batteryLevel - percent < 0 || percent < 0) {
			System.out.println("Error");
		} else {
			batteryLevel = batteryLevel - percent;
			System.out.println(appName);
		}
	}

	public void useBattery(int percent) {
		if (batteryLevel - percent < 0 || percent < 0) {
			System.out.println("Error");
		} else {
			batteryLevel = batteryLevel - percent;
		}
	}
}