public class Cat extends Animal {

    Cat(String name) {
        super("Кот", name, 200, 0);
    }

    @Override
    protected void swim(int metres) {
        System.out.println(this.getName() + " не умеет плавать.");
    }
}
