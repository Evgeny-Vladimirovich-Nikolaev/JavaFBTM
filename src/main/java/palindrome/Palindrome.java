public class Palindrome {
    public static void main(String[] args) {
        System.out.println("qwerrewq" + " is " + check("qwerrewq"));
        System.out.println("qwertrewq" + " is " + check("qwertrewq"));
        System.out.println("qwerdtrewq" + " is " + check("qwerdtrewq"));
    }

    private static boolean check(String s) {
        for(int i = 0, k = s.length() - 1; i <= k; i++, k--) {
            if(s.charAt(i) != s.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
