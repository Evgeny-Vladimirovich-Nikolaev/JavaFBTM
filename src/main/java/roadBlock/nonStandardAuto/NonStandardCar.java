public class NonStandardCar extends Automobile implements Crossable{

    public NonStandardCar(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public boolean roadBlockCross(int speed) {
        if(speed > 80) {
            throw new ExtraOverSpeedException("Превышение скорости!", speed);
        }
        if(speed > 60) {
            throw new OverSpeedException("Превышение скорости!", speed);
        }
        return true;
    }
}
