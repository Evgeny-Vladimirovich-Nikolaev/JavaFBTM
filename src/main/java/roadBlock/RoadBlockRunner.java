import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoadBlockRunner {

    public static void main(String[] args) {
        List<Crossable> auto = new ArrayList<>(50);
        for(int i = 0; i  < 50; i++) {
            System.out.println(new Random().nextInt(1, 2));
            }

            /*boolean isCrossed = false;
            Crossable nonStandardCar = new CustomCar(new LicenseGenerator().getNewLicense());
            try{
                nonStandardCar.roadBlockCross(i);
                isCrossed = true;
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
                System.out.println(nonStandardCar1.getLicensePlate() + " " + isCrossed);
            }*/
        }




    private static Crossable createCar() {
        return new CustomCar(new LicenseGenerator().getNewLicense());
    }
}
