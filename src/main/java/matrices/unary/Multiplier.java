import java.util.Random;

public class Multiplier extends UnaryOperation {
    private int number;

    @Override
    void calculate(boolean isRandom) {
        initNumber(isRandom);
        start();
        a.multiplyByNumber(number);
    }

    private void start() {
        System.out.println("Матрица A до умножения");
        new MatrixPresentation(a).matrixToString();
        System.out.println("Множитель " + number);
    }

    private void initNumber(boolean isRandom) {
        if (isRandom) {
            number = new Random().nextInt (201) - 100;
        } else {
            NumberReceiver numberReceiver = new NumberReceiver();
            number = numberReceiver.receiveInt(MatrixMsg.ENTER_NUMBER.getMsg());
        }
    }

    @Override
    String definiteOperation() {
        return " умножения на " + number;
    }
}
