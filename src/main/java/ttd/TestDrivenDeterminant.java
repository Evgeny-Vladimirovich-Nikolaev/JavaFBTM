/**
 * Программа содержит два метода для вычисления детерминанта
 * матриц третьего порядка. В методах используется
 * т.н. способ треугольника, но реализация отличается.
 * В соответствии с практикой TDD тесты написаны заранее.
 */
public class TestDrivenDeterminant {

    public int findBySeparateActions(int[][] matrix) {
        int determinant;
        if(matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException();
        }
        determinant =
                matrix[0][0] * matrix[1][1] * matrix[2][2]
                + matrix[0][1] * matrix[1][2] * matrix[2][0]
                + matrix[0][2] * matrix[1][0] * matrix[2][1]
                - matrix[0][2] * matrix[1][1] * matrix[2][0]
                - matrix[0][1] * matrix[1][0] * matrix[2][2]
                - matrix[0][0] * matrix[1][2] * matrix[2][1];
        return determinant;
    }

    public int findByCycle (int[][] matrix) {
        int determinant = 0;
        if(matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException();
        }
        return determinant;
    }
}
