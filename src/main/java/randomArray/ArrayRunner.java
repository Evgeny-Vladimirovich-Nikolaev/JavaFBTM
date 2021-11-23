import java.util.Arrays;

public class ArrayRunner {

    private double[] arr;

    ArrayRunner (int len) {
        this.arr = new double[len];
        fillArray();
        while(chooseAction());
    }

    private void fillArray() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
    }

    private boolean chooseAction() {
        NumberReceiver numberReceiver = new NumberReceiver();
        int choice = -1;
        while (choice < 0 || choice > 4) {
            choice = numberReceiver.receiveInt(Message.CHOOSE_ARRAY_ACTION.getMsg());
        }
        initOperation(choice);
        return choice != 0;
    }

    private void initOperation(int choice) {
        switch (choice) {
            case 1 -> showMin();
            case 2 -> showMax();
            case 3 -> calculateAvg();
            case 4 -> showArray();
        }
    }

    private void showMax() {

    }

    private void calculateAvg() {

    }

    private void showMin() {

    }

    private void showArray() {
        System.out.println(Arrays.toString(arr));
    }

}