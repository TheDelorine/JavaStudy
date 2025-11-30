import java.util.Scanner;

public abstract class Animal {
	public static Scanner scanner = new Scanner(System.in);
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sleep() {
		System.out.println("Типо спит...");
	}

	public abstract void makeSound();
}