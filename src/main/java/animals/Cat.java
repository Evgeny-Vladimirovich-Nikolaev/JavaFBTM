public class Cat<swim> extends Animal{

    Cat(String name) {
        this.species = "кот";
        this.name = name;
        this.runningLimit = 200;
    }

    @Override
    protected void swim(int metres) {
        System.out.println(name + " не умеет плавать.");
    }
}
