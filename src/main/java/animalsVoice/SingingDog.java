public class SingingDog extends AnimalVoice {
    SingingDog(String species) {
        super(species);
    }

    @Override
    void sing() {
        String voice = "Гхав";
        SingingParrot.setVoice(voice);
        System.out.println(voice);
    }
}
