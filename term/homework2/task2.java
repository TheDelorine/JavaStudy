public class task2 {
	public static void main(String[] args) {
		int m = 10;
		int z = 11;
		for (int i = 2; i<m; i++) {
			for (int j = 1; j < z; j++) {
				int a = j * i;
				if (j == 10 & i == 10) {

				} else {
					System.out.println(i + "*" + j + "=" + a);
				}
				if (j == 10) {
					System.out.println("");
				}
			}
		}
	}
}