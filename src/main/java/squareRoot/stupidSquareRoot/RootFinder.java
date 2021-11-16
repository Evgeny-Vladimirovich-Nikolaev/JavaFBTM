/**
 * В классе производится подбор значения квадратного корня путем бинарного поиска.
 * В методе countMaximum() определяется начальный максимум,
 * начальный минимум задается значением 2
 */


public class RootFinder
{
    private int num, max, root;               //входное значение, максимум, квадратный корень
    private int min = 2;                            //начальный минимум
    private String message;

    RootFinder(int num) {
        this.num = num;
        if(chekNum()) {
            countMaximum();
            findRoot();
        }
    }

    private boolean chekNum() {
        if(num < 2) {
            root = num;
            writeMessage(true);
        }
        return num > 1;
    }

    //начальный максимум определяется по количеству значимых битов входного числа (num)
    // количество значимых битов максимума описывается формулой bits(num) / 2 + 1
    private void countMaximum() {
        int temp =  max = num;
        int counter = 0;
        while(temp > 0) {
            temp >>= 1;
            counter++;
        }
        counter /= 2;
        max >>= --counter;
    }

    private void findRoot() {
        while(min != max) {
            int avg = (max + min) / 2;
            if((long)avg * avg > num) {
                max = avg;
            } else if((long)avg * avg < num) {
                if(min < avg)  {
                    min = avg;
                } else {
                    break;
                }
            } else {
                root = avg;
                writeMessage(true);
                return;
            }
        }
        writeMessage(false);
    }

    private void writeMessage(boolean isRational) {
        if(isRational) {
            message = String.format(Message.RATIONAL_ROOT.getMsg(), num, root);
        } else {
            message = String.format(Message.IRRATIONAL_ROOT.getMsg(), num);
        }
    }

    @Override
    public String toString() {
        return message;
    }
}
