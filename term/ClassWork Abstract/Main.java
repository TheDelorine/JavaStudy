import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Сигма", 11);
		Fish fish1 = new Fish("Сягма", 12);
		Duck duck1 = new Duck("Сугма", 10);

		dog1.makeSound();
		dog1.sleep();
		dog1.run();

		fish1.makeSound();
		fish1.sleep();
		fish1.swim();

		duck1.makeSound();
		duck1.sleep();
		duck1.run();
		duck1.swim();
		System.out.println(duck1.getMaxSpeed());
		System.out.println(dog1.getMaxSpeed());
	}
}