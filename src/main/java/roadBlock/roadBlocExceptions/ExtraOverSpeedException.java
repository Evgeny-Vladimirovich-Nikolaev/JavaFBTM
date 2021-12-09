public class ExtraOverSpeedException extends OverSpeedException{

    private int speed;

    public ExtraOverSpeedException() {
        super();
    }

    public ExtraOverSpeedException(String message) {
        super(message);
    }

    public ExtraOverSpeedException(String message, int speed) {
        super(message);
        this.speed = speed;
    }

    ExtraOverSpeedException(String message, Throwable t){
        super(message, t);
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
