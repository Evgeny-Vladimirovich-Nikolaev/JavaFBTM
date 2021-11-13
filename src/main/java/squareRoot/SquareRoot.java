public class SquareRoot {
    public static void main(String[] args) {
//        int sq = 1975269136;
//        for(int i = 0; i < 2147000000; i++) {
//            if((long)i * i == sq) {
//                System.out.println(i + " корень найден");
//            }
//        }
        int k = 46383647;
        System.out.println(k);
        for(int i = 0; i < 35; i++) {
            k >>=1;
            System.out.println(k);
        }
        k = 46383647;
        System.out.println(k);
        for(int i = 0; i < 35; i++) {
            k >>>=1;
            System.out.println(k);
        }
    }
}
