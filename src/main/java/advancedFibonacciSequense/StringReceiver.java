import java.io.IOException;

public class StringReceiver extends Receiver {

    public String receive(String conditions) {
        String temp = "";
        while(temp.length() == 0) {
            System.out.println(conditions);
            try {
                temp = inputReader.readLine();
            } catch(IOException e) {
                System.out.println(Message.IO_ERROR.getMsg());
                continue;
            } catch(Exception ex) {
                System.out.println(Message.ERROR.getMsg());
                continue;
            }
        }
        return temp;
    }
}
