public class MatrixAddition {

    Matrix a, b;
    int m, n;

    void createRandomMatrix() {
        getRandomA();
        getRandomB();
    }

    void createCustomMatrix(int rows, int columns) {
        this.m = rows;
        this.n = columns;
        a = buildMatrix();
        b = buildMatrix();
    }

    void getRandomA() {
        m = (int) (Math.random() * 10) + 1;
        n = (int) (Math.random() * 10) + 1;
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.getRandomArray();
        a = builder.getMatrix();
    }

    void getRandomB() {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.getRandomArray();
        b = builder.getMatrix();
    }

    Matrix buildMatrix() {
        MatrixBuilder builder = new MatrixBuilder(m, n);
        builder.fillArray();
        return builder.getMatrix();
    }

    Matrix calculate() {
        return a.add(b);
    }
}
