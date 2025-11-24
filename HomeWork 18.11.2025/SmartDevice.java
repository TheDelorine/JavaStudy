public abstract class SmartDevice {
	private String deviceid;
	private String deviceName;
	private String location;
	private boolean isPoweredOn;
	private double powerConsumption;

	private static int totalDevices;
	private final int MAX_POWER_CONSUMPTION = 5000;
	private static Scanner scanner = new Scanner(System.in);

	public static int getTotalDevices() {
		return totalDevices;
	}

	public SmartDevice() {
		this("deviceid", "deviceName", "location", false, 0);
	}

	public SmartDevice(String deviceid, String deviceName, String location) {
		this(deviceid, deviceName, location);
	}

	public SmartDevice(String deviceid, String deviceName, String location, boolean isPoweredOn, double powerConsumption) {
		this.deviceid = deviceid;
		this.deviceName = deviceName;
		this.location = location;
		this.isPoweredOn = isPoweredOn;
		this.powerConsumption = powerConsumption;
		totalDevices++;
	}

	public String getDeviceId() {
		return deviceid;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public String getLocation() {
		return location;
	}

	public boolean getIsPoweredOn() {
		return isPoweredOn;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setDeviceId(String deviceid) {
		while (deviceid == null || deviceid == "") {
			System.out.println("Error");
			deviceid = scanner.nextDouble();
		}
		this.deviceid = deviceid;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setIsPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}

	public void setPowerConsumption(double powerConsumption) {
		while (powerConsumption < 0 || powerConsumption > MAX_POWER_CONSUMPTION) {
			System.out.println("Error");
			powerConsumption = scanner.nextDouble();
		}
		this.powerConsumption = powerConsumption;
	}

	public abstract String getDeviceType();
	public abstract String performAction();

	public void turnOn() {
		this.isPoweredOn = true;
	}

	public void turnOff() {
		this.isPoweredOn = false;
	}

	public String getStatus() {
		return deviceid + "\n" + getDeviceType() + "\n" + deviceName + "\n" + location + "\n" + isPoweredOn + "\n" + powerConsumption;
	}
}