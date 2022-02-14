public class SingingParrot extends AnimalVoice {
    static private String parrotVoice = "Сам дуррак!";

    SingingParrot(String species) {
        super(species);
    }

    static void setVoice(String voice) {
        parrotVoice = voice;
    }

    @Override
    void sing() {
        System.out.println(parrotVoice);
    }
}
