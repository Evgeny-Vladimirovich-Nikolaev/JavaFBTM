import java.text.MessageFormat;

public class MyArrayDataException extends Exception {

    public MyArrayDataException() {
        super();
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int rows, int columns, String value, Throwable throwable) {
       super(MessageFormat.format(
                "В ячейке [{0}][{1}] массива String содержатся неверные данные: \"{2}\"",
                rows,
                columns,
                value),
            throwable);
    }
}
