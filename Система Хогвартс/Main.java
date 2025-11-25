import java.util.Scanner;

public class Main {
	public void Main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Wizard[] hogwarts = {
			Professor professor1 = new Professor("Гаджет", 10, 10, 10, "Математика");
			HogwartsStudents student1 = new HogwartsStudents("Боб", 10, 10, 10, "Общага", 10);
			MagicalCreatureType elf1 = new MagicalCreatureType("Саня", 10, 10, 10, "Эльф");
			System.out.println(student.displayInfo());
			System.out.println(student.castSpell());
		};
		int min_mana = 100;
		int max_mishiefLevel = 0;
		HogwartsStudents min_mana_student;
		HogwartsStudents max_MishiefLevel_Student
		for (HogwartsStudents student : hogwarts) {
			System.out.println(student1.displayInfo());
			System.out.println(student1.castSpell());
			if (student instanceof MagicalCreatureType) {
				student.speccialAbility();
			}
			if (student instanceof HogwartsStudents) {
				if (min_mana > student.getMana()) {
					min_mana = student.getMana();
					min_mana_student = student;
				}
				if (max_mishiefLevel < student.getMishiefLevel()) {
					max_mishiefLevel = student.getMishiefLevel();
					max_MishiefLevel_Student = student;
				}
			}
		}
		min_mana_student.rechargeMana(100);
		max_MishiefLevel_Student.prunk();
		System.out.println(Wizard.showAcademyStats());
	}
}