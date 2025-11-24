public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("Книга", "Автор", 2025, true, 300);
		Book book2 = new Book("Книга", "Автор", 2025, true, 300);
		book1.borrowBook("ГойдаГойдович");
		String result = book1.displayInfo(true);
		System.out.println(result);
	}
}