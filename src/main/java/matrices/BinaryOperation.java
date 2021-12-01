public abstract class BinaryOperation {

    Matrix a, b, c;
    int m, n;

    void chooseInitOptions() {
        int choice = -1;
        NumberReceiver receiver = new NumberReceiver();
        while (choice < 0 || choice > 2) {
            choice = receiver.receiveInt(MatrixMsg.INITIALIZATION_OPTIONS.getMsg());
        }
        switch (choice) {
            case 1 -> initRandomOperands();
            case 2 -> initCustomOperands();
        }
    }

    void initRandomOperands() {
        initRandomSizes();
        a = getRandomMatrix();
        b = getRandomMatrix();
        calculate();
        writeReport();
    }

    void initRandomSizes() {
        m = (int) (Math.random() * 10) + 1;
        n = (int) (Math.random() * 10) + 1;
    }

    Matrix getRandomMatrix() {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.getRandomArray();
        return builder.getMatrix();
    }

    void initCustomOperands() {
        initCustomSizes();
        createCustomMatrix();
        calculate();
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
        b = buildMatrix("B");
    }

    Matrix buildMatrix(String matrix) {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.fillArray(matrix);
        return builder.getMatrix();
    }

    abstract Matrix calculate();

    void writeReport() {
        System.out.println("Матрица A");
        new MatrixPresentation(a).matrixToString();
        System.out.println("Матрица B");
        new MatrixPresentation(b).matrixToString();
        System.out.println("Матрица C - результат " + definiteOperation() + " двух матриц");
        new MatrixPresentation(c).matrixToString();
    }

    abstract String definiteOperation();
}
