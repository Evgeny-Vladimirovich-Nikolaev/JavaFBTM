public class Matrix {

    private int rows, columns;
    int[][] matrixArray;

    Matrix () {
        matrixArray = new int[2][2];
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
    }

    Matrix add (int[][] another) {
        int[][] sum = new int[rows][columns];
        if(this.matrixArray.length != another.length
        || this.matrixArray[0].length != another[0].length) {
            return null;
        }
        for(int i = 0; i < sum.length; i++) {
            for(int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixArray[i][j] + another[i][j];
            }
        }
        return new Matrix(sum);
    }
}
