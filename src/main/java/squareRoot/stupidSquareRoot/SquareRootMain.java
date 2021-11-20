public class SquareRootMain {

    static int num;

    public static void main(String[] args) {
        do {
            initValue();
            calculate();
        } while(resume());
    }

    static void initValue() {
        while(true) {
            NumberReceiver numberReceiver = new NumberReceiver();
            num = numberReceiver.receiveInt(Message.INIT_NOT_NEGATIVE.getMsg()
                    + Message.CONDITION_2.getMsg());
            if(num < 0) {
                continue;
            }
            break;
        }
    }

    static void calculate() {
        System.out.println(new RootFinder(num));
    }

    static boolean resume() {
        int choice;
        while(true) {
            NumberReceiver numberReceiver = new NumberReceiver();
            choice = numberReceiver.receiveInt(Message.RESUME.getMsg());
            if(choice < 0 || choice > 1) {
                continue;
            }
            break;
        }
        return choice == 1;
    }
}
