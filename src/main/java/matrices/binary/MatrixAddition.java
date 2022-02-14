public class MatrixAddition extends BinaryOperation {
    @Override
    protected Matrix calculate() {
        return result = matrices[0].add(matrices[1]);
    }

    @Override
    protected String definiteOperation() {
        return "сложения";
    }
}
