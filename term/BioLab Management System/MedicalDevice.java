public class MedicalDevice extends LaboratoryItem {
	private String deviceName;
	private double precision;

	public String getName() {
		if (deviceName != null) {
			return deviceName;
		}
	}
}