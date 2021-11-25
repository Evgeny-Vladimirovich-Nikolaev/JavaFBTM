public class Hamster extends Animal{

    Hamster(String name) {
        this.species = "хомячок";
        this.name = name;
        this.runningLimit = 30;
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " не любит плавать.");
    }
}
