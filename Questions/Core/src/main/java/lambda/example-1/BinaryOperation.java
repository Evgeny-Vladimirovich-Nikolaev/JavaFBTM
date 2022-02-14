@FunctionalInterface
public interface BinaryOperation {

    default void show(String info) {
        System.out.println(info + getClass());
    }

    int count(int a, int b);

 }
