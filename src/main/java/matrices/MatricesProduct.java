public class MatricesProduct extends BinaryOperation {

    private int k;

    @Override
    void initRandomOperands() {
        initRandomSizes();
        a = getRandomMatrix(m, n);
        b = getRandomMatrix(n, k);
        calculate();
        writeReport();
    }

    @Override
    void initRandomSizes() {
        m = (int) (Math.random() * 10) + 1;
        n = (int) (Math.random() * 10) + 1;
        k = (int) (Math.random() * 10) + 1;
    }

    // Перегрузка метода базового класса, неквадратные матрицы имеют разную размерность
    Matrix getRandomMatrix(int x, int y) {
        MatrixBuilder builder = new MatrixBuilder(x, y);
        builder.getRandomArray();
        return builder.getMatrix();
    }

    @Override
    void initCustomOperands() {
        initCustomSizes();
        createCustomMatrix();
        calculate();
        writeReport();
    }

    @Override
    void initCustomSizes() {
        NumberReceiver receiver = new NumberReceiver();
        while (m < 1) {
            m = receiver.receiveInt(MatrixMsg.SPECIFY_ROWS_NUMBER.getMsg()
                    + MatrixMsg.FIRST_MATRIX.getMsg()
                    + MatrixMsg.LINE_CONDITIONS.getMsg());
        }
        while (n < 1) {
            n = receiver.receiveInt(MatrixMsg.SPECIFY_COLUMNS_NUMBER.getMsg()
                    + MatrixMsg.FIRST_MATRIX.getMsg()
                    + MatrixMsg.LINE_CONDITIONS.getMsg());
        }
        while (k < 1) {
            k = receiver.receiveInt(MatrixMsg.SPECIFY_COLUMNS_NUMBER.getMsg()
                    + MatrixMsg.SECOND_MATRIX.getMsg()
                    + MatrixMsg.LINE_CONDITIONS.getMsg());
        }
    }

    void createCustomMatrix() {
        a = buildMatrix("A", m, n);
        b = buildMatrix("B", n, k);
    }

    // Перегрузка метода базового класса, неквадратные матрицы имеют разную размерность
    Matrix buildMatrix(String matrix, int x, int y) {
        MatrixBuilder builder = new MatrixBuilder(x, y);
        builder.fillArray(matrix);
        return builder.getMatrix();
    }

    @Override
    Matrix calculate() {
        return c = a.multiplyByMatrix(b);
    }

    @Override
    String definiteOperation() {
        return "произведения";
    }
}
