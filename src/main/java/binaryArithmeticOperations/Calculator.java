import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static final String CHOOSE = "Choose operation, Enter:\n";
    public static final String ADDITION = "1 to add\n";
    public static final String SUBTRACTION = "2 to subtract\n";
    public static final String MULTIPLICATION = "3 to multiply\n";
    public static final String DIVISION = "4 to divide\n";
    public static final String REMAINDER = "5 to calculate remainder";
    public static final String IO_ERROR = "Input Output ERROR!";
    public static final String ERROR = "SOMETHING WENT WRONG!";

    private int first, second;
    private String line, result, message;

    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
        sendMessage();
        parseLine();
    }

    private void sendMessage() {
        System.out.println(CHOOSE
                + ADDITION
                + SUBTRACTION
                + MULTIPLICATION
                + DIVISION
                + REMAINDER);
    }

    private void parseLine() {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(stream);
        boolean isReady;

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
            } catch(Exception exp){
                System.out.println(ERROR);
                break;
            }
            switch(line) {
                case "1" -> add();
                case "2" -> subtract();
                case "3" -> multiply();
                case "4" -> divide();
                case "5" -> calculateRemainder();
                default -> {
                    sendMessage();
                    continue;
                }
            }
            break;
        }
    }

    private void add() {
        result = Long.toString((long)first + second);
        writeMessage(" + ");
    }

    private void subtract() {
        result = Long.toString((long)first - second);
        writeMessage(" - ");
    }

    private void multiply() {
        result = Long.toString((long)first * second);
        writeMessage(" * ");
    }

    private void divide() {
        if(second != 0) {
            result = Double.toString((double) first / second);
            writeMessage(" / ");
        } else {
            message = "ERROR! You try to divide by zero!";
        }
    }

    private void calculateRemainder() {
        result = Integer.toString(first % second);
        writeMessage(" % ");
    }

    private void writeMessage(String operator) {
        StringBuilder msg = new StringBuilder();
        if(first < 0) {
            msg.append(placeInBrackets(first));
        } else {
            msg.append(first);
        }
        msg.append(operator);
        if(second < 0) {
            msg.append(placeInBrackets(second));
        } else {
            msg.append(second);
        }
        msg.append(" = ");
        msg.append(result);
        message = msg.toString();
    }

    private String placeInBrackets(int num) {
        return ("(" + num + ")");
    }

    @Override
    public String toString() {
        return message;
    }
}
