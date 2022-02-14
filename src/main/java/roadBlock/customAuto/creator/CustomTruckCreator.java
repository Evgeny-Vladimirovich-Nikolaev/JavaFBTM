public class CustomTruckCreator extends CustomAutoCreator {
    CustomTruckCreator() {
        super(40,
              110,
              2.5,
              12.0,
              2.0,
              3.0,
              2.5,
              4.5,
              5.0,
              14.0);
    }

    @Override
    protected Crossable createCustomAuto() {
        initFields();
        return new CustomTruck(licensePlate, speed, weight, width, height, length);
    }
}
