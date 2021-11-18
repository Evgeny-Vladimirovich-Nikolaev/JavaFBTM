public class Fibonacci {

    public static long getLongItem(int index) {
        long current = 1, next = 1;
        if(index < 3) {
            return index - 1;
        }
        while(index-- > 2) {
            long previous = current;
            current = next;
            next += previous;
        }
        return current;
    }
}
