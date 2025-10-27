import java.util.Scanner;
import java.util.regex.*;

public class task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String html = """
			<div class="product">
			<h3>Телефон</h3>
			<p>Цена: 20000 руб</p>
			</div>
			<div class="product">
			<h3>Ноутбук</h3>
			<p>Цена: 50000 руб</p>
			</div>
		""";
		Pattern pattern = Pattern.compile("<h3>.+?</h3>");
		Matcher matcher = pattern.matcher(html);
		while (matcher.find()) {
			String foundquote = matcher.group();
			System.out.println(foundquote);
		}
	}
}