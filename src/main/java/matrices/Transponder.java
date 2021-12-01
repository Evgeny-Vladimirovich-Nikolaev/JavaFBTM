public class Transponder extends UnaryOperation{

    private Matrix b;

    @Override
    void calculate(boolean isRandom) {
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = a.getMatrixArray()[j][i];
            }
        }
        b = new Matrix(arr);
        new MatrixPresentation(a).matrixToString();
        new MatrixPresentation(b).matrixToString();
    }

    @Override
    String definiteOperation() {
        return "транспонирования";
    }
}
