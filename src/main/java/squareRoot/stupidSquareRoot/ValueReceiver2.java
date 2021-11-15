import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Не удалось реализовать try-with-resources, так как нет возможности повторно открыть System.in.
 * Здесь проблему решил созданием класса ValueReceiver2 со статическими членами
 * и одноразовым закрытием потоков.
 */

public class ValueReceiver2  {

    public static final BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static int receiveInt() {
        int value;
        String temp = "";
        while(true) {
            try {
                temp = inputReader.readLine();
                value = Integer.parseInt(temp);
            } catch(NumberFormatException numEx) {
                if(temp.length() != 0 && checkLine(temp)) {
                    System.out.println(temp
                            + Message.INVALID_NUMBER.getMsg());
                } else {
                    System.out.println(temp + Message.INVALID_LINE.getMsg());
                }
                continue;
            } catch(IOException ioEx) {
                System.out.println(Message.IO_ERROR.getMsg());
                continue;
            }return value;
        }
    }

    static boolean checkLine(/*@NotNull*/ String line) {
        char[] ch = line.toCharArray();
        if(ch[0] != 45 && (ch[0] < 48 || ch[0] > 57)) {
            return false;
        }
        for(int i = 1; i < ch.length; i++) {
            if(ch[i] < 48 || ch[i] > 57)
                return false;
        }
        return true;
    }

   public static void close() {
        try {
            inputReader.close();
        } catch (IOException e) {
            System.out.println(Message.IO_ERROR.getMsg());
        }
    }
}
