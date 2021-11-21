public class SimpleSequence {

    private int index;
    private String message;

    SimpleSequence(int index) {
        this.index = index;
        if(index < 94) {
            setLongItem(index);
        } else {
            setDoubleItem(index);
        }
    }

    private void setLongItem(int ind) {
        long current = 1L,
                next = 1L;
        if(ind < 3) {
            writeMessage(Integer.toString(ind - 1));
            return;
        }
        while(ind-- > 2) {
            long previous = current;
            current = next;
            next += previous;
        }
        writeMessage(Long.toString(current));
    }

    private void setDoubleItem(int ind) {
        double current = 1L,
                next = 1L;
        while(ind-- > 2) {
            double previous = current;
            current = next;
            next += previous;
        }
        writeMessage(Double.toString(current));
    }

    private void writeMessage(String item) {
        message = String.format(Message.FIBONACCI.getMsg(), index, item);
    }

    @Override
    public String toString() {
        return message;
    }
}
