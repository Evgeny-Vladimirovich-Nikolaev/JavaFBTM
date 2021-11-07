import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static final String CHOOSE = "Choose operation, Enter:\n";
    public static final String ADDITION = "1 to add\n";
    public static final String SUBTRACTION = "2 to subtract\n";
    public static final String MULTIPLICATION = "3 to multiply\n";
    public static final String DIVISION = "4 to divide";
    public static final String IO_ERROR = "Input Output ERROR!";
    public static final String ERROR = "SOMETHING WENT WRONG!";

    private int first, second;
    private String line, result;



    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
        sendMessage();
        parseLine();
    }

    private void sendMessage(){
        System.out.println(CHOOSE + ADDITION + SUBTRACTION + MULTIPLICATION + DIVISION);
    }

    private void parseLine(){
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(stream);
        boolean isReady;

        while(true){
            try {
                isReady = stream.ready();
            } catch (IOException e) {
                System.out.println(IO_ERROR);
                continue;
            }
            if(!isReady){
                continue;
            }
            try{
                line = br.readLine();
            } catch (IOException e) {
                System.out.println(IO_ERROR);
                continue;
            } catch (Exception exp){
                System.out.println(ERROR);
               break;
            }
            switch (line) {
                case "1" -> add();
                case "2" -> subtract();
                case "3" -> multiply();
                case "4" -> divide();
                default -> {
                    sendMessage();
                    continue;
                }
            }
            break;
        }
    }

    private void add(){
        result = Long.toString((long)first + second);
    }

    private void subtract(){
        result = Long.toString((long)first - second);
    }

    private void multiply(){
        result = Long.toString((long)first * second);
    }

    private void divide(){
        result = Double.toString((double) first / second);
    }

    @Override
    public String toString(){
        return result;
    }
}
