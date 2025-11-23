import java.util.regex.*;
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		int count_slov = 1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				count_slov++;
			}
		}

		String[] array = new String[count_slov];
		int array_index = 0;
		int left = 0;
		for (int i = 0; i <= text.length(); i++) {
			String slovo = "";
			if (i == text.length() || text.charAt(i) == ' ') {
				for (int j = left; j < i; j++) {
					slovo += text.charAt(j);
				}
				array[array_index] = slovo;
				array_index++;
				left = i + 1;
			}
		}
		int unical_slov = 0;
		for (int i = 0; i < count_slov; i++) {
			int count_slova = 0;
			for (int j = 0; j < count_slov; j++) {
				if (array[i] == array[j]) {
					count_slova++;
					if (count_slova == 2) {
						break;
					}
				} 
			}
			if (count_slova == 1) {
				unical_slov++;
			}
		}
		int max_len = 0;
		String max_len_slovo = "";
		for (int i = 0; i < count_slov; i++) {
			if (i == 0) {
				max_len = array[i].length();
				max_len_slovo = array[i];
				continue;
			}
			if (max_len < array[i].length()) {
				max_len = array[i].length();
				max_len_slovo = array[i];
			}
		}
		System.out.print("Общее количество слов: " + count_slov + ". Количество уникальных слов: " + unical_slov + ". Саммое длинное слово: " + max_len_slovo);
	}
}