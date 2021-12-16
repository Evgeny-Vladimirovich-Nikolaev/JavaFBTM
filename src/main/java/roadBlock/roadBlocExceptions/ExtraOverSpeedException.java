/**
 * Класс ExtraOverSpeedException наследуется от OverSpeedException.
 * При условии контроля средой разработки
 * это гарантирует правильный порядок перехвата исключений.
 */

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
    public String getMessage() {
        if (speed != 0) {
            return speed + " км/ч - экстремальное превышение скорости!\nДля задержания преступника была привлечена полиция.";
        } else {
            return "Экстремальное превышение скорости!\nДля задержания преступника была привлечена полиция.";
        }
    }
}
