import java.util.Scanner;

public abstract class GameCharacter {
	public static Scanner scanner = new Scanner(System.in);

	private static int totalCharacters = 0;
	private final int max_level = 100;

	private String name;
	private int level;
	private double health;
	private double mana;
	private boolean isAlive;

	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public double getHealth() {
		return health;
	}
	public double getMana() {
		return mana;
	}
	public boolean getIsAlive() {
		return isAlive;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public GameCharacter() {
		this("Name", 0, 0, 0, false);
	}

	public GameCharacter(String name, int level, double health, double mana, boolean isAlive) {
		this.name = name;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.isAlive = isAlive;
		totalCharacters++;
	}

	public static int getTotalCharacters() {
		return totalCharacters;
	}

	public abstract String displayInfo();

	public abstract void useSpecialAbility();

	public abstract int getPower();

	public void attack() {
		System.out.println("Атакует");
	}
	public void takeDamage(double damage) {
		while (damage <= 0 || health - damage < 0) {
			System.out.println("Error");
			damage = scanner.nextDouble();
		}
		this.health = health - damage;
	}
	public void heal(double amount) {
		while (amount < 0 || health + amount > 100) {
			System.out.println("Error");
			amount = scanner.nextDouble();
		}
		this.health = health + amount;
	}
}