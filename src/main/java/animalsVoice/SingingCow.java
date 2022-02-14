public class SingingCow extends AnimalVoice {
    SingingCow(String species) {
        super(species);
    }

    @Override
    void sing() {
        String voice = "Ммммууууу";
        SingingParrot.setVoice(voice);
        System.out.println(voice);
    }
}
