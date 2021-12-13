import java.util.Random;

public class ArrayParseRunner {

    private static String[][] myArray;

    public static void main(String[] args) throws MyArrayDataException {
        boolean isCounted = false;
        do{
            initArray();
            fillArray();
            writeArray();
            try {
                countMatrix();
                isCounted = true;
            } catch (MyArraySizeException | MyArrayDataException ex) {
                System.out.println(ex);
                System.out.println("Расчет данных для этой матрицы прекращен");
            }
        } while (!isCounted );
    }

    private static void initArray() {
        Random random = new Random();
        int rows = random.nextInt(3) + 3;
        int columns = random.nextInt(3) + 3;
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
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[0].length; j++) {
                System.out.print("|"+ myArray[i][j]);
            }
            System.out.println("|");
        }
    }

    private static void countMatrix() throws MyArrayDataException {
        System.out.println("Сумма значений в массиве равна "
                + (new StringArrayParser(myArray).countValues()));
    }
}
