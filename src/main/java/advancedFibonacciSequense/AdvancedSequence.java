import java.util.Arrays;

public class AdvancedSequence {

    static int index = 1;
    static long[] sequence = new long[93];
    private long current, next;

    AdvancedSequence(int ind) {
        getItem(ind);
        setIndex(ind);

    }

     private void getItem(int ind) {
        if(ind <= index) {
            System.out.println("кэш " + sequence[ind]);
        } else {
            setItem(ind);
            System.out.println("подсчет " + sequence[ind]);
        }
    }

    private void setItem(int ind) {
        initValues();
        if(ind < 94) {
            setLongItem(ind);
        } else {
            setDoubleItem(ind);
        }
    }

    private void initValues() {
        if(index < 3) {
            current = 1L;next = 1L;
        } else {
            current = sequence[index - 1];
            next = current + sequence[index - 2];
        }
    }

    private void setLongItem(int ind) {
        long previous;
        if(ind < 3) {
            sequence[0] = 0;
            sequence[1] = sequence[2] = 1;
            if(index < ind) {
                index = 3;
            }
            writeMessage(Integer.toString(ind - 1));
            return;
        }
        ind -= index;
        while(ind-- > 0) {
            sequence[index] = sequence[index - 2] + sequence[index++ - 1];
        }
        writeMessage(Long.toString(current));
    }

    private void setDoubleItem(int ind) {

    }

    private void setIndex(int ind) {
        // if()
    }

    private void writeMessage(String item) {

    }
}
