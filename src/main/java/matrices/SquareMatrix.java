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
