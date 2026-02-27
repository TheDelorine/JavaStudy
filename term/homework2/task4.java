import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int number_stepen = 2;
		for (int i = n; i > 0; i--) {
			number_stepen = number_stepen * n;
		}
		int result = number_stepen - 2;
		if (n == 1) {
			System.out.println("2");
		} else {
			System.out.println(result);
		}
	}
}