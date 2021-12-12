public class CustomTruck  extends CustomAuto implements Crossable{

    private int speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    public CustomTruck(String licensePlate,
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
        if(speed > 100) {
            throw new ExtraOverSpeedException(
                    "Экстремальное превышение скорости!",
                    speed);
        }
        if(speed > 80) {
            throw new OverSpeedException(
                    "Превышение скорости!",
                    speed);
        }
        if(weight > 8.0) {
            throw new OverWeightException(
                    "Превышение допустимой массы автомобиля!",
                    weight);
        }
        if(height > 4.0) {
            throw new OverHeightException(
                    "Превышение допустимой высоты транспортного средства!",
                    height);
        }
        if(width > 2.5) {
            throw new OverWidthException(
                    "Превышение допустимой ширины транспортного средства!",
                    width);
        }
        return true;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
