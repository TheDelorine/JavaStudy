public class SmartLight extends SmartDevice {
	private int brightness;
	private String color;
	private boolean isColorChanging;

	public SmartLight(int brightness, String color, boolean isColorChanging) {
		super();
		this.brightness = brightness;
		this.color = color;
		this.isColorChanging = isColorChanging;
	}


	@Override
	public String getDeviceType() {
		return "Умная Лампа";
	}

	@Override
	public void perfomAction() {
		if (getIsPoweredOn() == true) {
			 ;
			System.out.println("Лампа выключена...");
		} else {
			setIsPoweredOn(true);
			System.out.println("Лампа включена...");
		}
	}

	public void setBrightness(int level) {
		while (level < 0 || level > 100) {
			System.out.println("Error");
			level = scanner.nextInt();
		}
		this.brightness = level;
	}

	public void setBrightness(int level, String color) {
		this.brightness = level;
		this.color = color;
	}

	public void changeColor(String newColor) {
		this.color = newColor;
	}

	public void dimLights() {
		if (brightness >= 10) {
			this.brightness = brightness - 10;
		}
	}
}