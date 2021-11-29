import java.util.Arrays;

public class Matrix {

    int m, n;                   //rows, columns;
    int[][] matrixArray;

    Matrix() {

        this.m = 2;
        this.n = 2;
        this.matrixArray = new int[2][2];
    }

    Matrix(int rows, int columns) {
        this.m = rows;
        this.n = columns;
        this.matrixArray = new int[m][n];
    }

    Matrix(int[][] matrixArray) {
        this.m = matrixArray.length;
        this.n = matrixArray[0].length;
        this.matrixArray = matrixArray;
        System.out.println(this.getClass());
        System.out.println(this.toString());
    }

    void fillArrayMatrix(int[] values) {
        int i = 0;
        try {
            for (int m = 0; m < matrixArray.length; m++) {
                for (int n = 0; n < matrixArray[0].length; n++) {
                    matrixArray[m][n] = values[i++];
                }
            }
        } catch (IndexOutOfBoundsException indEx) {
            System.out.printf("Получено только \s значений. Остальные поля будут заполнены нулями.", i);
        }
    }

    Matrix add(Matrix term) {
        int[][] sum = new int[m][n];
        if (!checkAnotherMatrix(term)) {
            System.out.println("null");
            return null;
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixArray[i][j] + term.matrixArray[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
        return new Matrix(sum);
    }

    Matrix subtract(Matrix term) {
        int[][] difference = new int[m][n];
        if (!checkAnotherMatrix(term)) {
            System.out.println("null");
            return null;
        }
        for (int i = 0; i < difference.length; i++) {
            for (int j = 0; j < difference[0].length; j++) {
                difference[i][j] = matrixArray[i][j] + term.matrixArray[i][j];
            }
        }
        System.out.println(Arrays.deepToString(difference));
        return new Matrix(difference);
    }

    private boolean checkAnotherMatrix(Matrix term) {
        return this.matrixArray.length == term.matrixArray.length
                && this.matrixArray[0].length == term.matrixArray[0].length;
    }

    private boolean checkMultiplicandMatrix(Matrix multiplicand) {
        return this.matrixArray[n] == multiplicand.matrixArray[m];
    }
}
