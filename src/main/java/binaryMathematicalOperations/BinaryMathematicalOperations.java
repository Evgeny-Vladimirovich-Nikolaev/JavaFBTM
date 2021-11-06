public class BinaryMathematicalOperations {

    private int first, second;
    private String message = "Enter Y to continue or N to exit";

    BinaryMathematicalOperations() {
        initOperation();
    }

    private void initOperation(){
        do{
            initValues();
            calculate();
        }while(resume());
    }

    private void initValues(){
        ValueReceiver valueReceiver = new ValueReceiver();
        first = valueReceiver.getFirstValue();
        second = valueReceiver.getSecondValue();
    }

    private void calculate(){
        System.out.println(new Calculator (first, second));
    }

    private boolean resume(){
        boolean bool;
        System.out.println(message);
        return false;
    }
}

