public class MatrixSubtraction extends BinaryOperation {

    @Override
    protected Matrix calculate() {
        return result = matrices[0].subtract(matrices[1]);
    }

    @Override
    protected String definiteOperation() {
        return "разности";
    }
}
