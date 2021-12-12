public class CustomCar extends CustomAuto implements Crossable {

    private int speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    CustomCar(String licensePlate,
              int speed,
              double weight,
              double width,
              double height,
              double length) {
        super(licensePlate);
        this.speed = speed;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public boolean roadBlockCross() {
        if (speed > 100) {
            throw new ExtraOverSpeedException(
                    "Экстремальное превышение скорости!",
                    speed);
        }
        if (speed > 80) {
            throw new OverSpeedException(
                    "Превышение скорости!",
                    speed);
        }
        if (weight > 8.0) {
            throw new OverWeightException(
                    "Превышение допустимой массы автомобиля!",
                    weight);
        }
        if (height > 4.0) {
            throw new OverHeightException(
                    "Превышение допустимой высоты транспортного средства!",
                    height);
        }
        if (width > 2.5) {
            throw new OverWidthException(
                    "Превышение допустимой ширины транспортного средства!",
                    width);
        }
        return true;
    }

    int getSpeed() {
        return speed;
    }

    double getWeight() {
        return weight;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    double getLength() {
        return length;
    }
}
