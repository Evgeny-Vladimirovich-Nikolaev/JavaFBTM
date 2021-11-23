import java.util.Arrays;

public class ArrayRunner {

    private double[] arr;

    ArrayRunner (int len) {
        this.arr = new double[len];
        fillArray();
        do {
            chooseAction();
        } while (resume());
    }

    private void fillArray() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            System.out.println(arr[i]);
        }
    }

    private void chooseAction() {
        NumberReceiver numberReceiver = new NumberReceiver();
        int choice = -1;
        while (choice < 0 || choice > 4) {
            choice = numberReceiver.receiveInt(Message.CHOOSE_ARRAY_ACTION.getMsg());
        }
    }

    private void initOperation(int choice) {
        switch (choice) {
            case 1 : showMin();
            break;
        }
    }

    private void showMin() {

    }

    private void showArray() {
        System.out.println(Arrays.toString(arr));
    }

    private boolean resume() {
        return true;
    }
}