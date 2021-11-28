public class SquareMatrix extends Matrix {

    private int determinant = 0;

    SquareMatrix (int lines) {
        super(lines, lines);
    }

    int findDeterminant() {
        for(int column = 0; column < columns; column++) {
            int temp = 1;
            for (int i = 0, j = column; i < rows; i++) {
                temp *= matrixArray[i][j];
                j++;
                j %= columns;
            }
            determinant += temp;
        }
        for(int column = 0; column < columns; column ++) {
            int temp = 1;
            for(int i = rows - 1, j = column; i >= 0; i--) {
                temp *= matrixArray[i][j];
                j++;
                j %= columns;
            }
            determinant -= temp;
        }
        return determinant;
    }
}
