import java.util.Random;

class AutomobileRunner {

    private static Movable[] automobiles = createList();

    public static void main(String[] args) {
        run();
    }

    private static Movable[] createList() {
        automobiles = new Movable[10];
        for (int i = 0; i < 5; i++) {
            automobiles[i] = new Car(new LicenseGenerator().getNewLicense());
        }
        for (int i = 5; i < 10; i++) {
            Truck truck = new Truck(new LicenseGenerator().getNewLicense());
            truck.setLoaded(new Random().nextBoolean());
            automobiles[i] = truck;
        }
        return automobiles;
    }

    private static void run() {
        for (Movable auto : automobiles) {
            auto.move(100 + new Random().nextInt(226) * 4);
        }
    }
}

