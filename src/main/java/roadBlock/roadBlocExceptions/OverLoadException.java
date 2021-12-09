public class OverLoadException extends RuntimeException{

    private double weight;

    private OverLoadException() {
        super();
    }

    public OverLoadException(String message) {
        super(message);
    }

    public OverLoadException(String message, double weight) {
        super(message);
        this.weight = weight;
    }

    @Override
    public String toString() {
        if (weight != 0.0) {
            return weight + "т - превышение допустимого веса автомобиля!";
        } else {
            return "Превышение допустимого веса автомобиля!";
        }
    }
}
