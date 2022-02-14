public abstract class Automobile {
    private final String licensePlate;              // регистрационный номер
    private boolean isArrived;                      // преодолена ли заданная дистанция

    public Automobile(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    protected void setArrived(boolean arrived) {
        isArrived = arrived;
    }

    boolean isArrived() {
        return isArrived;
    }

    String getLicensePlate() {
        return licensePlate;
    }
}
