public class Fibonacci {

    private int choose;

    Fibonacci() {
        do {
            selectTask();
        } while(resume());
    }

    private void selectTask() {
        while(choose < 0 || choose > 2) {
            System.out.println("Выберите действие");
           choose =  ValueReceiver2.receiveInt();
        }
        if(choose == 1) {
            findFibonacciItem();
        } else if(choose == 2) {
            findFibonacciSequence();
        }
    }

    private void findFibonacciItem() {

    }

    private void findFibonacciSequence() {

    }

    private boolean resume() {
        return true;
    }
}

