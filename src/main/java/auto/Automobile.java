public abstract class Automobile {

    private final String licensePlate;              // регистрационный номер
    boolean isArrived;                      // преодолена ли заданная дистанция

    public Automobile(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    String getLicensePlate() {
        return licensePlate;
    }

    abstract void move(int distance);      // ехать

    abstract void writeReport(int distance);// создать отчёт
}
