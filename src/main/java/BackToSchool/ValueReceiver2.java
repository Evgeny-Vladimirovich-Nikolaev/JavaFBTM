import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValueReceiver2  {

    public static final BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static int receiveInt() {
        int value = -1;
        while(true) {
            System.out.println("ValueReceiver2.receiveInt()");
            try {
                value = Integer.parseInt(inputReader.readLine());
            } catch(NumberFormatException e) {
                e.printStackTrace();
                continue;
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            break;
        }
        return value;
        }

        public static void close() {
            //TO DO
        }
}
