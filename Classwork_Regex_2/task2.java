import java.util.Scanner;
import java.util.regex.*;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String logs = """
			[ERROR] 2024-01-15: Connection failed
			[INFO] 2024-01-15: User logged in
			[DEBUG] 2024-01-15: Processing request
			[ERROR] 2024-01-15: Database timeout
		""";
		Pattern pattern = Pattern.compile("\\[ERROR\\].+");
		Matcher matcher = pattern.matcher(logs);
		while (matcher.find()) {
			String foundquote = matcher.group();
			System.out.println(foundquote);
		}
	}
}