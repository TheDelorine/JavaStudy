public class ResearchHub<S extends LaboratoryItem> {
	private int k = 2;
	private S[] storage = (S[]) new LaboratoryItem[k];
	private int count = 0;

	public void register(S item) {
		if (count + 1 == k) {
			int z = k;
			k *= 2;
			S[] newArray = (S[]) new LaboratoryItem[k];
			for (int i = 0; i < z; i++) {
				newArray[i] = storage[i]; 
			}
			storage = newArray;
		}
		storage[count] = item;
		count++;
	}
	public void release(int index) {
		S[] newArray = (S[]) new LaboratoryItem[k];
		for (int i = 0; i < index; i++) {
			newArray[i] = storage[i];
		}
		for (int i = index + 1; i < count; i++) {
			newArray[i] = storage[i];
		}
		storage = newArray;
		count--;
	}
	public int indexOf(S item) {
		for (int i = 0; i < count; i ++) {
			if (storage[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public void clearByHazardLevel(int limit) {
		for (int i = 0; i < count; i++) {
			if (storage[i].getBioHazardLevel() > limit) {
				release(i);
			}
		}
	}

	public void adjustPurity(Number offset, Number multiplier) {
		for (S item : storage) {
			if (item != null && item instanceof ResearchSample) {
				item.setPurity((item.getPurity() * offset.doubleValue()) * multiplier.doubleValue());
			}
		}
	}

	public double getAveragePurity() {
		double res = 0;
		for (S item: storage) {
			if (item != null && item instanceof ResearchSample) {
				res += item.getPurity();
			}
		}
		return res/count;
	}

	public boolean checkSession(S item, Integer sessionID) {
		int res = sessionID;
		if (item.getSessionID() == res) {
			return true;
		}
		return false;
	}
	public S[] getStorage() {
		return storage;
	}
}