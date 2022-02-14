public class RoadBlock {

    private static final int EXTRA_SPEED_LIMIT = 100;
    private static final int SPEED_LIMIT = 80;
    private static final double WEIGHT_LIMIT = 8.0;
    private static final double HEIGHT_LIMIT = 4.0;
    private static final double WIDTH_LIMIT = 2.5;

    boolean simulateCross(Crossable crossable) {
        CustomAuto customAuto = (CustomAuto) crossable;
        if (customAuto.getSpeed() > EXTRA_SPEED_LIMIT) {
            throw new ExtraOverSpeedException(
                    "Экстремальное превышение скорости!",
                    customAuto.getSpeed());
        }
        if (customAuto.getSpeed() > SPEED_LIMIT) {
            throw new OverSpeedException(
                    "Превышение скорости!",
                    customAuto.getSpeed());
        }
        if (customAuto.getWeight() > WEIGHT_LIMIT) {
            throw new OverWeightException(
                    "Превышение допустимой массы автомобиля!",
                    customAuto.getWeight());
        }
        if (customAuto.getHeight() > HEIGHT_LIMIT) {
            throw new OverHeightException(
                    "Превышение допустимой высоты транспортного средства!",
                    customAuto.getHeight());
        }
        if (customAuto.getWidth() > WIDTH_LIMIT) {
            throw new OverWidthException(
                    "Превышение допустимой ширины транспортного средства!",
                    customAuto.getWidth());
        }
        return crossable.roadBlockCross();
    }
}
