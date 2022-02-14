public class MatricesProduct extends BinaryOperation {
    @Override
    public void initOperation(int operands) {
        matrices = new RequestForProduct().createMatrixArray(operands);
        calculate();
        writeReport();
    }

    @Override
    protected Matrix calculate() {
        return result = matrices[0].multiplyByMatrix(matrices[1]);
    }

    @Override
    protected String definiteOperation() {
        return "произведения";
    }
}
