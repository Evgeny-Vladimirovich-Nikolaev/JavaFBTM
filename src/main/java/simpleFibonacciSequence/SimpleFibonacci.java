public class SimpleFibonacci {

    static int index;

    public static void main(String[] args) {
        do {
            initIndex();
            findItem();
        } while(resume());
    }

    static void initIndex() {
        NumberReceiver numberReceiver = new NumberReceiver();
        while(index < 1) {
            index = numberReceiver.receiveInt(String.format("%s%s%s%n",
                    Message.INIT_INTEGER.getMsg(),
                    Message.CONDITION_1.getMsg(),
                    Message.CONDITION_2.getMsg()));
        }
    }

    static void findItem() {
        System.out.println(new SimpleSequence(index));
        index = 0;
    }

    static boolean resume() {
        StringReceiver receiver = new StringReceiver();
        String response = "";
        while (!"Y".equalsIgnoreCase(response) && !"N".equalsIgnoreCase(response)) {
            response = receiver.receive(Message.REQUEST.getMsg());
        }
        if(response.equalsIgnoreCase("N")) {
            StringReceiver.close();
        }
        return response.equalsIgnoreCase("Y");
    }
}

