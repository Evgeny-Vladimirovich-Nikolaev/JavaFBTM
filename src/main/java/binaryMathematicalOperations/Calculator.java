import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private int first, second;
    private String line, result;
    private String choose = "Choose operation, Enter:\n";
    private String addition = "1 to add\n";
    private String subtraction = "2 to subtract\n";
    private String multiplication = "3 to multiply\n";
    private String division = "4 to divide";
    private String ioError = "Input output error";
    private String error = "Something went wrong";


    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
        sendMessage();
        read();
    }

    private void sendMessage(){
        System.out.println(choose + addition + subtraction + multiplication + division);
    }

    private void read(){
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(stream);
        boolean isReady;

        while(true){
            try {
                isReady = stream.ready();
            } catch (IOException e) {
                System.out.println(ioError);
                continue;
            }
            if(!isReady){
                continue;
            }
            try{
                line = br.readLine();
            } catch (IOException e) {
                System.out.println(ioError);
                continue;
            } catch (Exception exp){
                System.out.println(error);
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
