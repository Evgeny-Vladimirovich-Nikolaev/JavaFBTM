public class TestQuadraticEquationExpression {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        for (int i = -2; i <= 2; i++) {
            for(int k = -2; k <= 2; k++) {
                for(int j = -1; j <=1; j++) {
                    System.out.println(QuadraticEquationExpression.getExpression(i, k, j));
                }
            }
        }
    }
}
