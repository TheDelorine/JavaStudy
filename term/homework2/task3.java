import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n == 1) {
			System.out.println("1");
		}
		int number_stepen = n;
		for (int i = n; i - 1 > 0; i--) {
			number_stepen = number_stepen * n;
		}
		int result = (n * (number_stepen - 1))/(n - 1);
		if (n == 1) {
			System.out.println("1");
		} else {
			System.out.println(result);
		}
	}
}