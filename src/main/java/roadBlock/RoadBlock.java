import java.util.ArrayList;
import java.util.List;

public class RoadBlock {

    private List<Crossable> crossables;

    RoadBlock(ArrayList<Crossable> crossables) {
        this.crossables = crossables;
    }

    void simulateCross() {
        for (Crossable crossable : crossables) {
            boolean isCross = false;
            try {
                isCross = crossable.roadBlockCross();
            } catch (ExtraOverSpeedException e) {
                System.out.println(e);
            } catch (OverSpeedException e) {
                System.out.println(e);
            } catch (OverWeightException e) {
                System.out.println(e);
            } catch (OverHeightException e) {
                System.out.println(e);
            } catch (OverWidthException e) {
                System.out.println(e);
            } finally {
                writeMessage(crossable, isCross);
                if (isCross) {
                    System.out.println(crossable.getClass() + " " + isCross);
                } else {
                    System.out.println(crossable.getClass() + " " + isCross);
                }
            }
        }
    }

    private void writeMessage(Crossable crossable, boolean isCross) {
        String autoType;
        CustomAuto customAuto;
        if (crossable.getClass().getName().equals("CustomCar")) {
            autoType = "Легковой автомобиль";
            customAuto = (CustomCar) crossable;
        } else {
            autoType = "Грузовой автомобиль";
            customAuto = (CustomTruck) crossable;
        }
        System.out.println(autoType + " " + customAuto.getLicensePlate());
    }
}
