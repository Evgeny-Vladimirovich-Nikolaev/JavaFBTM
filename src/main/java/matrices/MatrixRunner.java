public class MatrixRunner {

    public static void main(String[] args) {
        SquareMatrix sm = new SquareMatrix(3);
        sm.matrixArray = new int[][]{{2, -1, 3}, {-4, 3, -2}, {6, 2, 1}};
        System.out.println(sm.findDeterminant());
        SquareMatrix sm_4 = new SquareMatrix(4);
        sm_4.matrixArray = new int[][]{{-4, -2, -7, 8}, {2, 7, 4, 9}, {2, 0, 6, -3}, {6, 4, -10, -4}};
        System.out.println(sm_4.findDeterminant());
        SquareMatrix sm_2 = new SquareMatrix(2);
        sm_2.matrixArray = new int[][]{{-6, -3}, {-10, -4}};
        System.out.println(sm_2.findDeterminant());
        SquareMatrix sm_3 = new SquareMatrix(3);
        sm_3.matrixArray = new int[][]{{7, 4, 9}, {0, 6, -3}, {4, -10, -4}};
        System.out.println(sm_3.findDeterminant());
        SquareMatrix sm_5 = new SquareMatrix(5);
        sm_5.matrixArray = new int[][]{{1, 2, 3, 4, 5}, {-1, 0, 2, 5, 3}, {1, 2, 2, 4, 6}, {-3, 1, -2, 4, 3}, {1, 2, 6, 7, -8}};
        System.out.println(sm_5.findDeterminant());
    }
}
