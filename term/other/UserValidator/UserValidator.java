import java.util.Scanner;

public class UserValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		boolean flag = false;
		if (str.matches("[А-Я][а-я]+{2,15}") == true) {
			flag = true;
		}
		System.out.println(flag);
	}
}