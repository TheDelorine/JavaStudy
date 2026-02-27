public class Fish extends Animal implements Swimmable {
	public Fish(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("...");
	}
	public void swim() {
		System.out.println("Рыбка плывет");
	}
}