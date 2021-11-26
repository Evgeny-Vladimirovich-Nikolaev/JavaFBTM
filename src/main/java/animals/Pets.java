import java.util.ArrayList;

public class Pets {

    private ArrayList<Animal> pets = new ArrayList<>();

    Pets() {
        fillAnimalList();
        chooseScenario();
    }

    private void fillAnimalList() {
        if(pets.isEmpty()) {
            pets.add(new Dog("Бобик"));
            pets.add(new Cat("Мурзик"));
            pets.add(new Tiger("Ричард"));
        }
        show();
    }

    private void show() {
        StringBuilder sb = new StringBuilder(AnimalsMsg.SHOW.getMsg());
        for (Animal animal : pets) {
            sb.append(animal.species);
            sb.append(" ");
            sb.append(animal.name);
            sb.append('\n');
        }
    }

    private void chooseScenario() {
        int scenario= -1;
        if(pets.size() < 9) {
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
    }

    private void implementScenario(int scenario) {
        switch (scenario) {
            case 1 : new Training(pets);
            break;
            case 2 : addPet();
            break;
        }
    }

    private void addPet() {
        Animal animal = new PetStore().byAnimal();
        if(animal != null) {
            pets.add(animal);
        }
        show();
    }
}
