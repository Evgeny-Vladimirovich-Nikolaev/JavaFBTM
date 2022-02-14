import java.util.Random;

public class RequestForProduct extends Request{

    private int k;

    @Override
    public Matrix[] createMatrixArray(int num) {
        matrices = new Matrix[num];
        chooseInitOptions();
        return matrices;
    }

    @Override
    protected void initRandomOperands() {
        initRandomSizes();
        matrices[0] = getRandomMatrix(m, n);
        matrices[1] = getRandomMatrix(n, k);
    }

    @Override
    protected void initRandomSizes() {
        Random random = new Random();
        m = random.nextInt(10) + 1;
        n = random.nextInt(10) + 1;
        k = random.nextInt(10) + 1;
    }

    // Перегрузка метода базового класса, неквадратные матрицы имеют разную размерность
    Matrix getRandomMatrix(int x, int y) {
        MatrixBuilder builder = new MatrixBuilder(x, y);
        builder.getRandomArray();
        return builder.getMatrix();
    }

    @Override
    protected void initCustomOperands() {
        initCustomSizes();
        createCustomMatrix();
    }

    @Override
    protected void initCustomSizes() {
        super.initCustomSizes();
        while (k < 1) {
            k = new NumberReceiver().receiveInt(MatrixMsg.SPECIFY_COLUMNS_NUMBER.getMsg()
                    + MatrixMsg.SECOND_MATRIX.getMsg()
                    + MatrixMsg.LINE_CONDITIONS.getMsg());
        }
    }

    protected void createCustomMatrix() {
        matrices[0] = buildMatrix("A", m, n);
        matrices[1] = buildMatrix("B", n, k);
    }

    //перегрузка метода из суперкласса
    protected Matrix buildMatrix(String matrix, int x, int y) {
        MatrixBuilder builder = new MatrixBuilder(x, y);
        builder.fillArray(matrix);
        return builder.getMatrix();
    }

}
