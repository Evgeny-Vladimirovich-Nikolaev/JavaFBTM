import java.text.MessageFormat;
public class CelsiusFahrenheit extends Converter implements Convertible

{
    CelsiusFahrenheit (boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if(direction) {
            if(sourceScale < -273) {
                throw new IllegalArgumentException(MessageFormat.format(
                        Msg.DATA_ERROR.getMsg(),
                        Msg.CEL.getMsg(),
                        ConvertCf.CEL_MIN.getCf())
                );
            }
            return (int) (Math.round(
                    sourceScale
                    * ConvertCf.CELS_FAHR_FACTOR.getCf()
                    + ConvertCf.CELS_FAHR_ADDENDS.getCf()
            ));
        } else {
            if (sourceScale < -460) {
                throw new IllegalArgumentException(MessageFormat.format(
                        Msg.DATA_ERROR.getMsg(),
                        Msg.FAHR.getMsg(),
                        ConvertCf.FAHR_MIN.getCf())
                );
            }
            return (int) (Math.round(
                    sourceScale
                    - ConvertCf.CELS_FAHR_ADDENDS.getCf()
                    / ConvertCf.CELS_FAHR_FACTOR.getCf()
            ));
        }
    }
}