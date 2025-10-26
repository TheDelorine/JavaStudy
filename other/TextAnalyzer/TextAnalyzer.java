import java.util.Scanner;

public class TextAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String line = "";
		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ',') {
				if (i == input.length() - 1 && input.charAt(i) == '.') {
					break;
				} 
				line += input.charAt(i);
			}
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		String[] array = new String[count];
		int index_array = 0;
		int left = 0;
		for (int i = 0; i <= line.length(); i++) {
			String slovo = "";
			if (i == line.length() || line.charAt(i) == ' ') {
				for (int lt = left; lt < i; lt++) {
					slovo += line.charAt(lt);
				}
				array[index_array] = slovo;
				index_array++;
				left = i + 1;
			}
		}
		findEmails(array, count);
		findDates(array, count);
		findCapitalizedWords(array, count);
		countDigits(line);
	}
	public static void findEmails(String[] text, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (text[i].matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.—]+[a-zA-Z]{2,}")) {
				if (count == 0) {
					System.out.println("Email-адреса:");
				}
				count++;
				System.out.println(count + ". " + text[i]);
			}
		}
	}
	public static void findDates(String[] text, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (text[i].matches("(([1-9])|([1-2][0-9])|([3][0-1]))[.]([1-9]|[1][0-2])[.](([1][9][0-9][0-9])|([2][0][0-9][0-9]))")) {
				if (count == 0) {
					System.out.println("Даты:");
				}
				count++;
				System.out.println(count + ". " + text[i]);
			}
		}
	}
	public static void findCapitalizedWords(String[] text, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (text[i].matches("[A-Z][a-z]*|[А-Я][а-я]*|[A-Z][a-z]*[—][a-z]*|[А-Я][а-я]*[—][а-я]*")) {
				if (count == 0) {
					System.out.println("Слова с заглавной буквы:");
				}
				count++;
				System.out.println(count + ". " + text[i]);
			}
		}
	}
	public static void countDigits(String text) {
		int res = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
    			res++;
			}
		}
		System.out.println("Общее количество цифр: " + res);
	}
}