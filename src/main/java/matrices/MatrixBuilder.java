public class MatrixBuilder {

    private Matrix x;
    private int m, n;

    MatrixBuilder(int rows, int columns) {
        m = x.getMatrixArray().length;
        n = x.getMatrixArray()[0].length;
        x = new Matrix(new int[rows][columns]);
    }

    Matrix getMatrix() {
        return x;
    }

    void getRandomArray() {
        int[] values = new int[m * n];
        for(int i = 0; i < m * n; i++) {
            values[i] = (int)(Math.random() * 200) - 100;
        }
        x.fillArrayMatrix(values);
    }

    void getRandomArray(int max) {
        int[] values = new int[m * n];
        for(int i = 0; i < m * n; i++) {
            values[i] = (int)(Math.random() * max * 2) - max;
        }
        x.fillArrayMatrix(values);
    }

    void fillArray() {
        int[] values = new int[m * n];
        NumberReceiver receiver = new NumberReceiver();
        for(int i = 0; i < m * n; i++) {
            values[i] = receiver.receiveInt(
                    "Введите целое число (желательно в пределах от -100 до 100");
        }
        x.fillArrayMatrix(values);
    }
}
