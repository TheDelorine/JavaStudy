public class Triangle {
	private int[] pointOne;
	private int[] pointTwo;
	private int[] pointThree;

	private double sideA;
    private double sideB;
    private double sideC;

	private double max_size = 0;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.pointOne = new int[]{x1, y1};
		this.pointTwo = new int[]{x2, y2};
		this.pointThree = new int[]{x3,y3};

		sideA = calculatingSide(pointOne, pointTwo);
		sideB = calculatingSide(pointTwo, pointThree);
		sideC = calculatingSide(pointThree, pointOne);
	}

	private double sqrt(double a) {
		double quess = a;
		for (int i = 1; i < 5; i++) {
			quess = (quess + a / quess) / 2;
		}
		return quess;
	}

	private double calculatingSide(int[] a, int[] b) {
		double res = sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
		if (max_size < res) {
			max_size = res;
		}
		return res;
	}

	public double getSideA() {
		return sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public double getSideC() {
		return sideC;
	}

	public double perimeter() {
		return sideA + sideB + sideC;
	}

	public double square() {
		double p = perimeter() / 2;
		double res = sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		return res;
	}

	public boolean isRightAngled() {
		if ((sideA * sideA + sideB * sideB + sideC * sideC - max_size * max_size) == max_size * max_size) {
			return true;
		}
		return false;
	}

	public boolean isIsosceles() {
		if (sideA == sideB || sideB == sideC || sideC == sideA) {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Triangle a) {
		if (sideA == a.getSideA() && sideB == a.getSideB() && sideC == a.getSideC()) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "[(" + pointOne[0] + "," + pointOne[1] + "), (" + pointTwo[0] + "," + pointTwo[1] + "), (" + pointThree[0] + "," + pointThree[1] + ")]";
	}
}