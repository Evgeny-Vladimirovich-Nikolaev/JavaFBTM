public class SquareRootMain {

    public static int num;

    public static void main(String[] args) {

        do {
            initValue();
            calculate();
        } while(resume());
    }

    static void initValue() {
        while(true) {
            System.out.println(Message.INIT_NOT_NEGATIVE.getMsg());
            num = ValueReceiver2.receiveInt();
            if(num < 0) {
                continue;
            }break;
        }
    }

    static void calculate() {

    }

    static boolean resume() {
        return true;
    }
}
