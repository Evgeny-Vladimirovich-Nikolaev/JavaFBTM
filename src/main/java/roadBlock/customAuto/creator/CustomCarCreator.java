public class CustomCarCreator extends CustomAutoCreator {

    CustomCarCreator() {
        super(40,
              140,
              0.7,
              2.5,
              1.5,
              1.8,
              1.3,
              2.4,
              3.2,
              5.1);
    }

    @Override
    protected Crossable createCustomAuto() {
        initFields();
        return new CustomCar(licensePlate, speed, weight, width, height, length);
    }
}
