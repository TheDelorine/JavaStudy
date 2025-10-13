import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите предложение:");
		String line = scanner.nextLine();
		System.out.println("""
			Выберите действие:
			1. Найти подстроку
			2. Заменить подстроку
			3. Разбить строку на слова
			4. Объединить слова в строку
			0. Выход
			""");

		int number = scanner.nextInt();
		scanner.nextLine();
		switch (number) {
		case 1:
			System.out.println("Введите подстроку:");
			String subline = scanner.nextLine();
			int result = findSubstring(line, subline);
			if (result == -1) {
				System.out.println("Такой подстроки нет!");
				break;
			}
			System.out.println(result);
		case 2:
			System.out.println("Введите подстроку, которую хотите заменить:");
			String subline2 = scanner.nextLine();
			System.out.println("Введите подстроку, на которую хотите заменить:");
			String newsubline = scanner.nextLine();
			String result2 = replaceSubstring(line, subline2, newsubline);
			System.out.println(result2);
			break;
		case 3:
			splitWords(line);
			break;
		case 4:
			System.out.println(joinWords(line));
			break;
		case 0:
			System.out.println("Программа завершила свою работу.");
			break;
		}
	}
	public static int findSubstring(String line, String subline) {
		int lenSubline = subline.length();
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == subline.charAt(0) && line.charAt(i + lenSubline - 1) == subline.charAt(lenSubline - 1)) {
				for (int j = 0; j < subline.length(); j++) {
					if (line.charAt(i + j) == subline.charAt(j)) {
						count += 1;
					}
					if (count == lenSubline) {
						return i;
					}
				}
			}
		}
		return -1;
	}

	public static String replaceSubstring(String line, String subline, String newsubline) {
		int lenSubline = subline.length();
		String strokado = "";
		String strokaposle = "";
		String result = "";
		int index = findSubstring(line, subline);
		if (index == -1) {
			return "Такой подстроки не существует!";
		}
		for (int i = 0; i < index; i++) {
			strokado += line.charAt(i);
		}

		for (int i = line.length(); i <= index + lenSubline; i--) {
            strokaposle = line.charAt(i) + strokaposle;
        }

		result = strokado + newsubline + strokaposle;
		return result;
	}

	public static String splitWords(String line) {
		int count = 1;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ' ') {
				count++;
			}
		}
		String[] array = new String[count];

		for (int i = 0; i < count; i++) {
        	array[i] = "";
    	}
		int count2 = 0;

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ' ') {
				count2++;
			} else {
				array[count2] += line.charAt(i);
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		return "";
	}

	public static String joinWords(String line) {
		String result = "";
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ',') {
				result += ' ';
			} else {
				result += line.charAt(i);
			}
		}
		return result;
	}
}