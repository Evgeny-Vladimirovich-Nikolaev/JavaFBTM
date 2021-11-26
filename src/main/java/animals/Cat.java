public class Cat extends Animal {

    Cat(String name) {
        this.species = "Кот";
        this.name = name;
        this.runningLimit = 200;
    }

    @Override
    protected void swim(int metres) {
        System.out.println(name + " не умеет плавать.");
    }
}
