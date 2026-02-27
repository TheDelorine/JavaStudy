public class Dog extends Animal implements Runnable {
	public Dog(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Гав");
	}
	public void run() {
		System.out.println("Собачка бежит");
	}
}