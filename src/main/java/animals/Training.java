import java.util.ArrayList;

public class Training {

    private ArrayList<Animal> petsList;
    private NumberReceiver numberReceiver = new NumberReceiver();

    Training(ArrayList<Animal> petsList) {
        this.petsList = petsList;
    }

    protected void train() {
        while (chooseParticipant()) ;
    }

    private boolean chooseParticipant() {
        int choice = -1;
        while (choice < 0 || choice > petsList.size()) {
            choice = numberReceiver.receiveInt(buildList());
        }
        if (choice != 0) {
            giveTask(choice);
        }
        return choice != 0;
    }

    private String buildList() {
        StringBuilder sb = new StringBuilder(AnimalsMsg.START.getMsg());
        for (Animal animal : petsList) {
            sb.append(petsList.indexOf(animal) + 1);
            sb.append(" - ");
            sb.append(animal.getSpecies());
            sb.append(" ");
            sb.append(animal.getName());
            sb.append('\n');
        }
        sb.append(AnimalsMsg.END.getMsg());
        return sb.toString();
    }

    private void giveTask(int listItem) {
        int task = -1;
        while (task < 0 || task > 3) {
            task = numberReceiver.receiveInt(AnimalsMsg.TASK.getMsg());
        }
        if (task != 0) {
            giveDistance(listItem, task);
        }
    }

    private void giveDistance(int listItem, int task) {
        int distance = 0;
        while (distance < 1) {
            distance = numberReceiver.receiveInt(AnimalsMsg.DISTANCE.getMsg());
            if (distance < 1) {
                System.out.println(AnimalsMsg.ERROR_DISTANCE.getMsg());
            }
        }
        start(listItem, task, distance);
    }

    private void start(int listItem, int task, int distance) {
        Animal animal = petsList.get(listItem - 1);
        if (task == 1) {
            animal.run(distance);
        } else {
            animal.swim(distance);
        }
    }
}
