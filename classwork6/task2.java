import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		float res = 0;
		for (int k = 0; k <= n; k++) {
			res += (float)(stepen(x, 3 * k - 1))/(float)(factorial(2 * k) + k);
		}
		System.out.println(res);
	}

	public static int factorial(int k) {
		if (k == 0) {
			return 1;
		}
		int res = 1;
		for (int i = 1; i <= k; i++) {
			res *= i;
		}
		return res;
	}

	public static int stepen(int k, int s) {
		if (s == 0) {
			return 1;
		}
		if (s == 1) {
			return k;
		}
		int res = k;
		for (int i = 1; i < s; i++) {
			res *= k;
		}
		return res;
	}
}