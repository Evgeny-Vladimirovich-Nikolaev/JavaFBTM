public class FibonacciSequence {

    public static double getLongItem(int index) {
        double current = 1, next = 1;
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
}
