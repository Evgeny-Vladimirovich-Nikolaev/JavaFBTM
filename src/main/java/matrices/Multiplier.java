public class Multiplier extends UnaryOperation {

    private int number;

    @Override
    void calculate(boolean isRandom) {
        initNumber(isRandom);
        a.multiplyByNumber(number);
    }

    private void initNumber(boolean isRandom) {
        if(isRandom) {
            number = (int)(Math.random() * 2000) -1000;
        } else {

        }
    }

    @Override
    String definiteOperation() {
        return null;
    }
}
