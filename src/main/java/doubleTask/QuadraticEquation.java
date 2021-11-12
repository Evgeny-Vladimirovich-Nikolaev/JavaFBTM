public class QuadraticEquation {

    private String message;
    private int a, b, c;
    private double discriminant, root1, root2;

    QuadraticEquation() {
        initValues();
        solveEquation();
    }

    private void initValues(){
        a = initCoef(true, Message.INIT_NOT_0_VALUE.getMsg());
        b = initCoef(false, Message.INIT_INTEGER_VALUE.getMsg());
        c = initCoef(false, Message.INIT_INTEGER_VALUE.getMsg());
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
        System.out.println(discriminant);
    }

    private void findRoots() {
        if(discriminant < 0) {
            writeMessage();
            System.out.println(QuadraticEquationExpression.getExpression(a, b, c));
        } else if(discriminant == 0) {
            root1 = countRoot(0);
            System.out.println(QuadraticEquationExpression.getExpression(a, b, c));
            //writeMessage(root1);
        } else {
            root1 = countRoot(1);
            root2 = countRoot(-1);
            System.out.println(QuadraticEquationExpression.getExpression(a, b, c));
            //writeMessage(root1, root2);
        }
    }

    private double countRoot(int multiplier) {
        System.out.println((- b + multiplier * Math.sqrt(discriminant)) / (2 * a));
        return  (- b + multiplier * Math.sqrt(discriminant)) / (2 * a);
    }

    private void writeMessage() {
        message = Message.NO_ROOTS.getMsg();
        System.out.println(message);
    }

    private void writeMessage(int r) {

    }



}
