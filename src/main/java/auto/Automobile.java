public abstract class Automobile {

    protected final String licensePlate;        // регистрационный номер
    protected boolean isArrived;                // преодолена ли заданная дистанция

    public Automobile(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    protected abstract void move (int distance);        // ехать

    abstract void writeReport(int distance);  // создать отчёт
}
