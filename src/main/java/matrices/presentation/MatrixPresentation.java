public class MatrixPresentation {

    private int[][] matrixArray;
    private int m, n;               // rows, columns
    private int numberLength = 0;

    MatrixPresentation(Matrix matrix) {
        this.matrixArray = matrix.getMatrixArray();
        this.m = matrix.m;
        this.n = matrix.n;
    }

    void matrixToString() {
        if (m < 0 || n < 0) {
            System.out.println("Нельзя отобразить матрицу с размерностью 0");
            return;
        }
        countSymbols();
        printLines();
    }

    private void countSymbols() {
        int min = 0, max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrixArray[i][j] > max) {
                    max = matrixArray[i][j];
                } else if (matrixArray[i][j] < min) {
                    min = matrixArray[i][j];
                }
            }
        }
        numberLength = (Integer.toString(max)).length();
        if ((Integer.toString(min)).length() > numberLength) {
            numberLength = (Integer.toString(min)).length();
        }
    }

    private void printLines() {
        System.out.printf("Матрица размером %sx%s:\n", m, n);
        printBorder();
        for (int i = 0; i < m; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                StringBuilder num = new StringBuilder(Integer.toString(matrixArray[i][j]));
                while (num.length() < numberLength) {
                    num.append(" ", 0, 1);
                }
                num.append("|");
                System.out.print(num);
            }
            System.out.println();
            printBorder();
        }
    }

    private void printBorder() {
        for (int underLining = 0; underLining <= (numberLength + 1) * n + 1; underLining++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
