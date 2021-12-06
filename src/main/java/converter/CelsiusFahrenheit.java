import java.text.MessageFormat;

public class CelsiusFahrenheit extends Converter implements Convertible

{
    CelsiusFahrenheit (boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if(sourceScale < -273) {
            throw new IllegalArgumentException(
                    MessageFormat.format(Msg.DATA_ERROR.getMsg(), "Цельсия", -273));

        }
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
}