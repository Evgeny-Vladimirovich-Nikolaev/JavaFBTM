public class MatrixDemo {

    void demonstrateMatrices() {
        int[][] a = new int[][]{{2, 3, 4, -5, -13}, {1, 2, 3, 5, 6}, {24, 3, -79, 2, 4}};
        Matrix aa= new Matrix(a);
        new MatrixPresentation(aa).matrixToString();
        int[][] b = new int[][]{{2, 3, 4}, {1, 2, 3}, {1, 2, 3}};
        Matrix bb= new Matrix(b);
        new MatrixPresentation(bb).matrixToString();
        Matrix cc = aa.multiplyByMatrix(bb);
        new MatrixPresentation(cc).matrixToString();
        randomMatrices();
    }

    private void randomMatrices() {
        int[][] twoDemArr;
        for(int i = 0; i < 3; i++) {
            int rows = (int)(Math.random() * 5) + 1;
            int columns = (int)(Math.random() * 5) + 1;
            twoDemArr = new int[rows][columns];
            fillArray(twoDemArr);
            new MatrixPresentation(new Matrix(twoDemArr)).toString();
        }
    }

    private void fillArray(int[][] twoDemArr) {
        for(int row = 0; row < twoDemArr.length; row++) {
            for(int column = 0; column < twoDemArr[0].length; column++) {
                twoDemArr[row][column] = (int)(Math.random() * 200) - 100;
            }
        }
    }
}
