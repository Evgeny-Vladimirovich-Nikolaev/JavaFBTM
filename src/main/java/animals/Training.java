import java.util.ArrayList;

public class Training {

    private ArrayList<Animal> pets;

    Training(ArrayList pets) {
        this.pets = pets;
        startTraining();
    }

    private void startTraining() {
        int choice = -1;
        while (choice < 0 || choice > pets.size()) {
            NumberReceiver numberReceiver = new NumberReceiver();
            choice = numberReceiver.receiveInt(buildMessage());
        }
    }

    private String buildMessage() {
        StringBuilder sb = new StringBuilder(AnimalsMsg.START.getMsg());
        for (Animal animal : pets) {
            sb.append(pets.indexOf(animal) + 1);
            sb.append(" - ");
            sb.append(animal.species);
            sb.append(" ");
            sb.append(animal.name);
            sb.append('\n');
        }
        sb.append(AnimalsMsg.END.getMsg());
        return sb.toString();
    }
}
