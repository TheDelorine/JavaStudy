public class Main {
	public static void main(String[] args) {
		// Сценарий А:
		ItemStorage<Integer> a1 = new ItemStorage<>();
		a1.setValue(100); // Кэширование, следовательно a1(100) сравнение 100 это один и тот же объект при сравнении == будет выводить true и при .equals тоже true
		a1.compareWith(100);
		// Сценарий Б:
		ItemStorage<Integer> b1 = new ItemStorage<>(); // Тут уже кэширование нет, поэтому значения больше чем 127, являются отдельными объектами, при .equals будет true, при == false
		b1.setValue(200);
		b1.compareWith(200);
		// Сценарий В:
		ItemStorage<RationalFraction> c1 = new ItemStorage<>(); // Я не понимаю, почему он не чего не выводит.
		ItemStorage<RationalFraction> c2 = new ItemStorage<>();
		c1.setValue(new RationalFraction(1, 2));
		c2.setValue(new RationalFraction(1, 2));
		c1.compareWith(c2.getValue());
	}
}