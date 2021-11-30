public class SquareMatrix extends Matrix {

    SquareMatrix() {
        super();
    }

    SquareMatrix(int lines) {
        super(lines, lines);
    }

    protected int findDeterminant(int[][] arr) {
        int dtr = 0;
        if (arr.length == 1) {
            return arr[0][0];
        } else {
            for (int j = 0; j < arr.length; j++) {
                int multiplier = 1;
                if (j % 2 == 1) {
                    multiplier = -1;
                }
                dtr += arr[j][0] * findDeterminant(new MinorGetter(arr, j).getMinor()) * multiplier;
            }
        }
        return dtr;
    }
}

class MinorGetter {

    private int[][] sourceArray;
    private int[][] minor;
    private int columnElem;

    MinorGetter(int[][] sourceArray, int columnElem) {
        this.sourceArray = sourceArray;
        this.columnElem = columnElem;
        minor = new int[sourceArray.length - 1][sourceArray.length - 1];
    }

    int[][] getMinor() {
        for (int srcRow = 0, destRow = 0; srcRow < sourceArray.length; srcRow++) {
            if (srcRow != columnElem) {
                System.arraycopy(sourceArray[srcRow], 1, minor[destRow++], 0, minor.length);
            }
        }
        return minor;
    }
}

