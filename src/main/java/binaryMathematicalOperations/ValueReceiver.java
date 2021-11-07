import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValueReceiver {

    public static final String FIRST_MESSAGE = "Enter two numbers between -2147483648 and 2147483647";
    public static final String FIRST_VALUE = "The first number is ";
    public static final String SECOND_MESSAGE = "Enter the second number";
    public static final String SECOND_VALUE = "The second number is ";
    public static final String INVALID_NUMBER = " is invalid number\n";
    public static final String CONDITION = "The value must be between -2147483648 and 2147483647\n";
    public static final String AGAIN = "Please try Again";
    public static final String INVALID_LINE = " is not a number\n";
    public static final String IO_ERROR = "Input Output ERROR!";
    public static final String ERROR = "SOMETHING WENT WRONG!";

    private int firstNumber, secondNumber;

    ValueReceiver(){
        firstNumber = receiveValue(FIRST_MESSAGE, FIRST_VALUE);
        secondNumber = receiveValue(SECOND_MESSAGE, SECOND_VALUE);
    }

    int getFirstValue() {
        return firstNumber;
    }

    int getSecondValue() {
        return secondNumber;
    }

    private int receiveValue(String message, String currentValue) {
        int newNumber = 0;
        String temp = "";
        System.out.println(message);
        while(true) {
            InputStreamReader stream = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(stream);
            try {
                try {temp = br.readLine();
                    newNumber = Integer.parseInt(temp);
                } catch (NumberFormatException numEx) {
                    if(checkLine(temp)){
                        System.out.println(temp + INVALID_NUMBER + CONDITION + AGAIN);
                    } else {
                        System.out.println(temp + INVALID_LINE + AGAIN);
                    }
                    continue;
                } catch (IOException numEx) {
                    System.out.println(IO_ERROR);
                }
                break;
            } catch (Exception e) {
                System.out.println(ERROR);
            }
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(IO_ERROR);
            }
            try{
                stream.close();
            }catch (IOException e){
                System.out.println(IO_ERROR);
            }
        }
        System.out.println(currentValue + newNumber);
        return newNumber;
    }

    private boolean checkLine(@NotNull String line){
        char[] ch = line.toCharArray();
        if(ch[0] != 45 && (ch[0] < 48 || ch[0] > 57)){
            return false;
        }
        for(int i = 1; i < ch.length; i++){
            if(ch[i] < 48 || ch[i] > 57)
                return false;
        }
        return true;
    }
}