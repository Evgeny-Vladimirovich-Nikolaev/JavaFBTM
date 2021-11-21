public class SimpleSequence {

    private int index;
    private String message;

    SimpleSequence(int index) {
        this.index = index;
        if(index < 94){
            setLongItem(index);
        } else {
            setDoubleItem(index);
        }
    }

    private void setLongItem(int ind) {
        long current = 1,
                next = 1;
        if(ind < 3) {
            writeMessage(ind - 1);
            return;
        }
        while(ind-- > 2) {
            long previous = current;
            current = next;
            next += previous;
        }
        writeMessage(current);
    }

    private void setDoubleItem(int ind) {
        double current = 1,
                next = 1;
        while(ind-- > 2) {
            double previous = current;
            current = next;
            next += previous;
        }
        writeMessage(current);
    }

    private void writeMessage(long item) {
        message = String.format(Message.FIBONACCI.getMsg(), index, item);
    }

    private void writeMessage(double item) {
        message = String.format(Message.FIBONACCI.getMsg(), index, item);
    }

    @Override
    public String toString() {
        return message;
    }
}
