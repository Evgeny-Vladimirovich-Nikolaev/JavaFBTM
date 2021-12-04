import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class CelsiusFahrenheit implements Convertible

{
    @Override
    public int convert(int sourceScale, boolean direction) {
        if(direction) {
            return (int) (Math.round(
                    sourceScale
                    * ConvertCf.CELS_FAHR_FACTOR.getCf()
                    + ConvertCf.CELS_FAHR_ADDENDS.getCf()
            ));
        } else {
            return (int) (Math.round(
                    sourceScale
                    - ConvertCf.CELS_FAHR_ADDENDS.getCf()
                    / ConvertCf.CELS_FAHR_FACTOR.getCf()
            ));
        }
    }

    @Override
    public int[] convert(int sourceScale[], boolean direction) {
        if(sourceScale.length != 2) {
            return null;
        }
        return new int[0];
    }
}
