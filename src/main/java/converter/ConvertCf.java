public enum ConvertCf {

    CELS_FAR(32.8);

    private double cf;

    ConvertCf(double cf) {
        this.cf = cf;
    }

    double getCf() {
        return cf;
    }
}
