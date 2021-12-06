public class CelsiusKelvin extends Converter implements Convertible{

    CelsiusKelvin (boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if(direction)  {
            return (int) (Math.round(sourceScale + ConvertCf.CELS_KEL.getCf()));
        } else {
            return (int) (Math.round(sourceScale - ConvertCf.CELS_KEL.getCf()));
        }
    }
}