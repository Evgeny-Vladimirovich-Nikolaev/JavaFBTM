public class Fibonacci {

    private int choice;

    Fibonacci() {
        do {
            selectTask();
        } while(resume());
    }

    private void selectTask() {
        while(choice < 0 || choice > 2) {
            System.out.println("Выберите действие");
           choice =  ValueReceiver2.receiveInt();
        }
        if(choice == 1) {
            findFibonacciItem();
        } else if(choice == 2) {
            findFibonacciSequence();
        }
    }

    private void findFibonacciItem() {
        int index = -1;
        while(index < 0) {
            index = ValueReceiver2.receiveInt();
        }
        FibonacciSequence.getLongItem(index);
    }

    private void findFibonacciSequence() {

    }

    private boolean resume() {
        if(choice != 0) {
            selectTask();
        }
        return choice !=0 ;
    }
}

