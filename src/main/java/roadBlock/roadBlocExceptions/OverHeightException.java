public class OverHeightException extends RuntimeException {

    private double height;

    private OverHeightException() {
        super();
    }

    public OverHeightException(String message) {
        super(message);
    }

    public OverHeightException(String message, double height) {
        super(message);
        this.height = height;
    }

    @Override
    public String toString() {
        if (height != 0.0) {
            return height + "т - превышение допустимой высоты автомобиля!";
        } else {
            return "Превышение допустимой высоты автомобиля!";
        }
    }
}
