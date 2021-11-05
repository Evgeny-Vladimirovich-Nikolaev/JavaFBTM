import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValueReceiver {

    private int firstNumber, secondNumber;
    private String firstMessage = "Enter two numbers between -2147483648 and 2147483647";
    private String secondMessage = "Enter the second number";
    private String condition = "The value must be between -2147483648 and 2147483647\n";
    private String invalidNumber = " is invalid number\n";
    private String invalidLine = " is not a number\n";
    private String ioError = "Input output error";
    private String error = "Something went wrong";
    private String again = "Please try again";
    private String firstValue = "The first number is ";
    private String secondValue = "The second number is ";

    ValueReceiver(){
        firstNumber = receiveValue(firstMessage, firstValue);
        secondNumber = receiveValue(secondMessage, secondValue);
    }

    int getFirstValue() {
        return firstNumber;
    }

    int getSecondValue() {
        return secondNumber;
    }

    private int receiveValue(String message, String currentValue) {
        int newNumber;
        String temp = "";
        System.out.println(message);
        while(true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                try {temp = br.readLine();
                    newNumber = Integer.parseInt(temp);
                } catch (NumberFormatException numEx) {
                    if(checkLine(temp)){
                        System.out.println(temp + invalidNumber + condition + again);
                    } else {
                        System.out.println(temp + invalidLine + again);
                    }
                    continue;
                } catch (IOException numEx) {
                    System.out.println(ioError);
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(ioError);
            }
        }
        System.out.println(currentValue + newNumber);
        return newNumber;
    }

    private boolean checkLine(@NotNull String line){
        char ch[] = line.toCharArray();
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
