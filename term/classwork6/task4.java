import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String dopline = "";
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'e' || line.charAt(i) == 'y' || line.charAt(i) == 'u' || line.charAt(i) == 'i' || line.charAt(i) == 'o' ||line.charAt(i) == 'a') {
				continue;
			}
			dopline += line.charAt(i);
		}
		boolean flag = true;
		for (int i = 0; i < dopline.length() - 1; i++) {
			if ((int)(dopline.charAt(i)) > (int)(dopline.charAt(i + 1))) {
				System.out.println("False");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(flag);
		}
	}
}