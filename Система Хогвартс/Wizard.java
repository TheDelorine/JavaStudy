import java.util.Scanner;

public class Wizard {
	private static Scanner scanner = new Scanner(System.in);
	private static int totalWizards = 0;
	private static int totalSpellPower = 0;

	private String name;
	private int mana;
	private int age;
	private int spellPower;

	public Wizard() {
		this("Unknown", 50, 11, 10);
	}
	public Wizard(String name, int mana, int age, int spellPower) {
		setName(name);
		setMana(mana);
		setAge(age);
		setSpellPower(spellPower);
		totalWizards++;
		totalSpellPower += getSpellPower();
	}

	public String getName() {
		return this.name;
	}
	public int getMana() {
		return this.mana;
	}
	public int getAge() {
		return this.age;
	}
	public int getSpellPower() {
		return this.spellPower;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setMana(int mana) {
		while (mana < 0 || this.mana + mana > 100) {
			System.out.println("Invalid Mana Value\nMana: ");
			mana = scanner.nextInt();
		}
		this.mana = mana;
	}
	public void setAge(int age) {
		while (age < 0) {
			System.out.println("Invalid Age Value\nAge: ");
			age = scanner.nextInt();
		}
		this.age = age;
	}
	public void setSpellPower(int spellPower) {
		while (spellPower < 0 || this.spellPower + spellPower > 50) {
			System.out.println("Invalid SpellPower Value\nSpellPower: ");
			spellPower = scanner.nextInt();
		}
		this.spellPower = spellPower;
		totalSpellPower += spellPower;
	}

	public void castSpell(String spellName) {
		boolean flag = true;
		if (this.mana - 10 < 0) {
			this.mana = 0;
			flag = false;
		}
		if (this.spellPower + 5 > 50) {
			this.spellPower = 50;
		}
		if (flag == false) {
			System.out.println(spellName + "\nNo mana! Drink some mint tea, please.");
		}
	}

	public void castSpell() {
		boolean flag = true;
		if (this.mana - 5 < 0) {
			this.mana = 0;
			flag = false;
		}
		if (this.spellPower + 3 > 50) {
			this.spellPower = 50;
		}
		if (flag == false) {
			System.out.println("Lumos" + "\nNo mana! Drink some mint tea, please.");
		}
	}
	public castSpell(String spellName, int power) {
		boolean flag = true;
		if (this.mana - power < 0) {
			this.mana = 0;
			flag = false;
		}
		if (this.spellPower + power > 50) {
			this.spellPower = 50;
		}
		if (flag == false) {
			System.out.println(spellName + "\nNo mana! Drink some mint tea, please.");
		}
	}

	public String displayInfo() {
		String status = "уставший";
		if (mana > 50) {
			status = "готов шалить";
		} else if (mana <= 50 && mana > 20) {
			status = "веселый";
		}
		return name + "\n" + mana + "\n" + age + "\n" + spellPower + "\n" + status;
	}

	public void rechargeMana(int amount) {
		if (amount < 0) {
			return "Ошибка";
		}
		if (this.mana + amount > 100) {
			this.mana = 100;
			return "Мана восстановлена! Заклинания почти вызывают фейерверк!";
		}
	}

	public static void showAcademyStats() {
		return "Общая сила: " + this.spellPower + "\nКоличество волшебников: " + this.totalWizards;
	}
}