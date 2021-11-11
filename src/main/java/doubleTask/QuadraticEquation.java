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
                System.out.println("Первый коэффициент не может быть равен 0");
                continue;
            }break;
        }
        return coef;
    }

    private void solveEquation() {
        checkVariables();
        findDiscriminant();
        findRoots();
    }

    private void checkVariables() {
        System.out.println((a + " " + b + " " + c));
    }

    private void findDiscriminant() {
        discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminant);
    }

    private void findRoots() {
        if(discriminant < 0) {
            //writeMessage();
        } else if(discriminant > 0) {
            root1 = countRoot(1);
            root2 = countRoot(-1);
            //writeMessage(root1, root2);
        } else {
            root1 = countRoot(0);
            // writeMessage(root1);
        }
    }

    private double countRoot(int multiplier) {
        System.out.println((- b + multiplier * Math.sqrt(discriminant)) / (2 * a));
        return  (- b + multiplier * Math.sqrt(discriminant)) / (2 * a);
    }

}
