/**
 * Программа содержит два метода для вычисления детерминанта
 * матриц третьего порядка. В методах используется
 * т.н. способ треугольника, но реализация отличается.
 * В соответствии с практикой TDD тесты написаны заранее.
 */
public class TestDrivenDeterminant {
    public int findBySeparateActions(int[][] matrix) {
        if(matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("""
        Метод findBySeparateActions находит детерминант
        только в матрицах размером 3x3
        """);
        }
        return  matrix[0][0] * matrix[1][1] * matrix[2][2]
                + matrix[0][1] * matrix[1][2] * matrix[2][0]
                + matrix[0][2] * matrix[1][0] * matrix[2][1]
                - matrix[0][2] * matrix[1][1] * matrix[2][0]
                - matrix[0][1] * matrix[1][0] * matrix[2][2]
                - matrix[0][0] * matrix[1][2] * matrix[2][1];
    }

    public int findByCycle (int[][] matrix) {
        if(matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("""
        Метод findByCycle находит детерминант
        только в матрицах размером 3x3
        """);
        }
        int determinant = 0;
        for(int column = 0; column < 3; column++) {
            int temp = 1;
            for (int i = 0, j = column; i < 3; i++) {
                temp *= matrix[i][j];
                j++;
                j %= 3;
            }
            determinant += temp;
        }
        for(int column = 0; column < 3; column ++) {
            int temp = 1;
            for(int i = 2, j = column; i >= 0; i--) {
                temp *= matrix[i][j];
                j++;
                j %= 3;
            }
            determinant -= temp;
        }
        return determinant;
    }
}
