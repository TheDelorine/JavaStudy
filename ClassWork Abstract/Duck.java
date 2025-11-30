public class Duck extends Animal implements Runnable, Swimmable {
	public Duck(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Кря");
	}
	public void run() {
		System.out.println("Уточка бежит");
	}
	public void swim() {
		System.out.println("Уточка плывет");
	}
}