public class DoubleTask {

    static int choice;

    public static void main(String[] args) {
        selectTask();
        solveProblem();
    }

    static void selectTask() {
        while(true) {
            System.out.println(Message.CHOOSE_ACTION.getMsg());
            choice = ValueReceiver2.receiveInt();
            if(choice < 0 || choice > 2) {
                continue;
            }
            break;
        }
    }

    static void solveProblem() {
        if(choice == 1) {
            new QuadraticEquation();
        } else if(choice == 2) {
            System.out.println(new Factorial());
        }
        else {
            ValueReceiver2.close();
        }
    }
}