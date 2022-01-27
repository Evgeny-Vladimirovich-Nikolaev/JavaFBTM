/**
 * Программа содержит два метода для вычисления детерминанта
 * матриц третьего порядка. В методах используется
 * т.н. способ треугольника, но реализация отличается.
 * В соответствии с практикой TDD тесты написаны заранее.
 */
public class TestDrivenDeterminant {

    public int findBySeparateActions(int[][] matrix) {
        if(matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException();
        }
        return  matrix[0][0] * matrix[1][1] * matrix[2][2]
                + matrix[0][1] * matrix[1][2] * matrix[2][0]
                + matrix[0][2] * matrix[1][0] * matrix[2][1]
                - matrix[0][2] * matrix[1][1] * matrix[2][0]
                - matrix[0][1] * matrix[1][0] * matrix[2][2]
                - matrix[0][0] * matrix[1][2] * matrix[2][1];
    }

    public int findByCycle (int[][] matrix) {
        int determinant = 0;
        for(int column = 0; column < matrix.length; column++) {
            int temp = 1;
            for (int i = 0, j = column; i < matrix.length; i++) {
                temp *= matrix[i][j];
                j++;
                j %= matrix.length;
            }
            determinant += temp;
        }
        for(int column = 0; column < matrix.length; column ++) {
            int temp = 1;
            for(int i = matrix.length - 1, j = column; i >= 0; i--) {
                temp *= matrix[i][j];
                j++;
                j %= matrix.length;
            }
            determinant -= temp;
        }
        return determinant;
    }
}
