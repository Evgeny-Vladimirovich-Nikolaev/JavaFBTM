public class QuadraticEquation {

    private String message;
    private int a, b, c;
    private double discriminant, root1, root2;

    QuadraticEquation() {
        initValues();
        solveEquation();
    }

    private void initValues(){
        a = initCoef(true, Message.INIT_NOT_0.getMsg());
        b = initCoef(false, Message.INIT_INTEGER.getMsg());
        c = initCoef(false, Message.INIT_INTEGER.getMsg());
    }

    private int initCoef(boolean not_0, String msg) {
        int coef;
        while(true) {
            System.out.println(msg);
            coef = ValueReceiver2.receiveInt();
            if(coef == 0 && not_0) {
                System.out.println(Message.INVALID_COEFFICIENT.getMsg());
                continue;
            }break;
        }
        return coef;
    }

    private void solveEquation() {
        findDiscriminant();
        findRoots();
    }

    private void findDiscriminant() {
        discriminant = Math.pow(b, 2) - 4 * a * c;
    }

    private void findRoots() {
        if(discriminant < 0) {
            writeMessage();
        } else if(discriminant == 0) {
            root1 = countRoot(0);
            writeMessage(root1);
        } else {
            root1 = countRoot(1);
            root2 = countRoot(-1);
            writeMessage(root1, root2);
        }
    }

    private double countRoot(int multiplier) {
        return  (- b + multiplier * Math.sqrt(discriminant)) / (2 * a);
    }

    private void writeMessage() {
        message = Message.EQUATION.getMsg()
                + QuadraticEquationExpression.getExpression(a, b, c)
                + Message.NO_ROOTS.getMsg();
    }

    private void writeMessage(double r) {
        message = Message.EQUATION.getMsg()
                + QuadraticEquationExpression.getExpression(a, b, c)
                + Message.ONE_ROOT.getMsg()
                + formatResult(r);
    }

    private void writeMessage(double r1, double r2) {
        message = Message.EQUATION.getMsg()
                + QuadraticEquationExpression.getExpression(a, b, c)
                + Message.TWO_ROOTS.getMsg()
                + formatResult(r1)
                + "\nx2 = "
                + formatResult(r2);
    }

    private StringBuilder formatResult(double r) {
        StringBuilder res = new StringBuilder(Double.toString(r));
        if(".0".equals(res.substring(res.length()-2))){
            res.delete(res.length()-2, res.length());
        }
        return res;
    }

    @Override
    public String toString() {
        return message;
    }
}

class QuadraticEquationExpression {

    static String getExpression(int a, int b, int c){
        StringBuilder sb = new StringBuilder();
        sb.append(writeNominal(a, "", "","x^"));
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
        StringBuilder nominal = new StringBuilder();
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

