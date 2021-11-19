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
            System.out.println(Message.INIT_NOT_NEGATIVE.getMsg()
                    + Message.CONDITION_2.getMsg());
            num = ValueReceiver2.receiveInt();
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
            System.out.print(Message.RESUME.getMsg());
            choice = ValueReceiver2.receiveInt();
            if(choice < 0 || choice > 1) {
                continue;
            }
            break;
        }
        return choice == 1;
    }
}
