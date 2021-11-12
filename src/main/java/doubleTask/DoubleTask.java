public class DoubleTask {

    static int choice;

    public static void main(String[] args) {
        while(true){
            selectTask();
            solveProblem();
            if(choice != 0){
                continue;
            }
            ValueReceiver2.close();
            break;
        }
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
            System.out.println(new QuadraticEquation());
        } else if(choice == 2) {
            System.out.println(new Factorial());
        }
        else {
            ValueReceiver2.close();
        }
    }
}