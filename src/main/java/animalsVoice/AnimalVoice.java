public class AnimalVoice {

    private String species;

    AnimalVoice(String species) {
        this.species = species;
    }

    void sing() {
        System.out.println("РррррГавШшшшшшМяу");
    }

    String getSpecies() {
        return species;
    }
}
