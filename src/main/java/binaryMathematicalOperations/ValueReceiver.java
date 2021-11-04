import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValueReceiver {

    private int firstValue, secondValue;
    private String firstEnter = "\nEnter the first number";
    private String secondEnter = "\nEnter the second number";
    private String condition = "Value must be between -2147483648 and 2147483647";
    private String invalidNumber = "Invalid number\n";
    private String invalidLine = " is not a number";
    private String again = "Please, try again";

    ValueReceiver(){
        setValues();
    }

    private void setValues(){
        firstValue = receiveValue(firstEnter);
        secondValue = receiveValue(secondEnter);
    }

    int getFirstValue() {
        return firstValue;
    }

    int getSecondValue() {
        return secondValue;
    }

    private int receiveValue(String enter){
        int temp;
        System.out.println(enter);
        while(true){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            try {
                temp = Integer.valueOf(input);
            } catch (NumberFormatException numExp) {
                if (scanner.hasNextBigInteger()) {
                    System.out.println(invalidNumber + condition + again);
                } else if (scanner.hasNext()) {
                    System.out.println(input + invalidLine + again);
                }
                scanner.close();
                continue;
            }
            break;
        }
        return temp;
    }
}
