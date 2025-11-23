public class Warrior extends GameCharacter {
	private double strength;
	private double armor;
	private String weaponType;

	public Warrior() {
		this(0, 0, "weaponType");
	}
	public Warrior(double strength, double armor, String weaponType) {
		super();
		this.strength = strength;
		this.armor = armor;
		this.weaponType = weaponType;
	}

	public int getPower() {
		return strength;
	}

	public String displayInfo() {
		return "Warrior";
	}

	public void useSpecialAbility() {
		System.out.println("Berserk");
	}

	public void attack() {
		System.out.println("Атака");
	}
	public void attack(String weapon) {
		System.out.println("Атака с помощью " + weapon);
	}
}