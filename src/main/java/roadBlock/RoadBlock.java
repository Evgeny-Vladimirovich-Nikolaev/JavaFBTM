import java.util.ArrayList;
import java.util.List;

public class RoadBlock {

    private final static int SPEED_LIMIT = 80;
    private final static int EXTRA_SPEED_LIMIT = 100;
    private final static double WEIGHT_LIMIT = 8.0;
    private final static double HEIGHT_LIMIT = 4.0;
    private final static double WIDTH_LIMIT = 2.5;

   private List<Crossable> automobiles;

    RoadBlock() {}

    RoadBlock(ArrayList<Crossable> automobiles) {
        this.automobiles = automobiles;
    }
}
