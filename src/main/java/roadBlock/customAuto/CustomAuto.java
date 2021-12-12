public abstract class CustomAuto {

    private final String licensePlate;

    protected CustomAuto(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    String getLicensePlate() {
        return licensePlate;
    }

    abstract int getSpeed();
    abstract double getWeight();
    abstract double getWidth();
    abstract double getHeight();
    abstract double getLength();
}
