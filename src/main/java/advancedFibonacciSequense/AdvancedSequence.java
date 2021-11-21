public class AdvancedSequence {

    static int index = 0;
    static long[] sequence = new long[93];
    private long previous, current;

    AdvancedSequence(int ind) {
        getItem(ind);
        setIndex(ind);
    }

     private void getItem(int ind) {
        if(ind <= index) {
            writeMessage(Long.toString(sequence[ind - 1]));
        } else {
            setItem(ind);
        }
    }

    private void setItem(int ind) {
        if(ind < 94) {
            setLongItem(ind);
        } else {
            initValues();
            setDoubleItem(ind);
        }
    }

    private void setLongItem(int ind) {
        previous = 1;
        current = 1;
        long next;
        if(ind < 3) {
            sequence[ind - 1] = ind - 1;
            writeMessage(Integer.toString(ind - 1));
            return;
        }
        while(ind-- > 2) {

        }
    }

    private void initValues() {

    }

    private void setDoubleItem(int ind) {

    }

    private void setIndex(int ind) {
        // if()
    }

    private void writeMessage(String item) {

    }
}
