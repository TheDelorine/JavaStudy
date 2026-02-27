import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n == reverse(n)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static int reverse(int a) {
		int len_a = len(a);
		int res = 0;
		for (int i = 0; i < len_a; i++) {
			res += (a % 10) * degree_ten(len(a) - i - 1);
			a = a / 10;
		}
		return res;
	} 

	public static int len(int a) {
		int len = 0;
		while (a > 0) {
			len++;
			a = a / 10;
		}
		return len;
	}

	public static int degree_ten(int a) {
		int sum = 1;
		for (int i = 0; i < a; i++) {
			sum = sum*10;
		}
		return sum;
	}
}