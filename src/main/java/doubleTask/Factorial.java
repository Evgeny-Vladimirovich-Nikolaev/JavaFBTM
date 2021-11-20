public class Factorial {

    private NumberReceiver numberReceiver;
    private int value;
    private double result;
    private String message;

    public Factorial() {
        numberReceiver = new NumberReceiver();
        receive();
        calculateFactorial();
        writeMessage();
    }

    private void receive() {
        while(true) {
            value = numberReceiver.receiveInt(Message.INIT_NOT_NEGATIVE.getMsg());
            if(value < 0) {
                continue;
            }
            if(value > 5000 && !isAgree(value)) {
                continue;
            }
            break;
        }
    }

    private boolean isAgree(int i) {
        while(true) {
            int choice = numberReceiver.receiveInt(i + Message.TOO_MUCH.getMsg());
            if(choice != 1 && choice != 2) {
                continue;
            }
            return choice == 1;
        }
    }

    private void calculateFactorial () {
        result = 1;
        for(int i = 2; i <= value; i++ ) {
            result *= i;
        }
    }

    private void writeMessage() {
        message = value
                + "! = "
                + formatResult();
    }

    private StringBuilder formatResult() {
        StringBuilder res = new StringBuilder(Double.toString(result));
        if(".0".equals(res.substring(res.length()-2))){
            res.delete(res.length()-2, res.length());
        }
        return res;
    }

    @Override
    public String toString() {
        return message;
    }
}
