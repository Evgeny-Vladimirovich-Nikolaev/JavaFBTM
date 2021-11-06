import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryMathematicalOperations {

    private int first, second;
    private String message = "Enter Y to continue or N to exit";
    private String ioError = "Input output error";
    private String error = "Something went wrong";

    BinaryMathematicalOperations() {
        initOperation();
    }

    private void initOperation() {
        do {
            initValues();
            calculate();
        } while (resume());
    }

    private void initValues() {
        ValueReceiver valueReceiver = new ValueReceiver();
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

        System.out.println(message);

        while (true) {
            try {
                isReady = stream.ready();
            } catch (IOException e) {
                System.out.println(ioError);
                continue;
            }
            if (!isReady) {
                continue;
            }
            try {
                line = br.readLine();
            } catch (IOException e) {
                System.out.println(ioError);
                continue;
            } catch (Exception exp) {
                System.out.println(error);
            }
            if (line.equals("Y")){
                return true;
            }else if (line.equals("N")){
                return false;
            }else{
                System.out.println(message);
                continue;
            }
        }
    }
}

