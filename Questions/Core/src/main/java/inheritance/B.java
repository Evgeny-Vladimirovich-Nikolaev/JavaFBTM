public class B extends A{

    B(String name) {
        super(name);
    }

    @Override
    public void showName() {
        System.out.println("In class B name - " + getName());
    }

    public void printOwn() {
        System.out.println("Method was calling from class B");
    }
}
