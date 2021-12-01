public class Transponder extends UnaryOperation {

    private Matrix b;

    @Override
    void calculate(boolean isRandom) {
        System.out.println("Матрица A до " + definiteOperation());
        new MatrixPresentation(a).matrixToString();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = a.getMatrixArray()[j][i];
            }
        }
        a = new Matrix(arr);
    }

    void writeReport() {
        System.out.println("Матрица A после " + definiteOperation());
        new MatrixPresentation(a).matrixToString();
    }

    @Override
    String definiteOperation() {
        return "транспонирования";
    }
}
