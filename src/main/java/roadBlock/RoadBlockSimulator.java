import java.util.ArrayList;
import java.util.Random;

public class RoadBlockSimulator {

    private ArrayList<Crossable> crossables = new ArrayList<>(50);

    void initSimulation() {
        fillList();
        startCross();
    }

    private void fillList() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            if (random.nextBoolean()) {
                crossables.add(new CustomCarCreator().createCustomAuto());
            } else {
                crossables.add(new CustomTruckCreator().createCustomAuto());
            }
        }
    }

    private void startCross() {
        RoadBlock roadBlock = new RoadBlock();
        for (Crossable crossable : crossables) {
            boolean isCrossed = false;
            try {
                isCrossed = roadBlock.simulateCross(crossable);
            } catch (ExtraOverSpeedException extraSpeed){
                System.out.println(extraSpeed);
            } catch(OverSpeedException | OverWeightException | OverHeightException | OverWidthException exc){
                System.out.println(exc);
            } finally {
                writeMessage(crossable, isCrossed);
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
