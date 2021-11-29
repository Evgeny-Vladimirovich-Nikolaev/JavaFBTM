import java.util.Arrays;

public class MatrixRunner {

    public static void main(String[] args) {

        SquareMatrix sm_2 = new SquareMatrix();
        sm_2.matrixArray = new int[][]{{-6, -3}, {-10, -4}};
        System.out.println(sm_2.findDeterminant(sm_2.matrixArray)); //-6

        SquareMatrix sm_3 = new SquareMatrix(3);
        sm_3.matrixArray = new int[][]{{7, 4, 9}, {0, 6, -3}, {4, -10, -4}};
        System.out.println(sm_3.findDeterminant(sm_3.matrixArray)); //-642

        SquareMatrix sm_4 = new SquareMatrix(4);
        sm_4.matrixArray = new int[][]{{-4, -2, -7, 8}, {2, 7, 4, 9}, {2, 0, 6, -3}, {6, 4, -10, -4}};
        System.out.println(sm_4.findDeterminant(sm_4.matrixArray)); //-1926

        SquareMatrix sm_5 = new SquareMatrix(5);
        sm_5.matrixArray = new int[][]{{1, 2, 3, 4, 5}, {-1, 0, 2, 5, 3}, {1, 2, 2, 4, 6}, {-3, 1, -2, 4, 3}, {1, 2, 6, 7, -8}};
        System.out.println(sm_5.findDeterminant(sm_5.matrixArray)); //-433

        SquareMatrix sm_8 = new SquareMatrix(8);
        sm_8.matrixArray = new int[][]
                {
                        {2, 5, 3, 0, -8, 3, 24, 6},
                        {-8, 6, -2, 4, 1, 5, 6, 12},
                        {8, 9, 0, -3, 4, -24, 5, 1},
                        {11, 2, 5, -5, 2, 5, 3, 10},
                        {24, 1, 3, 1, 2, -3, 2, 4},
                        {4, 1, 5, 7, 3, 4, 2, -6},
                        {3, 5, 2, 2, 7, 0, -9, 3},
                        {-3, -2, -1, 0, 1, 2, 3, 4}
                };
        System.out.println(sm_8.findDeterminant(sm_8.matrixArray));

        new MatrixPresentation(sm_3).matrixToString();

        new MatrixPresentation(sm_4).matrixToString();

        new MatrixPresentation(sm_5).matrixToString();

        SquareMatrix sm_10 = new SquareMatrix(10);
        int val = -50;
        for(int m = 0; m < 10; m++) {
            for(int n = 0; n < 10; n++) {
                sm_10.matrixArray[m][n] = (int)(Math.random() * 50);
            }
        }
        System.out.println(sm_10.findDeterminant(sm_10.matrixArray));

        int[][] arr = new int[3][3];
        System.out.println(Arrays.deepToString(arr));
    }
}
