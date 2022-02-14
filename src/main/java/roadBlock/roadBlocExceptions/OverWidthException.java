public class OverWidthException extends RuntimeException{
    private double width;

    private OverWidthException() {
        super();
    }

    public OverWidthException(String message) {
        super(message);
    }

    public OverWidthException(String message, double width) {
        super(message);
        this.width = width;
    }

    @Override
    public String getMessage() {
        if (width != 0.0) {
            return width + " м - превышение допустимой ширины автомобиля!";
        } else {
            return "Превышение допустимой ширины автомобиля!";
        }
    }
}
