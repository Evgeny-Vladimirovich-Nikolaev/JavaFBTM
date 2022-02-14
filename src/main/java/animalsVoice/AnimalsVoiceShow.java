public class AnimalsVoiceShow {
    private static AnimalVoice[] voices = new AnimalVoice[5];

    public static void main(String[] args) {
        fillVoices();
        beginShow();
    }

    private static void fillVoices() {
        voices[0] = new SingingCat("Кот");
        voices[1] = new SingingCow("Корова");
        voices[2] = new SingingDog("Собака");
        voices[3] = new SingingRaven("Ворона");
        voices[4] = new SingingParrot("Попугай");
    }

    private static void beginShow() {
        for (int i = 0; i < 20; i++) {
            int rnd = (int) (Math.random() * 5);
            System.out.print(voices[rnd].getSpecies() + " поет ");
            voices[rnd].sing();
        }
    }
}
