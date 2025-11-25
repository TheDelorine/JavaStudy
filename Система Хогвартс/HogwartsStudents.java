import java.util.Scanner;
public class HogwartsStudents extends Wizard {
	public static Scanner scanner = new Scanner(System.in);

	private String house;
	private int mishiefLevel;

	public HogwartsStudents(String name, int mana, int age, int spellPower, String house, int mishiefLevel) {
		super(name, mana, age, spellPower);
		this.house = setHouse(house);
		setMishiefLevel(mishiefLevel);

	}

	public String getHouse() {
		return house;
	}

	public int mishiefLevel() {
		return mishiefLevel;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public void setMishiefLevel(int mishiefLevel) {
		while (mishiefLevel < 0) {
			System.out.println("Invalid Value");
			mishiefLevel = scanner.nextInt();
		}
		this.mishiefLevel = mishiefLevel;
	}

	public void prank() {
		if (mana < 1) {
			return "Недостаточно маны";
		}
		mana--;
		if (mana < 100 ) {
			mishiefLevel++;
		}
		return "Гарри положил слизеринскому студенту лягушку в учебник!";
	}
}