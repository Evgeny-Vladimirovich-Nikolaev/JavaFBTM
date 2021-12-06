public class KelvinFahrenheit extends Converter implements Convertible {

    KelvinFahrenheit (boolean direction) {
        super(direction);
    }

    @Override
    public int convert(int sourceScale) {
        if(direction) {
            return (int) (Math.round(
                    ConvertCf.CELS_FAHR_FACTOR.getCf()
                            * (sourceScale - ConvertCf.CELS_KEL.getCf())
                            + ConvertCf.CELS_FAHR_ADDENDS.getCf()
            ));
        } else {
            return (int) (Math.round(
                    (sourceScale - ConvertCf.CELS_FAHR_ADDENDS.getCf())
                            / ConvertCf.CELS_FAHR_FACTOR.getCf()
                            +ConvertCf.CELS_KEL.getCf()
            ));
        }
    }
}