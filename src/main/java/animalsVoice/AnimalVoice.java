abstract public class AnimalVoice {

    private String species;

    AnimalVoice(String species) {
        this.species = species;
    }

    abstract void sing();

    String getSpecies() {
        return species;
    }
}
