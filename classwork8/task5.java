import java.util.Scanner;
import java.util.regex.*;

public class task5 {
	public static void main(String[] args) {
		String post = "Сегодня был в #парке и #кино #отдых #выходные";
		Pattern pattern = Pattern.compile("#[A-Za-zа-яА-Я0-9,]+");
		Matcher matcher = pattern.matcher(post);
		while (matcher.find()) {
			String foundquote = matcher.group();
			System.out.println(foundquote);
		}
	}
}