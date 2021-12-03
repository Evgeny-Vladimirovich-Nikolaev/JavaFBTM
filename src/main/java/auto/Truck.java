public final class Truck extends Automobile{

    private final static int maxDistance = 1200;
    private final static double loadedCoef = 1.5;
    private boolean isLoaded;

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    @Override
    public void move(int distance) {
        if(!isLoaded) {
            isArrived = distance <= maxDistance;
        } else {
            isArrived = distance <= (int) (maxDistance / loadedCoef);
        }
        writeReport(distance);
    }

    @Override
    void writeReport(int distance) {
        if(isArrived) {
            System.out.printf(
                    "Грузовой автомобиль c номером %s успешно предолел дистанцию в %s км."
                    + licensePlate
                    + distance);
        } else if (!isLoaded) {
            System.out.printf(
                    "Грузовой автомобиль с номером %s не доехал %s км до заданной дистанции."
                            + licensePlate
                            + (distance - maxDistance));
        } else {
            System.out.printf(
                    "Грузовой автомобиль с номером %s не доехал %s км до заданной дистанции."
                            + licensePlate
                            + (distance - (int) maxDistance / loadedCoef));
        }
    }
}
