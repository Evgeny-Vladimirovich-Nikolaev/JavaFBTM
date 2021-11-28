public class SquareMatrix extends Matrix {

    private int determinant = 0;

    SquareMatrix (int lines) {
        super(lines, lines);
    }

    int findDeterminant_3x3() {
        for(int column = 0; column < columns; column++) {
            int temp = 1;
            for (int i = 0, j = column; i < rows; i++) {
                temp *= matrixArray[i][j];
                j++;
                j %= columns;
            }
            determinant += temp;
        }
        for(int column = 0; column < columns; column ++) {
            int temp = 1;
            for(int i = rows - 1, j = column; i >= 0; i--) {
                temp *= matrixArray[i][j];
                j++;
                j %= columns;
            }
            determinant -= temp;
        }
        return determinant;
    }

    protected int findDeterminant(int[][] arr) {
        int dtr = 0;
        if(arr.length == 1) {
            return arr[0][0];
        } else {
            for(int j = 0; j < arr.length; j++) {
                int multiplyer = 1;
                if( j %2 == 1) {
                    multiplyer = -1;
                }
                dtr += arr[0][j] * findDeterminant(getMinor(j, arr)) * multiplyer;
            }
        }
        return dtr;
    }

    private int[][] getMinor(int column, int[][] ancestor) {
        int[][] minor = new int[ancestor.length - 1][ancestor.length - 1];
        for(int j = 0; j < ancestor.length; j++) {
            for(int vector = 0; vector < ancestor.length; vector++) {
                if(vector == j) {
                    continue;
                } else {
                    for(int i = 0; i < minor.length; i++) {
                        minor[i][vector] = ancestor[i + 1][j];
                    }
                }
            }
        }
        return minor;
    }
}
