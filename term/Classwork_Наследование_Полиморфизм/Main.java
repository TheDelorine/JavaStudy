public class Main {
	public static void main(String[] args){
		Animal animal1 = new Dog("шарик", 18, "корги");
		Animal[] zoo = {
			animal1,
			new Cat("маркиза", 15, 0),
			new Bird("максим", 2, true)
		};
		for (int i = 0; i < zoo.length; i++){
			if (zoo[i] instanceof Cat){
				Cat cat1 = (Cat) zoo[i];
				cat1.climbTree();
			} else if (zoo[i] instanceof Dog){
				Dog dog1 = (Dog) zoo[i];
				System.out.println(dog1.getBreed());
			} else if (zoo[i] instanceof Bird){
				Bird bird1 = (Bird) zoo[i];
				bird1.makeSound();
			}
		}
	}
}