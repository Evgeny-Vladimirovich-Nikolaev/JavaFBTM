public class BinaryMathematicalOperations {

    private int first, second;

    BinaryMathematicalOperations() {
        ValueReceiver valueReceiver = new ValueReceiver();
        first = valueReceiver.getFirstValue();
        second = valueReceiver.getSecondValue();
        new Calculator (first, second);
    }

}

