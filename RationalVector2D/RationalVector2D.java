public class RationalVector2D {
	private RationalFraction x;
	private RationalFraction y;

	public RationalFraction getX() {
		return x;
	}
	public RationalFraction getY() {
		return y;
	}

	public RationalVector2D() {
		this(RationalFraction(0, 1), RationalFraction(0, 1));
	}
	public RationalVector2D(RationalVector2D x, RationalVector2D y) {
		this.x = x;
		this.y = y;
	}

	public RationalVector2D add(RationalVector2D rational) {
		return new RationalVector2D(this.x.add(rational.getX()), this.y.add(rational.getY()));
	}

	public String toString() {
		return "(" + x.toString() + ";" + y.toString() + ")";
	}
	public double length() {
		return Math.sqrt((x.mult(x)).add(y.mult(y)).value());
	}
	public double scalarProduct(RationalVector2D vector) {
		return (vector.getX().mult(x)).add(vector.getY().mult(y));
	}
	public boolean equals(RationalVector2D vector) {
		boolean flag = true;
		if (x.reduce().equals(vector.getX().reduce()) == false) {
			flag = false;
		}
		if (y.reduce().equals(vector.getY().reduce()) == false) {
			flag = false;
		}
		return flag;
	}
}