public class Matrix {

    private int rows, columns;
    int[][] matrix;

    Matrix (int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[columns][rows];
    }
}
