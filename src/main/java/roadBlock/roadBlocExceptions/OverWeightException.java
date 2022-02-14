public class OverWeightException extends RuntimeException{
    private double weight;

    private OverWeightException() {
        super();
    }

    public OverWeightException(String message) {
        super(message);
    }

    public OverWeightException(String message, double weight) {
        super(message);
        this.weight = weight;
    }

    @Override
    public String getMessage() {
        if (weight != 0.0) {
            return weight + " т - превышение допустимого веса автомобиля!";
        } else {
            return "Превышение допустимого веса автомобиля!";
        }
    }
}
