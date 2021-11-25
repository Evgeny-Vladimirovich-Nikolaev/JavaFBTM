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
    }

    private void chooseScenario() {
        int scenario= -1;
        while ((pets.size() < 9) && (scenario < 0 || scenario > 2)) {
            NumberReceiver receiver = new NumberReceiver();
            scenario = receiver.receiveInt(AnimalsMsg.SCENARIO.getMsg());
        }

    }
}
