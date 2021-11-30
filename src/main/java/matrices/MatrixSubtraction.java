public class MatrixSubtraction extends MatrixAddition{

    @Override
    Matrix calculate() {
        return a.subtract(b);
    }
}
