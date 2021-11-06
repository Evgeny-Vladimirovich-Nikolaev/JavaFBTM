import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private int first, second;
    private String choose = "Choose operation, press:\n";
    private String addition = "1 + ENTER to add\n";
    private String subtraction = "2 + ENTER to subtract\n";
    private String multiplication = "3 + ENTER to multiply\n";
    private String division = "4 + ENTER to divide";

    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
        chooseOperation();
        parseLine();
    }

    private void chooseOperation(){
        System.out.println(choose + addition + subtraction + multiplication + division);
    }

    private void parseLine(){
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                line = br.readLine();
                switch (line){
                    case "1" : add();
                        break;
                    case "2" : subtract();
                        break;
                    case "3" : multiply();
                        break;
                    case "4" : divide();
                        break;
                    default  : continue;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void add(){
        System.out.println((long)first + second);
    }

    private void subtract(){
        System.out.println((long)first - second);
    }

    private void multiply(){
        System.out.println((long)first * second);
    }

    private void divide(){
        System.out.println((double)first + second);
    }
}
