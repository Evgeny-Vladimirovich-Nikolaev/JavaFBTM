public abstract class Converter {

    protected boolean direction;

    public Converter( boolean direction) {
        this.direction = direction;
    }

    public boolean getDirection() {
        return direction;
    }
}
