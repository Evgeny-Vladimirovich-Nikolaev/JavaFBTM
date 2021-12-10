import java.util.ArrayList;
import java.util.List;

public class RoadBlock {

    private static int speedLimit = 80;
    private static int extraSpeedLimit = 100;
    private static double weightLimit = 8.0;
    private static double heightLimit = 4.0;
    private static double widthLimit = 2.5;

   private List<Automobile> automobiles;

    RoadBlock() {}

    RoadBlock(ArrayList<Automobile> automobiles) {
        this.automobiles = automobiles;
    }
}
