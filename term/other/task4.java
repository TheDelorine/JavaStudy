import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String n = perevod(a);
		boolean flag = true;
		for (int i = 0; i<n.length() - 1; i++) {
			if (n.charAt(i) == 'e' || n.charAt(i) == 'y' || n.charAt(i) == 'u' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'a') {
				if (n.charAt(i + 1) == 'e' || n.charAt(i + 1) == 'y' || n.charAt(i + 1) == 'u' || n.charAt(i + 1) == 'i' || n.charAt(i + 1) == 'o' || n.charAt(i + 1) == 'a') {
					System.out.println("False");
					flag = false;
					break;
				}
			}
		}
		if (flag == true) {
			System.out.println(flag);
		}
	}
	public static String perevod(String a) {
		String res = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < 91) {
				res += (char)(a.charAt(i) + 32);
			}
		}
		return res;
	}
}