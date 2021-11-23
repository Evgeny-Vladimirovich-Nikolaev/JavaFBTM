import java.util.Arrays;

public class ArrayRunner {

    private double[] arr;

    ArrayRunner(int len) {
        if (initArray(len)) {
            fillArray();
            while (chooseOperation()) ;
        }
    }

    private boolean initArray(int len) {
        try {
            this.arr = new double[len];
        } catch (OutOfMemoryError mEx) {
            System.out.println(Message.ARRAY_OUT_MEMORY.getMsg());
            return false;
        }
        return true;
    }

    private void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println(Message.ARRAY_LENGTH.getMsg() + arr.length);
    }

    private boolean chooseOperation() {
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

    private void showMin() {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.println(String.format(
                Message.EXTREME_VAL.getMsg(),
                "Минимальное",
                arr[min],
                min));
    }

    private void showMax() {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println(String.format(
                Message.EXTREME_VAL.getMsg(),
                "Максимальное",
                arr[max],
                max));
    }

    private void calculateAvg() {
        double avg = 0.0;
        for (double v : arr) {
            avg += v;
        }
        System.out.println(Message.AVG.getMsg() + (avg / arr.length));
    }

    private void showArray() {
        try {
            System.out.println(Arrays.toString(arr));
        } catch (OutOfMemoryError mEx) {
            System.out.println(Message.OPERATION_OUT_MEMORY.getMsg());
        }
    }

}