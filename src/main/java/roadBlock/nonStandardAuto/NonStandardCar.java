public class NonStandardCar extends Automobile implements Crossable{
    public NonStandardCar(String licensePlate) {
        super(new LicenseGenerator().getNewLicense());
    }

    @Override
    public boolean roadBlockCross(int speed) {
        return true;
    }
}
