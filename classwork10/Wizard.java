public class Wizard extends GameCharacter {
	private double intelligence;
	private double spellPower;
	private String element;

	public Wizard() {
		this(0, 0, "element");
	}
	public Wizard(double intelligence, double spellPower, String element) {
		super();
		this.intelligence = intelligence;
		this.spellPower = spellPower;
		this.element = element;
	}

	public int getPower() {
		return intelligence;
	}

	public String displayInfo() {
		return "Mage";
	}
	public void useSpecialAbility() {
		System.out.println("Magic Sheet");
	}

	public void castSpell(String spellName) {
		System.out.println(spellName);
	}
	public void meditate() {
		System.out.println("Медитация...");
	}
}