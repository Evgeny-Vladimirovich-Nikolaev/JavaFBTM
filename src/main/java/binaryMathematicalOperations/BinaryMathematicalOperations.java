public class BinaryMathematicalOperations {

    private int first, second;

    BinaryMathematicalOperations() {
        System.out.println("BinaryMathematicalOperations was created");
        ValueReceiver valueReceiver = new ValueReceiver();
        first = valueReceiver.getFirstValue();
        second = valueReceiver.getSecondValue();
    }

}

