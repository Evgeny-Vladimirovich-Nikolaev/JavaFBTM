public class MatrixAddition extends BinaryOperation {


    @Override
    Matrix calculate() {
        return c = a.add(b);
    }

    @Override
    String definiteOperation() {
        return "сложения";
    }
}
