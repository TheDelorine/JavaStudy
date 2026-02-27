public class Matrix2x2 {
  
  protected double[][] arr;
  
  public Matrix2x2() {
    this(0.0);
  }
  
  public Matrix2x2(double a) {
    this(a, a, a, a);
  }
  
  public Matrix2x2(double[][] arr) {
    setArr(arr);
  }
  
  public Matrix2x2(double a, double b, double c, double d) {
    this.arr = new double[2][2];
    arr[0][0] = a;
    arr[0][1] = b;
    arr[1][0] = c;
    arr[1][1] = d;
  }
  
  public Matrix2x2 add(Matrix2x2 newArr) {
    Matrix2x2 res = new Matrix2x2();
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        res.arr[i][j] = this.arr[i][j] + newArr.arr[i][j];
      }
    }
    return res;
  }
  
  public void add2(Matrix2x2 newArr) {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        this.arr[i][j] += newArr.arr[i][j];
      }
    }
  }
  
  public Matrix2x2 sub(Matrix2x2 newArr) {
    Matrix2x2 res = new Matrix2x2();
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        res.arr[i][j] = this.arr[i][j] - newArr.arr[i][j];
      }
    }
    return res;
  }
  
  public void sub2(Matrix2x2 newArr) {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        this.arr[i][j] -= newArr.arr[i][j];
      }
    }
  }
  
  public Matrix2x2 multNumber(double c) {
    Matrix2x2 res = new Matrix2x2(getArr());
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        res.arr[i][j] *= c;
      }
    }
    return res;
  }
  
  public void multNumber2(double c) {
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        this.arr[i][j] *= c;
      }
    }
  }
  
  public Matrix2x2 mult(Matrix2x2 newArr) {
    Matrix2x2 res = new Matrix2x2(getArr());
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        res.arr[i][j] = 0;
        for (int k = 0; k < 2; k++) {
          res.arr[i][j] += this.arr[i][k] * newArr.arr[k][j];
        }
      }
    }
    return res;
  }
  
  public void mult2(Matrix2x2 newArr) {
    double[][] res = new double[2][2];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        res[i][j] = 0;
        for (int k = 0; k < 2; k++) {
          res[i][j] += this.arr[i][k] * newArr.arr[k][j];
        }
      }
    }
    this.arr = res;
  }
  
  public double det() {
    return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
  }
  
  public void transpon() {
    double res = arr[0][1];
    arr[0][1] = arr[1][0];
    arr[1][0] = res;
  }
  
  public Matrix2x2 inverseMatrix() {
    Matrix2x2 res = new Matrix2x2(arr[1][1], arr[1][0], arr[0][1], arr[0][0]);
    return res.multNumber(1/det());
  }
  
  public Matrix2x2 equivalentDiagonal() {
    return new Matrix2x2(Math.pow(det()), 0, 0, Math.pow(det()));
  }
  
  public Vector2D multVector(Vector2D vector) {
    double x = arr[0][0] * vector.getCoord1() + arr[0][1] * arr.getCoord2();
    double y = arr[1][0] * vector.getCoord1() + arr[1][1] * vector.getCoord2();
    return new Vector2D(x,y);
  }
  
  public void setArr(double[][] arr) {
    this.arr = arr;
  }
  
  public void arr(double a, double b, double c, double d) {
    arr = new arr[][]{{a, b}, {c, d}};
  }
  
  public double[][] getArr() {
    return arr;
  }
}