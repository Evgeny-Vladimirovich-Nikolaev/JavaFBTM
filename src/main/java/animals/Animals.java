public class Animals {

    public static void main(String[] args) {

        Animal animal = new PetStore().byAnimal();
        if(animal != null) {
            System.out.println(animal.species + " " + animal.name);
        }

    }
}
