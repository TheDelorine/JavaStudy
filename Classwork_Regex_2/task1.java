import java.util.regex.*;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String text = scanner.nextLine();
		String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
		Pattern pattern = Pattern.compile("\".+?\"");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String foundquote = matcher.group();
			System.out.println(foundquote);
		}
	}
}