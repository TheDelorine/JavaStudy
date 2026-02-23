import java.util.Random;

public class LabUtils {
	public static LaboratoryItem maxBioHazardLevel(LaboratoryItem[] array) {
		int max = 0;
		LaboratoryItem max_item;
		for (LaboratoryItem item : array) {
			if (item.getBioHazardLevel() > max) {
				max = item.getBioHazardLevel();
				max_item = item;
			}
		}
		return max_item;
	}
	public static LaboratoryItem[] randomPeremeshka(LaboratoryItem[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int j = random.nextInt(i + 1);
			LaboratoryItem temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
	public static boolean check(ResearchHub<?> a, ResearchHub<?> b) {
		return a.getStorage().getClass().isInstance(b.getStorage());
	}

	public static void raport(LaboratoryItem[] array) {
		for (LaboratoryItem item : array) {
			System.out.println("[" + item.getClass() + "] ID: " + item.getSessionID() + " | Имя: " + item.getName());
		}
	}
}