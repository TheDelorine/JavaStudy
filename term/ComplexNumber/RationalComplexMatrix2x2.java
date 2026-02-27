public class RationalComplexMatrix2x2 {
	private RationalComplexNumber[][] matrix2x2 = new RationalComplexNumber[2][2];

	public RationalComplexMatrix2x2() {
		this(new RationalComplexNumber(), new RationalComplexNumber(), new RationalComplexNumber(), new RationalComplexNumber());
	}
	public RationalComplexMatrix2x2(RationalComplexNumber a) {
		this(a, a, a, a);
	}

	public RationalComplexMatrix2x2(RationalComplexNumber a, RationalComplexNumber b, RationalComplexNumber c, RationalComplexNumber d) {
		matrix2x2[0][0] = a;
		matrix2x2[0][1] = b;
		matrix2x2[1][0] = c;
		matrix2x2[1][1] = d;
	}
	public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 matrix) {
		RationalComplexMatrix2x2[][] newMatrix = new RationalComplexMatrix2x2[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				newMatrix[i][j] = matrix2x2[i][j];
			}
		}
		return newMatrix;
	}
	public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 matrix) {
		RationalComplexMatrix2x2[][] newMatrix = new ComplexMatrix2x2[2][2];
    	for(int i = 0; i<2; i++) {
      		for(int j = 0; j<2; j++) {
        		RationalComplexNumber  sum = new RationalComplexNumber();
        		for(int k = 0; k<2; k++) {
          			sum = sum.add(this.matrix2x2[i][k].mult(matrix.matrix2x2[k][j]));
        		}
        		newMatrix[i][j] = sum;
      		}
    	}
    	return new RationalComplexMatrix2x2(newMatrix[0][0], newMatrix[0][1], newMatrix[1][0], newMatrix[1][1]);
	}
	public RationalComplexNumber det() {
		return new RationalComplexNumber(matrix2x2[0][0].mult(matrix2x2[1][1]).sub(matrix2x2[0][1].mult(matrix2x2[1][0])));
	}
	public RationalComplexVector2D multVector(RationalComplexVector2D vector) {
		return new RationalComplexVector2D(matrix2x2[0][0].mult(vector.getX()).add(matrix2x2[0][1].mult(vector.getY())), matrix2x2[1][0].mult(vector.getX()).add(matrix2x2[1][1].mult(vector.getY())));
	}
}