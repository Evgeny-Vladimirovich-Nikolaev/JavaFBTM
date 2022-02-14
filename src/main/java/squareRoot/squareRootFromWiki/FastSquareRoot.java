public class FastSquareRoot {
    public static void main(String[] args) {
        for(int i = 0; i < 45000; i += 111) {
            System.out.println( i + " --> " );
            findRoot((long)i * i);
       }
    }
    public static int findRoot(Long num) {
        int res = 0;
        int bit =  1 << 30;
        System.out.println(num);
        while (bit != 0) {
            if(num >= res + bit) {
                num -= res + bit;
                res = (res >> 1) + bit;
            } else {
                res >>= 1;
            }
            bit >>= 2;
        }
        System.out.println(res);
        return res;
        }
    }

