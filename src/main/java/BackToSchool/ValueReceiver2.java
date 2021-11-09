import java.io.*;

public class ValueReceiver2 implements Closeable {

    private int value;
    private int[] values;

    public ValueReceiver2() {
        receiveValue();
    }

    public ValueReceiver2(int[] values) {
        this.values = values;
    }

    int getValue() {
        return value;
    }

    private void receiveValue() {
        while(true) {
            System.out.println("ValueReceiver2.receiveValue()");
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
                if(br.ready()){
                    br.read();
                    String line = br.readLine();
                    value = Integer.parseInt(line);
                    System.out.println("ValueReceiver2.receiveValue()");
                    break;
                }
                continue;
            } catch(NumberFormatException e) {
                System.out.println(e);
                continue;
            } catch(Exception e) {
                System.out.println(e);
                continue;
            }
        }
    }


    @Override
    public void close() throws IOException {

    }
}
