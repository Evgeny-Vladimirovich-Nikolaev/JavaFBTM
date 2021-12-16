import java.util.Arrays;
import java.util.Random;

/**
 * В программе определены два класса исключений. Класс MyArraySizeException наследутся от
 * RuntimeException и обрабатывает ситуацию, в которой не проверен размер входного массива данных.
 * Класс MyArrayDataException наследуется от Exception и обрабатывает ситуацию,
 * в которой входные данные не зависят от разработчика.
 */

public class ArrayParseRunner {

    private static String[][] myArray;

    public static void main(String[] args) throws MyArrayDataException {
        while (true) {
            try {
                initArray();
                fillArray();
                writeArray();
                countMatrix();
                break;
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
                System.out.println("Расчет данных для этой матрицы прекращен");
            }
        }
    }

    private static void initArray() {
        Random random = new Random();
        int rows = random.nextInt(2) + 3;
        int columns = random.nextInt(2) + 3;
        myArray = new String[rows][columns];
    }

    private static void fillArray() {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = Values.byOrdinal(random.nextInt(32)).getVal();
            }
        }
    }

    private static void writeArray() {
        for (String[] strings : myArray) {
            System.out.println(Arrays.toString(strings));
        }
    }

    private static void countMatrix() throws MyArrayDataException {
        System.out.println("Сумма значений в массиве равна "
                + (new StringArrayParser(myArray).countValues()));
    }
}
