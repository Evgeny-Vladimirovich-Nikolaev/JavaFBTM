public enum ConvertCf {

    CELS_FAHR_ADDENDS(32.0),
    CELS_FAHR_FACTOR(1.8);

    private double cf;

    ConvertCf(double cf) {
        this.cf = cf;
    }

    double getCf() {
        return cf;
    }
}
