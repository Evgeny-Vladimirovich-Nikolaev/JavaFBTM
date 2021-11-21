import java.util.Arrays;

public class AdvancedSequence {

    static int index;
    static long[] cache = new long[93];

    AdvancedSequence(int ind) {
        getItem(ind);

    }

     private void getItem(int ind) {
        if(ind <= index) {
            System.out.println(String.format(Message.FIBONACCI.getMsg(), ind,  cache[ind - 1]));
            System.out.println(Message.CACHE.getMsg());
            System.out.println(Arrays.toString(cache));
        } else {
            setItem(ind);
        }
    }

    private void setItem(int ind) {
        initStartValues();
        if(ind < 94) {
            setLongItem(ind);
            System.out.println(String.format(Message.FIBONACCI.getMsg(), ind,  cache[ind - 1]));
        } else {
            setDoubleItem(ind);
        }
    }

    private void initStartValues() {
        if(index < 3) {
            cache[0] = 0;
            cache[1] = cache[2] = 1;
            index = 3;
        }
    }

    private void setLongItem(int ind) {
         ind -= index;
         while (ind-- > 0) {
             cache[index] = cache[index - 2] + cache[index++ - 1];
         }
    }

    private void setDoubleItem(int ind) {
        int temp = ind - 93;
        double current, next;
        if(index < 93) {
            setLongItem(93);
        }
        current = cache[92];
        next = current + cache[91];
        while(temp-- > 0) {
            double previous = current;
            current = next;
            next += previous;
        }
        System.out.println(String.format(Message.FIBONACCI.getMsg(), ind,  current));
    }

    private void writeMessage(String item) {

    }
}
