import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValueReceiver2  {

    public static final BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static int receiveInt() {
        int value = -1;
        while(true) {
            try {
                value = Integer.parseInt(inputReader.readLine());
            } catch(NumberFormatException e) {
                System.out.println(Message.INVALID_NUMBER.getMsg());
                continue;
            } catch (IOException e) {
                System.out.println(Message.IO_ERROR.getMsg());
                continue;
            }
            break;
        }
        return value;
        }

    public static Long receiveLong() {
        Long value = -1L;
        while(true) {
            try {
                value = Long.parseLong(inputReader.readLine());
            } catch(NumberFormatException e) {
                System.out.println(Message.INVALID_NUMBER.getMsg());
                continue;
            } catch (IOException e) {
                System.out.println(Message.IO_ERROR.getMsg());
                continue;
            }
            break;
        }
        return value;
    }

    public static void close() {
        try {
            inputReader.close();
        } catch (IOException e) {
            System.out.println(Message.IO_ERROR.getMsg());
        }
    }
}
