import java.util.Arrays;

public class ArrayRunner {

    private double[] arr;

    ArrayRunner (int len) {
        this.arr = new double[len];
        fillArray();
        while(chooseOperation());
    }

    private void fillArray() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Создан массив размером " + arr.length + " элементов");
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
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[min]) {
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
            if(arr[i] > arr[max]) {
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
        System.out.println("Среднее значение в массиве равно " + (avg / arr.length));
    }

    private void showArray() {
        System.out.println(Arrays.toString(arr));
    }

}