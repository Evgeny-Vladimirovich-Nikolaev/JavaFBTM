import java.text.MessageFormat;
public class CelsiusKelvin extends Converter implements Convertible {

    CelsiusKelvin(boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if (direction) {
            if (sourceScale < -273) {
                throw new IllegalArgumentException(MessageFormat.format(
                        Msg.DATA_ERROR.getMsg(),
                        Msg.CEL.getMsg(),
                        ConvertCf.CEL_MIN.getCf())
                );
            }
            return (int) (Math.round(sourceScale + ConvertCf.CELS_KEL.getCf()));
        } else {
            if (sourceScale < 0) {
                throw new IllegalArgumentException(MessageFormat.format(
                        Msg.DATA_ERROR.getMsg(),
                        Msg.KEL.getMsg(),
                        ConvertCf.KEL_MIN.getCf())
                );
            }
            return (int) (Math.round(sourceScale - ConvertCf.CELS_KEL.getCf()));
        }
    }
}