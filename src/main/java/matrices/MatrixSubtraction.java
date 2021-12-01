public class MatrixSubtraction extends BinaryOperation {

    @Override
    Matrix calculate() {
        return c = a.subtract(b);
    }

    @Override
    String definiteOperation() {
        return "разности";
    }
}
