public class Hamster extends Animal {
    Hamster(String name) {
        super("Хомяк", name, 30, 0);
    }

    @Override
    protected void swim(int distance) {
        System.out.println(this.getName() + " не любит плавать.");
    }
}
