public class SmartHome {
	private String homeName;
	private SmartDevice[] devicelist;
	private int deviceCount = 0;

	public SmartHome(String homeName) {
		super()
		this.homeName = homeName;
	}

	public void addDevice(SmartDevice device) {
		SmartDevice[] newArray = new SmartDevice[deviceCount + 1];
		for (int i = 0; i < deviceCount; i++) {
			newArray[i] = devicelist[i];
		}

		newArray[deviceCount] = device;
		devicelist = newArray;
		deviceCount++;
	}

	public void removeDevice(String deviceid) {
		int index = 0;
		for (int i = 0; i < deviceCount; i++) {
			if (deviceid.equals(devicelist[i].getDeviceId())) {
				index = i;
			}
		}
		for (int i = index; i < deviceCount - 1; i++) {
			devicelist[i] = devicelist[i + 1]; 
		}

		devicelist[deviceCount] = null;
		deviceCount--;
	}

	public void turnOnAllDevices() {
		for (SmartDevice device : devicelist) {
			device.turnOn();
		}
	}

	public void turnOffAllDevices() {
		for (SmartDevice device : devicelist) {
			device.turnOff();
		}
	}

	public SmartDevice getDevicesByType(String type) {
		for (SmartDevice device : devicelist) {
			if (device.getDeviceType() == type) {
				return device;
			}
		}
	}

	public double calculateTotalPowerConsumption() {
		double result = 0;
		for (SmartDevice device : devicelist) {
			result += device.getPowerConsumption();
		}
		return result;
	}

	public void getDeviceStatus(String deviceId) {
		for (SmartDevice device : devicelist) {
			if (device.getDeviceId().equals(deviceid)) {
				device.getStatus();
			}
		}
	}
}