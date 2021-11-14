public class RootFinder
{
    private int num, max, min, root;

    RootFinder(int num) {
        this.num = num;
    }

    private void countMaximum() {
        int temp =  max = num;
        int counter = 0;
        while(temp > 0) {
            temp >>= 1;
            counter++;
        }
        counter /= 2;

    }
}
