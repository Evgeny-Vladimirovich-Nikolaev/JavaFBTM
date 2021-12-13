public class MyArrayDataException extends Exception{

    public MyArrayDataException() {
        super();
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(int rows, int columns) {
        super("В ячейке [" + rows + "][" + columns + "] массива String содержатся неверные данные");
    }
}
