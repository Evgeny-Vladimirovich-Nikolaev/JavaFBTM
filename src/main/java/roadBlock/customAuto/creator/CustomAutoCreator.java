import java.util.Random;

public abstract class CustomAutoCreator {

    private LicenseGenerator licenseGenerator = new LicenseGenerator();
    private int speedMin;
    private int speedMax;
    private double weightMin;
    private double weightMax;
    private double widthMin;
    private double widthMax;
    private double heightMin;
    private double heightMax;
    private double lengthMin;
    private double lengthMax;

    protected String licensePlate;
    protected int speed;
    protected double weight;
    protected double width;
    protected double height;
    protected double length;

    protected CustomAutoCreator(int speedMin,
                                int speedMax,
                                double weightMin,
                                double weightMax,
                                double widthMin,
                                double widthMax,
                                double heightMin,
                                double heightMax,
                                double lengthMin,
                                double lengthMax) {
        this.speedMin = speedMin;
        this.speedMax = speedMax;
        this.weightMin = weightMin;
        this.weightMax = weightMax;
        this.widthMin = widthMin;
        this.widthMax = widthMax;
        this.heightMin = heightMin;
        this.heightMax = heightMax;
        this.lengthMin = lengthMin;
        this.lengthMax = lengthMax;
    }

    protected abstract Crossable createCustomAuto();

    protected void initFields() {
        String licensePlate = licenseGenerator.getNewLicense();
        int speed = initSpeed();
        double weight = initDouble(weightMin, weightMax);
        double width = initDouble(widthMin, widthMax);
        double height = initDouble(heightMin, heightMax);
        double length = initDouble(lengthMin, lengthMax);
    }

    private int initSpeed() {
        return new Random().nextInt(speedMin, speedMax + 1);
    }

    private double initDouble(double min, double max) {
        int m = (int) (Math.round(min * 10));
        int n = (int) (Math.round(max * 10));
        return (double) (new Random().nextInt(m, n + 1)) / 10;
    }

}
