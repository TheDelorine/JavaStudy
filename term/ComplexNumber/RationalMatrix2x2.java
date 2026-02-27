public class RationalMatrix2x2 {
	private RationalFraction[][] matrix2x2 = RationalFraction[2][2];

	public RationalMatrix2x2() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix2x2[i][j] = new RationalFraction();
			}
		}
	}

	public RationalMatrix2x2(RationalFration rational) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix2x2[i][j] = rational;
			}
		}
	}

	public RationalMatrix2x2(RationalFraсtion a, RationalFraсtion b, RationalFraсtion c, RationalFraсtiond d) {
		matrix2x2[0][0] = a;
		matrix2x2[0][1] = b;
		matrix2x2[1][0] = c;
		matrix2x2[1][1] = d;
	}
	public RationalMatrix2x2 add(RationalMatrix2x2 matrix) {
		RationalMatrix2x2[][] newMatrix = new RationalMatrix2x2[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				newMatrix[i][j] = matrix2x2[i][j].add(matrix[i][j]);
			}
		}
		return newMatrix;
	}

	public RationalMatrix2x2 mult(RationalMatrix2x2 matrix) {
		RationalFraction [][] newMatrix = new RationalFraction [2][2];
    	for(int i = 0; i<2; i++) {
      		for(int j = 0; j<2; j++) {
        		RationalFraction  sum = new RationalFraction();
        		for(int k = 0; k<2; k++) {
          			sum = sum.add(this.matrix2x2[i][k].mult(matrix.matrix2x2[k][j]));
        		}
        		newMatrix[i][j] = sum;
      		}
    	}
    	return new RationalMatrix2x2(newMatrix[0][0], newMatrix[0][1], newMatrix[1][0], newMatrix[1][1]);
  	}

	public RationalFraсtion det() {
		RationalFraction res;
		res = (matrix2x2[0][0].mult(matrix2x2[1][1])).sub(matrix2x2[0][1].mult(matrix2x2[1][0]));
		return res;
	}
	public RationalVector2D multVector(RationalVector2D matrix) {
		return new RationalVector2D(matrix2x2[0][0].mult(matrix.getX()).add(matrix2x2[0][1].mult(matrix.getY())), matrix2x2[1][0].mult(matrix.getX()).add(matrix2x2[1][1].mult(matrix.getY())));

	}
}