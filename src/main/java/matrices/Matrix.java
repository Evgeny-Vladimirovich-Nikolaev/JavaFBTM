public class Matrix {
    int m, n;                   //rows, columns;
    private int[][] matrixArray;

    Matrix(int rows, int columns) {
        this.m = rows;
        this.n = columns;
        this.matrixArray = new int[m][n];
    }

    Matrix(int[][] matrixArray) {
        this.m = matrixArray.length;
        this.n = matrixArray[0].length;
        this.matrixArray = matrixArray;
    }

    int[][] getMatrixArray() {
        return this.matrixArray;
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
                sum[i][j] = this.matrixArray[i][j] + term.matrixArray[i][j];
            }
        }
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
                difference[i][j] = this.matrixArray[i][j] - term.matrixArray[i][j];
            }
        }
        return new Matrix(difference);
    }

    private boolean checkAnotherMatrix(Matrix term) {
        return this.matrixArray.length == term.matrixArray.length
                && this.matrixArray[0].length == term.matrixArray[0].length;
    }

    Matrix multiplyByMatrix(Matrix multiplicand) {
        int[][] product = new int[this.matrixArray.length][multiplicand.matrixArray[0].length];
        if (!checkMultiplicandMatrix(multiplicand)) {
            System.out.println("null");
            return null;
        }
        for (int m = 0; m < product.length; m++) {
            for (int n = 0; n < product[0].length; n++) {
                product[m][n] = multiplyVectors(multiplicand.matrixArray, m, n);
            }
        }
        return new Matrix(product);
    }

    private boolean checkMultiplicandMatrix(Matrix multiplicand) {
        return this.matrixArray[0].length == multiplicand.matrixArray.length;
    }

    private int multiplyVectors(int[][] another, int m, int n) {
        int temp = 0;
        int row = 0;
        for (int val : this.matrixArray[m]) {
            temp += val * another[row++][n];
        }
        return temp;
    }

    void multiplyByNumber(int number) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.matrixArray[i][j] *= number;
            }
        }
    }
}
