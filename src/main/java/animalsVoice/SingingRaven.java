public class SingingRaven extends AnimalVoice {
    SingingRaven(String species) {
        super(species);
    }

    @Override
    void sing() {
        String voice = "Карррр";
        SingingParrot.setVoice(voice);
        System.out.println(voice);
    }
}
