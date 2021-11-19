public class DoubleTask {

    static int choice;

    public static void main(String[] args) {
        do {
            selectTask();
            solveProblem();
        } while(resume());
    }

    static void selectTask() {
        while(true) {
            System.out.println(Message.CHOOSE_ACTION.getMsg());
            choice = Receiver.receiveInt();
            if(choice < 0 || choice > 2) {
                continue;
            }
            break;
        }
    }

    static void solveProblem() {
        if(choice == 1) {
            System.out.println(new QuadraticEquation());
        } else if(choice == 2) {
            System.out.println(new Factorial());
        }
    }

    static boolean resume() {
        if(choice == 0) {
            Receiver.close();
        }
        return choice != 0;
    }
}