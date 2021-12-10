public class ExtraOverSpeedException extends OverSpeedException{

    private int speed;

    public ExtraOverSpeedException() {
        super();
    }

    public ExtraOverSpeedException(String message) {
        super(message);
    }

    ExtraOverSpeedException(String message, int speed){
        super(message);
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (speed != 0) {
            return speed + "км/ч - экстремальное превышение скорости!";
        } else {
            return "Экстремальное превышение скорости!";
        }
    }
}
