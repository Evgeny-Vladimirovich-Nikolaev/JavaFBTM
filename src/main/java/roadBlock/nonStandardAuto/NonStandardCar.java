public class NonStandardCar extends Automobile{
    public NonStandardCar(String licensePlate) {
        super(new LicenseGenerator().getNewLicense());
    }
}
