public class PetStore {
    Animal byAnimal() {
        String name = new String();
        int pet = choosePet();
        if (pet != 0) {
            name = createName();
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
            choice = receiver.receiveInt(AnimalsMsg.CHOOSE_PET.getMsg());
        }
        return choice;
    }

    private String createName() {
        StringReceiver receiver = new StringReceiver();
        StringBuilder sb;
        do {
            sb = new StringBuilder(
                    receiver.receive(AnimalsMsg.SET_NAME.getMsg()));
            if (sb.length() > 20) {
                sb.delete(20, sb.length() - 1);
            }
        } while (sb.length() == 0);
        return sb.toString();
    }
}
