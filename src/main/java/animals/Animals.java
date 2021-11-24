public class Animals {

    public static void main(String[] args) {
        Animal bobik = new Dog("Бобик");
        Animal murzik = new Cat("Мурзик");
        bobik.run(300);
        bobik.swim(5);
        murzik.run(150);
        bobik.run(300);
        murzik.swim(1);
        bobik.swim(2);
        murzik.run(70);
        murzik.run(20);
    }
}
