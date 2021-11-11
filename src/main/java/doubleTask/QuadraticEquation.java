public class QuadraticEquation {

    private int a, b, c, root1, root2;
    double discriminant;

    QuadraticEquation() {
        initValues();
        solveEquation();
    }

    private void initValues(){
        a = initCoef(true);
        b = initCoef(false);
        c = initCoef(false);
    }

    private int initCoef(boolean not0) {
        int coef;
        while(true) {
            //System.out.println(Message.INIT_POSITIVE_VALUE.getMsg());
            coef = ValueReceiver2.receiveInt();
            if(coef == 0 && not0) {
                System.out.println("Этот коэффициент не может быть равен 0");
                continue;
            }break;
        }
        return coef;
    }

    private void solveEquation() {
        findDiscriminant();
    }

    private void findDiscriminant() {
        discriminant = Math.pow(b, 2) - 4 * a * c;
    }

}
