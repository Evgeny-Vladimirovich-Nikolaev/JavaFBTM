public class CustomTruck  extends CustomAuto implements Crossable{

    private int speed;
    private double weight;
    private double width;
    private double height;
    private double length;

    public CustomTruck(String licensePlate) {
        super(licensePlate);
    }

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
    public void roadBlockCross() {
        if(speed > 80) {
            throw new ExtraOverSpeedException("Превышение скорости!", speed);
        }
        if(speed > 60) {
            throw new OverSpeedException("Превышение скорости!", speed);
        }
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
