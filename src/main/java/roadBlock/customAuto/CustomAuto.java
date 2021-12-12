public abstract class CustomAuto {

    private final String licensePlate;

    protected CustomAuto(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    String getLicensePlate() {
        return licensePlate;
    }
}
