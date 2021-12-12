import java.util.ArrayList;
import java.util.Random;

public class RoadBlockRunner {

    public static void main(String[] args) {
        ArrayList<Crossable> crossables = new ArrayList<>(50);
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            if (random.nextBoolean()) {
                crossables.add(new CustomCarCreator().createCustomAuto());
            } else {
                crossables.add(new CustomTruckCreator().createCustomAuto());
            }
        }
        new RoadBlock(crossables).simulateCross();
    }
}
