public class RandomArray {

    public static void main(String[] args) {
        do {
            initArray();
        } while (resume());
    }

    private static void initArray() {
        int arrLength = 0;
        while (arrLength < 1) {
            NumberReceiver numberReceiver = new NumberReceiver();
            arrLength = numberReceiver.receiveInt(String.format("%s%s%s",
                    Message.INIT_INTEGER.getMsg(),
                    Message.CONDITION_1.getMsg(),
                    Message.CONDITION_2.getMsg()));
        }
        new ArrayRunner(arrLength);
    }

    private static boolean resume() {
        String response = "";
        StringReceiver stringReceiver = new StringReceiver();
        while(!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = stringReceiver.receive(Message.REQUEST.getMsg());
        }
        if("Y".equalsIgnoreCase(response)) {
            Receiver.close();
        }
        return "N".equalsIgnoreCase(response);
    }
}