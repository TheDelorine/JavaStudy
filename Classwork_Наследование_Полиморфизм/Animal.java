public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void eat(){
		System.out.println(name + " кушает...");
	}
	
	public void sleep(){
		System.out.println(name + " спит...");
	}
	
	public void makeSound(){
		System.out.println(name + " издает звук...");
	}
	
	public String getName(){
		return name;
	}
}