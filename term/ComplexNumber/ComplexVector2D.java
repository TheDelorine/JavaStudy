public class ComplexVector2D {
	private ComplexNumber x;
	private ComplexNumber y;

	public ComplexVector2D() {
		this(new ComplexNumber(0, 0), new ComplexNumber(0, 0));
	}

	public ComplexVector2D(ComplexNumber x, ComplexNumber y) {
		this.x = x;
		this.y = y;
	}

	public ComplexVector2D add(ComplexVector2D vector) {
		return new ComplexVector2D(x.add(vector.getX()), y.add(vector.getY()));
	}

	public String toString() {
		return "(" + x.toString() + ";" + y.toString() + ")";
	}

	public ComplexNumber scalarProduct(ComplexVector2D vector) {
		return x.mult(vector.getX()).add(y.mult(vector.getY()));
	}
	public boolean equals(ComplexVector2D vector) {
		if (vector.getX().equals(x) && vector.getY().equals(y)) {
			return true;
		}
		return false;
	}
}