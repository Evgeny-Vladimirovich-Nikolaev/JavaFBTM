import java.util.ArrayList;
import java.util.List;

public class RoadBlock {

    private static int speedLimit = 80;
    private static int extraSpeedLimit = 100;
    private static double weightLimit = 8.0;
    private static double heightLimit = 4.0;
    private static double widthLimit = 2.5;

    private List<Crossable> crossables;

    RoadBlock(ArrayList<Crossable> crossables) {
        this.crossables = crossables;
    }

    void simulateCross() {
        for (Crossable crossable : crossables) {
            boolean isCross = false;
            try {
                isCross = crossable.roadBlockCross();
            } catch (ExtraOverSpeedException extraSpeed) {
                System.out.println(extraSpeed);
            } catch (OverSpeedException | OverWeightException | OverHeightException | OverWidthException exc) {
                System.out.println(exc);
            } finally {
                writeMessage(crossable, isCross);
            }
        }
    }

    private void writeMessage(Crossable crossable, boolean isCross) {
        StringBuilder msg;
        CustomAuto customAuto;
        if (crossable.getClass().getName().equals("CustomCar")) {
            msg = new StringBuilder("Легковой автомобиль с регистрационным номером ");
            customAuto = (CustomCar) crossable;
        } else {
            msg = new StringBuilder("Грузовой автомобиль с регистрационным номером ");
            customAuto = (CustomTruck) crossable;
        }
        msg.append(customAuto.getLicensePlate());
        if (isCross) {
            msg.append(" проехал КПП.\n");
        } else {
            msg.append(" не проехал КПП.\n");
        }
        msg.append(getDetails(customAuto));
        msg.append("\n----------------------------------------------------------------------");
        System.out.println(msg);
    }

    private String getDetails(CustomAuto customAuto) {
        StringBuilder sb = new StringBuilder("Отчет\nСкорость: ");
        sb.append(customAuto.getSpeed());
        sb.append(" км/ч\nВес: ");
        sb.append(customAuto.getWeight());
        sb.append(" т\nШирина: ");
        sb.append(customAuto.getWidth());
        sb.append(" м\nВысота: ");
        sb.append(customAuto.getHeight());
        sb.append(" м\nДлина: ");
        sb.append(customAuto.getLength());
        sb.append(" м");
        return sb.toString();
    }
}
