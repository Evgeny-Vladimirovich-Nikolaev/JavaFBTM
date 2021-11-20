import java.io.IOException;

public class StringReceiver extends Receiver{

    public String receive() {
        String temp = "";
        while(temp.length() == 0) {
            try {
                temp = inputReader.readLine();
            } catch (IOException e) {
                System.out.println(Message.IO_ERROR.getMsg());
                continue;
            }
        }
        return temp;
    }
}
