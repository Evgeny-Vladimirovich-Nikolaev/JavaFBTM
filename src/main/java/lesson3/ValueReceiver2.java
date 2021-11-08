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
        return 0;
    }

    private void receiveValue() {
        while(true) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) {
                @Override
                public int read() throws IOException {
                    System.out.println("read()");
                    return 00;

                }
            }) {
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException e");
            } catch (Exception e) {
                System.out.println("Exception e");
            }
        }
    }

    @Override
    public void close() throws IOException {
        System.out.print("public void close() throws IOException");
    }
}
