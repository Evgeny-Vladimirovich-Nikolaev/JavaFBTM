import java.util.Random;

public abstract class UnaryOperation {
    Matrix a;
    int m, n;

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

    void initRandomOperand() {
        initRandomSizes();
        a = getRandomMatrix();
        calculate(true);
        writeReport();
    }

    void initRandomSizes() {
        Random random = new Random();
        m = random.nextInt(10) + 1;
        n = random.nextInt(10) + 1;
    }

    Matrix getRandomMatrix() {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.getRandomArray();
        return builder.getMatrix();
    }

    void initCustomOperand() {
        initCustomSizes();
        createCustomMatrix();
        calculate(false);
        writeReport();
    }

    void initCustomSizes() {
        NumberReceiver receiver = new NumberReceiver();
        while (m < 1) {
            m = receiver.receiveInt(MatrixMsg.SPECIFY_ROWS_NUMBER.getMsg() +
                    MatrixMsg.LINE_CONDITIONS.getMsg());
        }
        while (n < 1) {
            n = receiver.receiveInt(MatrixMsg.SPECIFY_COLUMNS_NUMBER.getMsg() +
                    MatrixMsg.LINE_CONDITIONS.getMsg());
        }
    }

    void createCustomMatrix() {
        a = buildMatrix("A");
    }

    Matrix buildMatrix(String matrix) {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.fillArray(matrix);
        return builder.getMatrix();
    }

    abstract void calculate(boolean isRandom);

    void writeReport() {
        System.out.println("Матрица A после " + definiteOperation());
        new MatrixPresentation(a).matrixToString();
    }

    abstract String definiteOperation();
}
