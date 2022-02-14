public final class Truck extends Automobile implements Movable {
    private final static int maxDistance = 1200;
    private final static double loadedCoef = 1.5;   // коэффициент расхода топлива
    // при полной загрузке
    private boolean isLoaded;                       // загружен?

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    @Override
    public void move(int distance) {
        if (!isLoaded) {
            setArrived(distance <= maxDistance);
        } else {
            setArrived(distance <= (int) (maxDistance / loadedCoef));
        }
        writeReport(distance);
    }

    @Override
    public void writeReport(int distance) {
        if (isArrived()) {
            System.out.printf(
                    "Грузовой автомобиль c номером %s успешно предолел дистанцию в %s км.\n",
                    getLicensePlate(),
                    distance);
        } else if (!isLoaded) {
            System.out.printf(
                    "Грузовой автомобиль с номером %s не доехал %s км до заданной дистанции.\n",
                    getLicensePlate(),
                    (distance - maxDistance));
        } else {
            System.out.printf(
                    "Грузовой автомобиль с номером %s не доехал %s км до заданной дистанции.\n",
                    getLicensePlate(),
                    (distance - (int) (maxDistance / loadedCoef)));
        }
    }
}
