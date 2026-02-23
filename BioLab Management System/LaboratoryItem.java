public abstract class LaboratoryItem {
	private String serialNumber;
	private int biohazardLevel;
	private Integer sessionID;

	public int getSessionID() {
		if (sessionID != null) {
			int res = sessionID;
			return res;
		}
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public int getBioHazardLevel() {
		return biohazardLevel;
	}

	public boolean equals(LaboratoryItem item) {
		if (serialNumber.equals(item.getSerialNumber())) {
			return true;
		}
		return false;
	}
	public abstract String getName();
}