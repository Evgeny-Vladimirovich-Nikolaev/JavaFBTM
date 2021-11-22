public class AdvancedFibonacciSequence {

    private static int index;

    public static void main(String[] args) {
        do {
            initIndex();
            findItem();
        } while (resume());
    }

    private static void initIndex() {
        NumberReceiver numberReceiver = new NumberReceiver();
        while (index < 1) {
            index = numberReceiver.receiveInt(String.format("%s%s%s",
                    Message.INIT_INTEGER.getMsg(),
                    Message.CONDITION_1.getMsg(),
                    Message.CONDITION_2.getMsg()));
        }
    }

    private static void findItem() {
        new AdvancedSequence(index);
        index = 0;
    }

    private static boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Message.REQUEST.getMsg());
        }
        if (response.equalsIgnoreCase("N")) {
            StringReceiver.close();
        }
        return response.equalsIgnoreCase("Y");
    }
}

