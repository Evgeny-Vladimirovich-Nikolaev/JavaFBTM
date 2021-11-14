public class SquareRoot {
    public static void main(String[] args) {
        for(int i = 0; i < 45000; i++) {
            System.out.print(i + " " + (i * i) + " " + findRoot(i * i) + " ");
            System.out.println( i == findRoot(i * i));
        }
    }

    private static int findRoot(int num) {
        int res = 0;
        int bit =  1 << 30;
        while (bit != 0) {
            if(num >= res + bit) {
                num -= res + bit;
                res = (res >> 1) + bit;
            } else {
                res >>= 1;
            }
            bit >>= 2;
            }
        return res;
        }
    }

