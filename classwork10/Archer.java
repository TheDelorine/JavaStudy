public class Archer extends GameCharacter {
	private double agility;
	private double accuracy;
	private String arrowType;

	public Archer() {
		this(0, 0, "arrowType");
	}
	public Archer(double agility, double accuracy, String arrowType) {
		super();
		this.agility = agility;
		this.accuracy = accuracy;
		this.arrowType = arrowType;
	}

	public int getPower() {
		return agility;
	}

	public String displayInfo() {
		return "Archer";
	}
	public void useSpecialAbility() {
		System.out.println("Производит прицельный выстрел...");
	}
	public void attack() {
		System.out.println("Атакует");
	}
	public void attack(String target, double distance) {
		System.out.println("Атака по цели - " + target + "на расстоянии: " + distance);
	}
}