public class MatrixRunner {

    public static void main(String[] args) {
        SquareMatrix sm = new SquareMatrix(3);
        sm.matrixArray = new int[][]{{2, -1, 3}, {-4, 3, -2}, {6, 2, 1}};
        System.out.println(sm.findDeterminant());
        SquareMatrix sm_4 = new SquareMatrix(4);
        sm_4.matrixArray = new int[][]{{-4, -2, -7, 8}, {2, 7, 4, 9}, {2, 0, 6, -3}, {6, 4, -10, -4}};
        System.out.println(sm_4.findDeterminant());
        SquareMatrix sm_2 = new SquareMatrix(2);
        sm_4.matrixArray = new int[][]{{-6, -3}, {-10, -4}};
        System.out.println(sm_4.findDeterminant());
    }
}
