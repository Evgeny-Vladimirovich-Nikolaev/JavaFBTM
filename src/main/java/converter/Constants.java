public enum Constants {

    CELS_FAHR_ADDENDS(32.0),
    CELS_FAHR_FACTOR(1.8),
    CELS_KEL(273.15);

    private double cf;

    Constants(double cf) {
        this.cf = cf;
    }

    double getCf() {
        return cf;
    }
}
