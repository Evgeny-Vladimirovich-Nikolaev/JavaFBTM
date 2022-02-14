import java.text.MessageFormat;
public class KelvinFahrenheit extends Converter implements Convertible {

    KelvinFahrenheit(boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if (direction) {
            if (sourceScale < 0) {
                throw new IllegalArgumentException(MessageFormat.format(
                        Msg.DATA_ERROR.getMsg(),
                        Msg.KEL.getMsg(),
                        ConvertCf.KEL_MIN.getCf())
                );
            }
            return (int) (Math.round(
                    ConvertCf.CELS_FAHR_FACTOR.getCf()
                    * (sourceScale - ConvertCf.CELS_KEL.getCf())
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
                    (sourceScale - ConvertCf.CELS_FAHR_ADDENDS.getCf())
                    / ConvertCf.CELS_FAHR_FACTOR.getCf()
                    + ConvertCf.CELS_KEL.getCf()
            ));
        }
    }
}