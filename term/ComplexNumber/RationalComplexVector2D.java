public class RationalComplexVector2D {
	private RationalComplexNumber x;
	private RationalComplexNumber y;

	public RationalComplexNumber getX() {
		return x;
	}
	public RationalComplexNumber getY() {
		return y;
	}

	public RationalComplexVector2D() {
		this(new RationalComplexNumber(), new RationalComplexNumber());
	}
	public RationalComplexVector2D(RationalComplexNumber x, RationalComplexNumber y) {
		this.x = x;
		this.y = y;
	}

	public RationalComplexVector2D add(RationalComplexVector2D vector) {
		return new RationalComplexVector2D(x.add(vector.getX()), y.add(vector.getY()));
	}

	public String toString() {
		return "(" + x.toString() + ";" + y.toString() + ")";
	}
	public RationalComplexNumber scalarProduct(RationalComplexVector2D vector) {
		return x.mult(vector.getX()).add(y.mult(vector.getY()));
	}
}
