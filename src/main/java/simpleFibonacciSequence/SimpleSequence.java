public class SimpleSequence {

    private double item;
    private String message;

    SimpleSequence(int index) {
        if(index < 93){
            item = getLongItem(index);
        } else {
            item = getDoubleItem(index);
        }
        message = writeMessage(index);
    }

    public double getLongItem(int index) {
        double current = 1,
                next = 1;
        if(index < 3) {
            return index - 1;
        }
        while(index-- > 2) {
            double previous = current;
            current = next;
            next += previous;
        }
        return current;
    }



    public double getDoubleItem(int index) {
        double current = 1,
                next = 1;
        if(index < 3) {
            return index - 1;
        }
        while(index-- > 2) {
            double previous = current;
            current = next;
            next += previous;
        }
        return current;
    }

    private String writeMessage(int index) {
        return Double.toString(item);
    }

    @Override
    public String toString() {
        return message;
    }
}
