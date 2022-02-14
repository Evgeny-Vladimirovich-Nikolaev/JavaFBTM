public class SingingCat extends AnimalVoice {
    SingingCat(String species) {
        super(species);
    }

    @Override
    void sing() {
        String voice = "Мяяяяоoуууу";
        SingingParrot.setVoice(voice);
        System.out.println(voice);
    }
}
