public class ConverterRunner {

    public static void main(String[] args) {
        new Controller().initActions();
        Receiver.close();
    }

}
