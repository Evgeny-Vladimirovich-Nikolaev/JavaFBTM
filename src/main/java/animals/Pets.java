import java.util.ArrayList;
public class Pets {

    private ArrayList<Animal> pets = new ArrayList<>();

    protected void runPets() {
        fillAnimalList();
        showList();
        start();
    }

    private void fillAnimalList() {
        pets.add(new Dog("Бобик"));
        pets.add(new Cat("Мурзик"));
        pets.add(new Tiger("Ричард"));
    }

    private void showList() {
        StringBuilder sb = new StringBuilder(AnimalsMsg.SHOW.getMsg());
        for (Animal animal : pets) {
            sb.append(animal.getSpecies());
            sb.append(" ");
            sb.append(animal.getName());
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private void start() {
        while (chooseScenario()) ;
    }

    private boolean chooseScenario() {
        int scenario = -1;
        if (pets.size() < 9) {
            while (scenario < 0 || scenario > 2) {
                NumberReceiver receiver = new NumberReceiver();
                scenario = receiver.receiveInt(AnimalsMsg.SCENARIO_1.getMsg());
            }
        } else {
            while (scenario < 0 || scenario > 1) {
                NumberReceiver receiver = new NumberReceiver();
                scenario = receiver.receiveInt(AnimalsMsg.SCENARIO_2.getMsg());
            }
        }
        implementScenario(scenario);
        return scenario != 0;
    }

    private void implementScenario(int scenario) {
        switch (scenario) {
            case 1 -> new Training(pets).train();
            case 2 -> addPet();
        }
    }

    private void addPet() {
        Animal animal = new PetStore().byAnimal();
        if (animal != null) {
            pets.add(animal);
        }
        showList();
    }
}
