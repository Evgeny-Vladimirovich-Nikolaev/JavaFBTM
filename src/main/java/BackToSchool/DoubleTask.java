public class DoubleTask {

    private void selectTask() {
        int choise;
        while(true) {
            choise = ValueReceiver2.receiveInt();
            if(choise < 0 || choise > 2) {
                System.out.println("Выберите действие:");
                continue;
            }
            break;
        }
        if(choise == 1) new QuadraticEquation();
        else if (choise == 2) new Factorial();
    }
}
