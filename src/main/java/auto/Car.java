public final class Car extends Automobile {

    private final static int maxDistance = 500;

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void move(int distance) {
        isArrived = (distance <= maxDistance);
        writeReport(distance);
    }

    @Override
    void writeReport(int distance) {
        if (isArrived) {
            System.out.printf(
                    "Легковой автомобиль с номером %s успешно преодолел дистанцию в %s км.\n",
                    getLicensePlate(),
                    distance);
        } else {
            System.out.printf(
                    "Легковой автомобиль с номером %s не доехал %s км до заданной дистанции.\n",
                    getLicensePlate(),
                    (distance - maxDistance));
        }
    }
}
