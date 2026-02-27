import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputOne = input.nextLine();
		// String inputOne = "А роза упала на лапу Азора";
		int count = 0;
		
		for (int i = 0; i < inputOne.length(); i++) {
			if (inputOne.charAt(i) == ' ' || inputOne.charAt(i) == ',' || inputOne.charAt(i) == '!' || inputOne.charAt(i) == '.' || inputOne.charAt(i) == ':' || inputOne.charAt(i) == ';'  || inputOne.charAt(i) == '?') {
				continue;
			}
			count += 1;
		}
		
		char[] array = new char[count];
		char[] array_reverse = new char[count];

		int arrayIndex = 0;
		for (int i = 0; i < inputOne.length(); i++) {
			if (inputOne.charAt(i) == ' ' || inputOne.charAt(i) == ',' || inputOne.charAt(i) == '!' || inputOne.charAt(i) == '.' || inputOne.charAt(i) == ':' || inputOne.charAt(i) == ';'  || inputOne.charAt(i) == '?') {
				continue;
			}
			char number = inputOne.charAt(i);
			int number_desat = (int)(number);
			if ((int)number > 1071) {
				number_desat -= 32;
			}
			char character = (char) number_desat;
			array[arrayIndex] = character;
			arrayIndex++;
		}

		boolean flag = true;
		arrayIndex = 0;
		for (int i = inputOne.length() - 1; i >= 0; i--) {
			if (inputOne.charAt(i) == ' ' || inputOne.charAt(i) == ',' || inputOne.charAt(i) == '!' || inputOne.charAt(i) == '.' || inputOne.charAt(i) == ':' || inputOne.charAt(i) == ';'  || inputOne.charAt(i) == '?') {
				continue;
			}
			char number = inputOne.charAt(i);
			int number_desat = (int)(number);
			if ((int)number > 1071) {
				number_desat -= 32;
			}
			char character = (char) number_desat;
			array_reverse[arrayIndex] = character;
			if (array[arrayIndex] != array_reverse[arrayIndex]) {
				flag = false;
				break;
			}
			arrayIndex++;
		}
		System.out.println(flag);
	}
}