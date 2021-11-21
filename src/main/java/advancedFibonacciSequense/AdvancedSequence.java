public class AdvancedSequence {

    static int index = 0;
    static long[] sequence = new long[93];

    AdvancedSequence(int ind) {
        setItem(ind);
        setIndex(ind);
    }

     private void setItem(int ind) {
        if(ind <= index) {
            //sequence[ind - 1];
        } else {
            return;
        }
    }

    private void setIndex(int ind) {
        // if()
    }

    private void writeMessage(String item) {

    }
}
