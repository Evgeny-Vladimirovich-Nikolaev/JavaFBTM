public abstract class Automobile {

    final String licensePlate;              // регистрационный номер
    boolean isArrived;                      // преодолена ли заданная дистанция

    public Automobile(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    abstract void move(int distance);      // ехать

    abstract void writeReport(int distance);// создать отчёт
}
