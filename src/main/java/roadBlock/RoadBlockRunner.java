import java.util.ArrayList;
import java.util.List;

public class RoadBlockRunner {

    public static void main(String[] args) {
        boolean arrived = true;
        List<Automobile> auto = new ArrayList<>(10);
        for(int i = 55; i  < 150; i += 5) {
            Crossable nonStandardCar = new NonStandardCar(new LicenseGenerator().getNewLicense());
            try{
                arrived = nonStandardCar.roadBlockCross(i);
            } catch (ExtraOverSpeedException e) {
                System.out.println("-----------------------");
                System.out.println("-----------------------");
                System.out.println("-----------------------");
                System.out.println(e);
                System.out.println("Для поимки преступника привлечена полиция. Водитель задержан, автомобиль арестован. ");

            } catch(OverSpeedException e) {
                System.out.println("-----------------------");
                System.out.println("-----------------------");
                System.out.println("-----------------------");
                System.out.println(e);
                System.out.println("Автомобиль задержан на КПП");

            } finally {
                Automobile nonStandardCar1 = (Automobile) nonStandardCar;
                System.out.println(nonStandardCar1.getLicensePlate() + " " + arrived);
            }
        }
    }
}
