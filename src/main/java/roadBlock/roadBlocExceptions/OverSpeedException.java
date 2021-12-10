public class OverSpeedException extends RuntimeException{

    private int speed;

    public OverSpeedException() {
        super();
    }

    public OverSpeedException (String message) {
        super(message);
    }

    public OverSpeedException(String message, int speed) {
        super(message);
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (speed != 0) {
            return speed + "км/ч - превышение скорости!";
        } else {
            return "Превышение скорости!";
        }
    }
}
