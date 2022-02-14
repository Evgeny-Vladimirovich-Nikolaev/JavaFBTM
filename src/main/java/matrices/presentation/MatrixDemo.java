import java.util.Random;
public class MatrixDemo {

    void demonstrateMatrices() {
        sendMessage();
        showRandomMatrices();
        multiplyMatrices();
        calculateDeterminant();
        finishDemonstration();
    }
    private void sendMessage() {
        System.out.println("ПРОГРАММА \"MATRIX\"\nДЕМОНСТРАЦИЯ\n________________________________");
    }

    private void showRandomMatrices() {
        int[][] twoDemArr;
        Random random = new Random();
        System.out.println("\n________________________________\nТРИ СЛУЧАЙНЫЕ МАТРИЦЫ");
        for (int i = 0; i < 3; i++) {
            int rows = random.nextInt( 5) + 1;
            int columns = random.nextInt( 5) + 1;
            twoDemArr = new int[rows][columns];
            fillArray(twoDemArr);
            Matrix matrix = new Matrix(twoDemArr);
            new MatrixPresentation(matrix).matrixToString();
        }
    }

    private void fillArray(int[][] twoDemArr) {
        Random random = new Random();
        for (int row = 0; row < twoDemArr.length; row++) {
            for (int column = 0; column < twoDemArr[0].length; column++) {
                twoDemArr[row][column] = random.nextInt(201) - 100;
            }
        }
    }

    private void multiplyMatrices() {
        System.out.println("\n________________________________\nУМНОЖЕНИЕ МАТРИЦ");

        System.out.println("Матрица A");
        int[][] a = new int[][]{
                {2, 3, 4, -5, 9, -3},
                {1, 0, 2, 3, 5, 6},
                {4, 3, -7, 11, 2, 4},
                {2, 3, 5, 6, 9, -3},
                {4, 3, -7, 11, 2, 3},
                {8, 3, 5, 6, -7, 11},
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 3, 2, 1}
        };
        Matrix A = new Matrix(a);
        new MatrixPresentation(A).matrixToString();

        System.out.println("Матрица B");
        int[][] b = new int[][]{
                {2, 3, 4, 5, 6},
                {0, 1, 2, 9, 8},
                {1, 2, 3, 11, -6},
                {-8, 6, 6, 3, 2},
                {0, 4, -1, 3, 8},
                {7, 12, 4, 0, 3}
        };
        Matrix B = new Matrix(b);
        new MatrixPresentation(B).matrixToString();

        System.out.println("Матрица C - результат произведения A * B");
        Matrix cc = A.multiplyByMatrix(B);
        new MatrixPresentation(cc).matrixToString();
    }

    private void calculateDeterminant() {
        System.out.println("\n________________________________\nВЫЧИСЛЕНИЕ ДЕТЕРМИНАНТА");

        int[] arr;
        for (int size = 1; size < 9; size *= 2) {
            System.out.printf("Вычисление детерминанта случайной матрицы %s порядка:\n", size);
            SquareMatrix squareMatrix = new SquareMatrix(size);
            arr = new int[size * size];
            for (int i = 0; i < size * size; i++) arr[i] = (int) (Math.random() * 20) - 10;
            squareMatrix.fillArrayMatrix(arr);
            new MatrixPresentation(squareMatrix).matrixToString();
            System.out.print("Детерминант равен ");
            System.out.println(squareMatrix.findDeterminant(squareMatrix.getMatrixArray()));
        }
    }

    private void finishDemonstration() {
        System.out.println("\n________________________________\nКОНЕЦ ДЕМОНСТРАЦИИ");
        System.out.println("\n________________________________\n");
    }
}
