public abstract class BinaryOperation {
    protected Matrix result;
    protected Matrix[] matrices;

    public void initOperation(int num) {
        matrices = new Request().createMatrixArray(num);
        calculate();
        writeReport();
    }

    protected abstract Matrix calculate();

    protected void writeReport() {
        System.out.println("Матрица A");
        new MatrixPresentation(matrices[0]).matrixToString();
        System.out.println("Матрица B");
        new MatrixPresentation(matrices[1]).matrixToString();
        System.out.println("Матрица C - результат " + definiteOperation() + " двух матриц");
        new MatrixPresentation(result).matrixToString();
    }

    protected abstract String definiteOperation();
}
