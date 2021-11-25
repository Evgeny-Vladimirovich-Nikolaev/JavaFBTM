public class PetStore {
    private Animal animal;
    private final String CHOOSE_PET = """
            Выберите питомца:
            1 - Щенок
            2 - Котёнок
            3 - Крыса
            4 - Хомячок
            5 - Тигренок
            0 - Выйти из магазина""";

    Animal byAnimal() {
        String name = new String();
        int pet = choosePet();
        if (pet != 0) {
            name = getName();
        }
        return switch (pet) {
            case 1 -> new Dog(name);
            case 2 -> new Cat(name);
            case 3 -> new Rat(name);
            case 4 -> new Hamster(name);
            case 5 -> new Tiger(name);
            default -> null;
        };
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
        do {
            sb = new StringBuilder(
                    receiver.receive("Придумайте имя своему питомцу (не более 20 символов)."));
            if (sb.length() > 20) {
                sb.delete(20, sb.length() - 1);
            }
        } while (sb.length() == 0);
        return sb.toString();
    }
}
