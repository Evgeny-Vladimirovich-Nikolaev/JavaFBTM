import java.util.Arrays;

/**
 * Класс AdvancedSequence выводит в консоль запрашиваемое пользователем число последовательности Фибоначчи.
 * Для чисел с 1 по 93 используется тип long и кэширование в массиве по мере их вызова.
 * Для чисел, начиная с 94, используется тип double
 * и обращение к кэш-массиву с заполнением последнего в случае необходимости.
 */

public class AdvancedSequence {

    static long[] cache = new long[93]; // кэш-массив
    static int index;                   // порядковый номер наибольшего найденного числа;
                                        // на 1 больше индекса в массиве

    AdvancedSequence(int ind) {
        initStartValues();
        if (ind <= index) {
            getFromCache(ind);
        } else {
            getNewItem(ind);
        }
    }

    private void initStartValues() {
        if (index < 3) {
            cache[0] = 0;
            cache[1] = cache[2] = 1;
            index = 3;
        }
    }

    private void getFromCache(int ind) {
        System.out.println(String.format(Message.FIBONACCI.getMsg(), ind, cache[ind - 1]));
        System.out.println(Message.CACHE.getMsg());
        System.out.println(Arrays.toString(cache));
    }

    private void getNewItem(int ind) {
        System.out.println(String.format(Message.FIBONACCI_START.getMsg(), (index + 1)));
        if (ind < 94) {
            getLongItem(ind);
            System.out.println(String.format(Message.FIBONACCI.getMsg(), ind, cache[ind - 1]));
        } else {
            getDoubleItem(ind);
        }
    }

    private void getLongItem(int ind) {
        ind -= index;
        while (ind-- > 0) {
            cache[index] = cache[index - 2] + cache[index++ - 1];
        }
    }

    private void getDoubleItem(int ind) {
        int temp = ind - 93;
        double current, next;
        if (index < 93) {
            getLongItem(93);
        }
        current = cache[92];
        next = current + cache[91];
        while (temp-- > 0) {
            double previous = current;
            current = next;
            next += previous;
        }
        System.out.println(String.format(Message.FIBONACCI.getMsg(), ind, next));
    }
}