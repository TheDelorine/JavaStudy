public class ComplexMatrix2x2 {
	private ComplexNumber matrix2x2[][] = new ComplexNumber[2][2];

	public ComplexMatrix2x2() {
		this(new ComplexNumber(), new ComplexNumber(), new ComplexNumber(), new ComplexNumber());
	}
	public ComplexMatrix2x2(ComplexNumber a) {
		this(a, a, a, a);
	}
	public ComplexMatrix2x2(ComplexNumber a, ComplexNumber b, ComplexNumber c, ComplexNumber d) {
		matrix2x2[0][0] = a;
		matrix2x2[0][1] = b;
		matrix2x2[1][0] = c;
		matrix2x2[1][1] = d;
	}
	public ComplexMatrix2x2 add(ComplexMatrix2x2 matrix) {
		return new ComplexMatrix2x2(matrix2x2[0][0].add(matrix[0][0]), matrix2x2[0][1].add(matrix[0][1]), matrix2x2[1][0].add(matrix[1][0]), matrix2x2[1][1].add(matrix[1][1]));
	}
	public ComplexMatrix2x2 mult(ComplexMatrix2x2 matrix) {
		ComplexMatrix2x2[][] newMatrix = new ComplexMatrix2x2[2][2];
    	for(int i = 0; i<2; i++) {
      		for(int j = 0; j<2; j++) {
        		ComplexNumber  sum = new ComplexNumber();
        		for(int k = 0; k<2; k++) {
          			sum = sum.add(this.matrix2x2[i][k].mult(matrix.matrix2x2[k][j]));
        		}
        		newMatrix[i][j] = sum;
      		}
    	}
    	return new ComplexMatrix2x2(newMatrix[0][0], newMatrix[0][1], newMatrix[1][0], newMatrix[1][1]);
	}
	public ComplexNumber det() {
		return new ComplexNumber(matrix2x2[0][0].mult(matrix.getX()).add(matrix2x2[0][1].mult(matrix.getY())), matrix2x2[1][0].mult(matrix.getX()).add(matrix2x2[1][1].mult(matrix.getY())));
	}
	public ComplexVector2D multVector(ComplexVector2D matrix) {
		return new ComplexVector2D(matrix2x2[0][0].mult(matrix.getX()).add(matrix2x2[0][1].mult(matrix.getY())), matrix2x2[1][0].mult(matrix.getX()).add(matrix2x2[1][1].mult(matrix.getY())));
	}
}