import java.util.Scanner;
public class Professor {
	public static Scanner scanner = new Scanner(System.in);

	private String subject;

	public Professor(String name, int mana, int age, int spellPower, String subject) {
		super(name, mana, age, spellPower);
		setSubject(subject);
	}

	public String subject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void teach() {
		if (mana < 5) {
			System.out.println("Недостаточно маны");
			return;
		}
		mana -= 5;
		System.out.println("Профессор учит!");
	}

	public void castOnStudent(HogwartStudens student, String spellName) {
		student.setMana(student.getMana() - spellPower);
		student.setSpellPower(student.getMana() + spellPower/2);
	}
}