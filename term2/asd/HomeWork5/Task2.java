public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 6};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i+1]) {
                System.out.println(array[i] + 1);
            }
        }
    }
}