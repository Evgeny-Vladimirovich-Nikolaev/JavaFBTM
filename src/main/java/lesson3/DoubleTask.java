public class DoubleTask {

    DoubleTask() {
        selectTask();
    }

    private void selectTask() {
        int choise;
        while(true) {
            ValueReceiver2 valueReceiver = new ValueReceiver2();
            choise = valueReceiver.getValue();
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
