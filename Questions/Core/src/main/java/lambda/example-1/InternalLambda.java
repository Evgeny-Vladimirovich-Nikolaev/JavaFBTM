public class InternalLambda {

    BinaryOperation adding;
    BinaryOperation multiplying;

    InternalLambda(BinaryOperation adding, BinaryOperation multiplying) {
        this.adding = adding;
        this.multiplying = multiplying;
        showLambda(23, 12, adding);
        showLambda(23, 12, multiplying);
        showMore(13, 4, adding, multiplying);
    }

    private void showLambda(int a, int b, BinaryOperation operation) {
        operation.show("Вызов лямбды из класса ");
        System.out.println("Это - " + operation + " лямбда!");
        System.out.println(operation.count(a, b));
    }

    private void showMore(int a, int b, BinaryOperation fst, BinaryOperation snd) {
        adding.show("Вызов лямбды из класса ");
        int c = adding.count(a, b);
        multiplying.show("Вызов лямбды из класса ");
        int d = multiplying.count(a, b);
        System.out.println(c + d);
    }

}
