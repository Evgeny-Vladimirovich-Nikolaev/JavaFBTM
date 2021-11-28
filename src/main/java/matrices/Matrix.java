import java.util.Arrays;

public class Matrix {

    int rows, columns;
    int[][] matrixArray;

    Matrix () {
        this.rows = 2;
        this.columns = 2;
        this.matrixArray = new int[2][2];
    }

    Matrix (int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrixArray = new int[columns][rows];
    }

    Matrix (int[][] matrixArray) {
        this.rows = matrixArray.length;
        this.columns = matrixArray[0].length;
        this.matrixArray = matrixArray;
        System.out.println(this.getClass());
        System.out.println(this.toString());
    }

    Matrix add (int[][] another) {
        int[][] sum = new int[rows][columns];
        if(!checkArray(another)) {
            System.out.println("null");
            return null;
        }
        for(int i = 0; i < sum.length; i++) {
            for(int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixArray[i][j] + another[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
        return new Matrix(sum);
    }

    private boolean checkArray(int[][] another) {
        return this.matrixArray.length == another.length
                && this.matrixArray[0].length == another[0].length;
    }
}
