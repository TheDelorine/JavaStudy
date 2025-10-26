import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int res = 0;
		for (int k = 1; k <= n; k++) {
			res += stepen(-1, k) * (k * stepen(x, (k + 2)))/(factorial(k+1));
		}
		System.out.println(res);
	}

	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		}
		int res = 1;
		for (int i = 1; i <= a; i++) {
			res *= i;
		}
		return res;
	}
	public static int stepen(int a, int b) {
		int res = a;
		for (int i = 1; i < b; i++) {
			res *= a;
		}
		return res;
	}
}