public class QuadraticEquation {

    private String message;
    private int a, b, c, root1, root2;
    private double discriminant;

    QuadraticEquation() {
        initValues();
        solveEquation();
    }

    private void initValues(){
        a = initCoef(true);
        b = initCoef(false);
        c = initCoef(false);
    }

    private int initCoef(boolean not_0) {
        int coef;
        while(true) {
            //System.out.println(Message.INIT_POSITIVE_VALUE.getMsg());
            coef = ValueReceiver2.receiveInt();
            if(coef == 0 && not_0) {
                System.out.println("Этот коэффициент не может быть равен 0");
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
            //writeMessage();
        } else if(discriminant > 0) {
            root1 = countRoot(0);
            //writeMessage(root1);
        } else {
            root1 = countRoot(1);
            root2 = countRoot(-1);
           // writeMessage(root1, root2);
        }
    }

    private int countRoot(int multiplier) {
        System.out.println((multiplier * Math.sqrt(Math.pow(b, 2) - (4 * a * c)) - b)  / a / 2 + "ответ");
        return (int) (multiplier * Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / a / 2);
    }

}
