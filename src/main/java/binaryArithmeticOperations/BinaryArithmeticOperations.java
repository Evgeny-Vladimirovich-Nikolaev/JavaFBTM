import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryArithmeticOperations {
    private int first, second;
    public static final String MESSAGE = "Enter Y to continue or N to exit";
    public static final String IO_ERROR = "Input Output ERROR!";
    public static final String ERROR = "SOMETHING WENT WRONG!";

    BinaryArithmeticOperations() {
        initOperation();
    }

    private void initOperation() {
        do {
            initValues();
            calculate();
        } while(resume());
    }

    private void initValues() {
        OldValueReceiver valueReceiver = new OldValueReceiver();
        first = valueReceiver.getFirstValue();
        second = valueReceiver.getSecondValue();
    }

    private void calculate() {
        System.out.println(new Calculator(first, second));
    }

    private boolean resume() {
        boolean isReady;
        String line = "";
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(stream);

        System.out.println(MESSAGE);

        while(true) {
            try {
                isReady = stream.ready();
            } catch(IOException e) {
                System.out.println(IO_ERROR);
                continue;
            }
            if(!isReady) {
                continue;
            }
            try {
                line = br.readLine();
            } catch(IOException e) {
                System.out.println(IO_ERROR);
                continue;
            } catch(Exception exp) {
                System.out.println(ERROR);
            }
            if(line.equalsIgnoreCase("Y")) {
                return true;
            } else if(line.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println(MESSAGE);
                continue;
            }
        }
    }
}