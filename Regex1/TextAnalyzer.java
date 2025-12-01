import java.util.regex.*;

public class TextAnalyzer {
	public static void findEmails(String text){
		Pattern pattern = Pattern.compile("[a-zA-Z0-9\\_\\%\\+\\-]+@[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	public static void findDates(String text){
		Pattern pattern = Pattern.compile("(0[1-9]|1[0-9]|2[0-9]|[30]|[31])\\.(0[1-9]|1[0-2])\\.(19|20)[0-9]{2}");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	public static void findCapitalizedWords(String text){
		Pattern pattern = Pattern.compile("[A-Z][a-z]{1,}");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	public static void countDigits(String text){
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println("Общее количество цифр в тексте: " + count);
	}
}