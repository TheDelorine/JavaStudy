public class ItemStorage<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}

	public void compareWith(T otherValue) {
		if (value.equals(otherValue)) {
			System.out.println("Значения идентичны. Контроль качества пройден");
		}
	}
}