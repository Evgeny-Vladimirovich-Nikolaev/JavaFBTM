public class MatrixPresentation {

    private int[][] matrixArray;
    private int m, n;               // rows, columns
    private int numberLength = 0;

    MatrixPresentation(Matrix matrix) {
        this.matrixArray = matrix.matrixArray;
        this.m = matrix.m;
        this.n = matrix.n;
    }

    void matrixToString() {
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
        printBorder();
        for(int i = 0; i < m; i++) {
            System.out.print("|");
            for(int j = 0; j < n; j++) {
                StringBuilder num = new StringBuilder(Integer.toString(matrixArray[i][j]));
                while(num.length() < numberLength) {
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
        for(int underLining = 0; underLining <= (numberLength + 1) * n + 1; underLining++){
            System.out.print("_");
        }
        System.out.println();
    }
}
