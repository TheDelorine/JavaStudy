public class SmartThermostat extends SmartDevice {
	private double currentTemperature;
	private double targetTemperature;
	private String mode;

	public SmartThermostat(double currentTemperature, double targetTemperature, String mode) {
		super();
		this.currentTemperature = currentTemperature;
		this.targetTemperature = targetTemperature;
		this.mode = mode;
	}

	@Override
	public String getDeviceType() {
		return "Умный термостат";
	}

	@Override
	public String performAction() {
    	if (currentTemperature < targetTemperature) {
        	if ("обогрев".equals(mode)) {
            	currentTemperature += 2;
            	return "Обогрев: температура повышается до " + targetTemperature + "°C";
        	}
    	} else if (currentTemperature > targetTemperature) {
        	if ("охлаждение".equals(mode)) {
            	currentTemperature -= 2;
            	return "Охлаждение: температура понижается до " + targetTemperature + "°C";
        	}
    	}
    	return "Температура достигла целевой: " + targetTemperature + "°C";
	}

	public void setTemperature(double temp) {
		targetTemperature = temp;
	}

	public void setTemperature(double temp, String mode) {
		while (mode.equals("обогрев") == false && mode.equals("охлождение") == false) {
			System.out.println("Error");
			mode = scanner.nextLine();
		}
		targetTemperature = temp;
		this.mode = mode;
	}

	public String getEnergyReport() {
		return "Отчет по энергии " + getPowerConsumption();
	}

	public void scheduleTemperature(double temp, int hour) {
		String result = "На " + hour + " запланирована температура: " + temp + ".";
		System.out.println(result);
	}
}