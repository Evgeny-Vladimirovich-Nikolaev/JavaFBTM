public class SimpleFibonacci {

    private static int index;

    public static void main(String[] args) {
        do {
            initIndex();
            findItem();
        } while(resume());
    }

    private static void initIndex() {
        while(index < 1) {
            System.out.printf("%s%s%s%n",
                    Message.INIT_INTEGER.getMsg(),
                    Message.CONDITION_1.getMsg(),
                    Message.CONDITION_2.getMsg());
            index = Receiver.receiveInt();
        }
    }

    private static void findItem() {
        System.out.println(new SimpleSequence(index));
        index = 0;
    }

    private static boolean resume() {
        return true;
    }
}

