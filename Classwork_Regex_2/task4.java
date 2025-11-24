import java.util.Scanner;
import java.util.regex.*;

public class task4 {
	public static void main(String[] args) {
		String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
		Pattern pattern = Pattern.compile("[A-Za-zа-яА-Я0-9,]+;?");
		Matcher matcher = pattern.matcher(csv);
		while (matcher.find()) {
			String foundquote = matcher.group();
			System.out.println(foundquote);
		}
	}
}