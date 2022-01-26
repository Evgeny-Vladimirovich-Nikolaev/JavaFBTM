import java.util.Random;

public class Request {

    protected Matrix[] matrices;
    protected int m, n;

    public Matrix[] createMatrixArray(int num) {
        matrices = new Matrix[num];
        chooseInitOptions();
        return matrices;
    }

    protected void chooseInitOptions() {
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

    protected void initRandomOperands() {
        initRandomSizes();
        for(int i = 0; i < matrices.length; i++) {
            matrices[i] = getRandomMatrix();
        }
    }

    protected void initRandomSizes() {
        Random random = new Random();
        m = random.nextInt(10) + 1;
        n = random.nextInt(10) + 1;
    }

    protected Matrix getRandomMatrix() {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.getRandomArray();
        return builder.getMatrix();
    }

    protected void initCustomOperands() {
        initCustomSizes();
        createCustomMatrix();
    }

    protected void initCustomSizes() {
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

    protected void createCustomMatrix() {
        for(int i = 0; i < matrices.length; i++) {
            if(i == 0) {
                matrices[0] = buildMatrix("A");
            } else {
                matrices[i] = buildMatrix("B");
            }
        }
    }

    protected Matrix buildMatrix(String matrix) {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.fillArray(matrix);
        return builder.getMatrix();
    }

}
