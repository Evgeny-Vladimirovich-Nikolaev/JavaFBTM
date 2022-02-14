public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(int rows, int columns) {
        super("В метод передан массив неправильного размера: [" + rows + "][" + columns + "]");
    }
}
