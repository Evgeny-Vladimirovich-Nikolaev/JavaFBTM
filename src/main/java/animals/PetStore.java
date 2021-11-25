public class PetStore {
    private Animal animal;
    private final String CHOOSE_PET = "Выберите питомца:\n" +
            "1 - Щенок\n2 - Котёнок\n3 - Крыса\n4 - Хомячок\n5 - Тигренок";

    Animal byAnimal() {
        int pet = choosePet();
        String name = getName();
        switch (pet) {
            case 1 : return new Dog(name);
            case 2 : return new Cat(name);
            case 3 : return new Rat(name);
            case 4 : return new Hamster(name);
            case 5 : return new Tiger(name);
        }
        return null;
    }

    private int choosePet() {
        NumberReceiver receiver = new NumberReceiver();
        int choice = -1;
        while (choice < 0 || choice > 5) {
            choice = receiver.receiveInt(CHOOSE_PET);
        }
        return choice;
    }

    private String getName() {
        StringReceiver receiver = new StringReceiver();
        StringBuilder sb;
        do{
            sb = new StringBuilder(
                    receiver.receive("Придумайте имя своему питомцу (не более 20 символов)."));
            if(sb.length() > 20) {
                sb.delete(20, sb.length() - 1);
            }
        } while(sb.length() == 0);
        return sb.toString();
    }
}
