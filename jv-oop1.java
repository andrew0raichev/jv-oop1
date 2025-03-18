public class MatrixDiagonal {
  public int[] getDiagonal(int[][] matrix) {
    int n = matrix.length;
    int[] diagonal = new int[n];

    for (int i = 0; i < n; i++) {
      diagonal[i] = matrix[i][i];
    }
    return diagonal;
  }

  public int[] getCounterDiagonal(int[][] matrix) {
    int n = matrix.length;
    int[] counterDiagonal = new int[n];

    for (int i = 0; i < n; i++) {
      counterDiagonal[i] = matrix[i][n - 1 - i];
    }
    return counterDiagonal;
  }
}