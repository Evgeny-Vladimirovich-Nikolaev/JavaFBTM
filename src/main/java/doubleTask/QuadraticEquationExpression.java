public class QuadraticEquationExpression {

    static String getExpression(int a, int b, int c){
        StringBuilder sb = new StringBuilder("");
        sb.append(writeNominal(a, "", "","x^2"));
        if(b > 0){
            sb.append(writeNominal(b, " + ", " ","x"));
        } else if(b < 0) {
            sb.append(writeNominal(b, " - "," " ,"x"));
        }
        if(c == 0){
            return sb.append(" = 0").toString();
        }
        if(c > 0) {
            sb.append(" + ");
        } else {
            sb.append(" - ");
        }
        sb.append(Math.abs(c));
        sb.append(" = 0");
         return sb.toString();
    }

    static String writeNominal(int nom, String operator, String space, String power) {
        StringBuilder nominal = new StringBuilder("");
        if(nom < 0) {
            nominal.append(" -");
            nominal.append(space);
        } else {
            nominal.append(operator);
        }
        if(nom < 2 && nom > -2) {
            return nominal.append(power).toString();
        } else {
            return nominal.append(Math.abs(nom)).append(power).toString();
        }
    }
}
