import java.util.Random;
public class Determinant {

    SquareMatrix a;
    private int m;
    private long determinant;

    void chooseInitOptions() {
        int choice = -1;
        NumberReceiver receiver = new NumberReceiver();
        while (choice < 0 || choice > 2) {
            choice = receiver.receiveInt(MatrixMsg.INITIALIZATION_OPTIONS.getMsg());
        }
        switch (choice) {
            case 1 -> initRandomOperand();
            case 2 -> initCustomOperand();
        }
    }

    private void initRandomOperand() {
        Random random = new Random();
        m = random.nextInt(10) + 1;
        a = new SquareMatrix(m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a.getMatrixArray()[i][j] = random.nextInt(201) - 100;
            }
        }
        determinant = a.findDeterminant(a.getMatrixArray());
        writeReport();
    }

    void initCustomOperand() {
        initSize();
        fillArray("A");
        determinant = a.findDeterminant(a.getMatrixArray());
        writeReport();
    }

    private void initSize() {
        NumberReceiver numberReceiver = new NumberReceiver();
        while (m < 1) {
            m = numberReceiver.receiveInt(MatrixMsg.SPECIFY_ROWS_NUMBER.getMsg()
                    + MatrixMsg.LINE_CONDITIONS.getMsg());
        }
        a = new SquareMatrix(m);
    }

    void fillArray(String matrix) {
        int[] values = new int[m * m];
        int ind = 0;
        System.out.printf(MatrixMsg.FILL_MATRIX.getMsg(), matrix);
        NumberReceiver receiver = new NumberReceiver();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                values[ind++] = receiver.receiveInt(String.format(MatrixMsg.ENTER_VALUE.getMsg(),
                        matrix,
                        (i + 1),
                        (j + 1)
                ));
            }
        }
        a.fillArrayMatrix(values);
    }

    private void writeReport() {
        System.out.println("Квадратная матрица A\n");
        new MatrixPresentation(a).matrixToString();
        System.out.println("Детерминант матрицы A равен " + determinant);
    }
}