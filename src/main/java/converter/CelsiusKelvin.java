public class CelsiusKelvin implements Convertible{

    @Override
    public int convert(int sourceScale, boolean direction) {
        if(direction)  {
            return (int) (Math.round(sourceScale + ConvertCf.CELS_KEL.getCf()));
        } else {
            return (int) (Math.round(sourceScale - ConvertCf.CELS_KEL.getCf()));
        }
    }
}
