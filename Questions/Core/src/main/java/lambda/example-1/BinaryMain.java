public class BinaryMain {

    public static void main(String[] args) {
        BinaryOperation adding = (a, b) -> a + b;
        BinaryOperation multiply = (a, b) -> a * b;
        showLambda(8, 14, adding);
        showLambda(8, 12, multiply);

        simpleLambda(3, 4);

        InternalLambda internalLambdaAsClass = new InternalLambda(adding, multiply);
    }

    private static void showLambda(int a, int b, BinaryOperation operation) {
        operation.show("Вызов лямбды из класса ");
        System.out.println("Это - " + operation + " лямбда!");
        System.out.println(operation.count(a, b));
    }

    private static void simpleLambda(int a, int b) {
        System.out.println((BinaryOperation) (a1, b1) -> a1 ^ b1);
    }
}
