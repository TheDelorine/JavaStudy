public class ResearchSample<T extends Number> extends LaboratoryItem {
	private String materialName;
	private T purity;

	public double getPurity() {
		if (purity != null) {
			double res = purity.doubleValue();
			return res;
		}
	}
	public void setPurity(T purity) {
		this.purity = purity;
	}

	public String getName() {
		return materialName;
	}
}