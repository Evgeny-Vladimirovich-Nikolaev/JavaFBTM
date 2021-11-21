public class SimpleSequence {

    private String message;

    SimpleSequence(int index) {
        if(index < 94){
            setLongItem(index);
        } else {
            setDoubleItem(index);
        }
    }

    private void setLongItem(int index) {
        long current = 1,
                next = 1;
        if(index < 3) {
            writeMessage(index, (index - 1));
            return;
        }
        while(index-- > 2) {
            long previous = current;
            current = next;
            next += previous;
        }
        writeMessage(index, current);
    }

    private void setDoubleItem(int index) {
        double current = 1,
                next = 1;
        while(index-- > 2) {
            double previous = current;
            current = next;
            next += previous;
        }
        writeMessage(index, current);
    }

    private void writeMessage(int index, long item) {
        message = String.format(Message.FIBONACCI.getMsg(), index, item);
    }

    private void writeMessage(int index, double item) {
        message = Double.toString(item);
    }

    @Override
    public String toString() {
        return message;
    }
}
