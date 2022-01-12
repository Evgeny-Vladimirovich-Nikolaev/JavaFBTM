public class A {

    private String name;

    A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void showName() {
        System.out.println(name);
    }

    public void printSelf() {
        System.out.println("printSelf() from class A");
    }

    public void printName() {
        System.out.println(getClass().getName());
    }
}
